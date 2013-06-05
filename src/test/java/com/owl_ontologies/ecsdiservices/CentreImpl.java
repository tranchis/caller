/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owl_ontologies.ecsdiservices;

import java.util.Random;

import com.owl_ontologies.ecsdiservices0.CitaType;

/**
 *
 * @author clara
 */
public class CentreImpl {
    
    public ConjuntResultatsType obtenirResultatsCita(CitaType citaObtenirResultatsCitaCentre1) {
        //TODO implement this method
        return new ConjuntResultatsType();
    }

    public ConjuntOfertesType demanarDisponibilitat(Object tipusProvaAnalisi, 
            ConjuntRestriccionsType restriccionsAnalisi) {
        //TODO implement this method
        ConjuntOfertesType conjuntOfertes = new ConjuntOfertesType();
        Random random = new Random();
        while (random.nextInt(5) != 0) {
            Oferta oferta = new Oferta();
            conjuntOfertes.getOfereix().add(oferta);
        }
        return conjuntOfertes;
    }
}
