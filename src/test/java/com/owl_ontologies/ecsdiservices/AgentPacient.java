/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owl_ontologies.ecsdiservices;

import com.github.tranchis.caller.Caller;
import com.owl_ontologies.ecsdiservices0.CitaType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author clara
 */
public class AgentPacient {
    
    private Random random = new Random();
    private PacientType pacient = new PacientType();
    private static final Object[] possibilitatsProves = {
        new AnalisiType(),
        new AnalisiDeOrinaType()};
    private static final Object[] possibilitatsTractaments = {
        new ColonoscopiaType(),
        new CirurgiaType()};
    private static final Object[] possibilitatsProfessionalsSanitaris = {
        new EspecialistaType(),
        new EspecialistaAnestesistaType()};
    private static final String asseguradoraService =
            "http://localhost:8080/ECSDI2/Asseguradora1PortTypeService?WSDL#LlistaCentresDeSalut";
    private static final String reservesService =
            "http://localhost:8080/ECSDI2/ReservesPortTypeService?WSDL#ReservaVisita";
    
    private Map<Class, String> correspondencies;
    
    private void init() {
        correspondencies = new HashMap<Class, String>();
        correspondencies.put(AnalisiDeOrinaType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Analisi_de_orina");
        correspondencies.put(AnalisiType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Analisi");
        correspondencies.put(ColonoscopiaType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Colonoscopia");
        correspondencies.put(CirurgiaType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Cirurgia");
        correspondencies.put(EspecialistaAnestesistaType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Especialista_anestesista");
        correspondencies.put(EspecialistaType.class, "http://www.owl-ontologies.com/ECSDIOntology.owl#Especialista");
    }

    public void executaHistoria() {
        init();
        
        // Visita inicial
        programaVisitaProfessional();
        
        // Tractaments, proves i visites a l'atzar
        while (random.nextInt(5) != 0) {
            int opcio = random.nextInt(3);
            switch (opcio) {
                case 0: programaProva();
                    break;
                case 1: programaTractament();
                    break;
                default: programaVisitaProfessional();
                    break;
            }
        }
        
        // Visita final
        programaVisitaProfessional();
    }
    
    private void programaProva() {
        // Escollir prova
        int possIndex = random.nextInt(possibilitatsProves.length);
        Object accio = possibilitatsProves[possIndex];
        programaVisita(accio);
    }
    
    private void programaTractament() {
        // Escollir prova
        int possIndex = random.nextInt(possibilitatsTractaments.length);
        Object accio = possibilitatsTractaments[possIndex];
        programaVisita(accio);
    }
    
    private void programaVisitaProfessional() {
        // Escollir prova
        int possIndex = random.nextInt(possibilitatsProfessionalsSanitaris.length);
        Object accio = possibilitatsProfessionalsSanitaris[possIndex];
        programaVisita(accio);
    }
    
    private void programaVisita(Object accio) {
        // Obtenir serveis
        ConjuntCentresType centres = obtenirPossibilitats(accio);

        // Escollir servei
        List<CentreDeSalut> possibilitats = centres.getAutoritzaElsCentres();
        int indexEscollit = random.nextInt(possibilitats.size());
        System.out.println("\nServei escollit: " + possibilitats.get(indexEscollit).getURLServeiDisponibilitat());
        
        // Demanar disponibilitat al centre escollit
        ConjuntOfertesType ofertes = obtenirDisponibilitats(possibilitats.get(indexEscollit), accio);
        
        // Escollir oferta a random
        List<Oferta> ofertesRebudes = ofertes.getOfereix();
        int ofertaEscollida = random.nextInt(ofertesRebudes.size());
        
        // Obtenir cita
        CitaType cita = reservarCita(ofertesRebudes.get(ofertaEscollida));
        System.out.println("Cita reservada correctament.");
    }

    private ConjuntCentresType obtenirPossibilitats(Object accio) {
        Caller c = new Caller();
        Object centres = c.callService(
                asseguradoraService,
                new Object[]{new ConjuntRestriccionsType(), pacient, "http://www.owl-ontologies.com/ECSDIOntology.owl#Analisi_de_orina"},
                ConjuntCentresType.class);
        System.out.println("Rebut el conjunt de centres: " + centres.toString());

        return (ConjuntCentresType) centres;
    }

    private ConjuntOfertesType obtenirDisponibilitats(CentreDeSalut centre, Object accio) {
        Caller c = new Caller();
        // TODO: comprovar que es .getService()
        // String centreService = centre.get....
        Object result = c.callService(
                reservesService,
                new Object[]{accio, new ConjuntRestriccionsType()},
                ConjuntOfertesType.class);

        return (ConjuntOfertesType) result;
    }

    private CitaType reservarCita(Oferta oferta) {
        Caller c = new Caller();
        // TODO: comprovar que es .getService()
        Object result = c.callService(
                reservesService,
                new Object[]{pacient, oferta},
                CitaType.class);

        return (CitaType) result;
    }
}
