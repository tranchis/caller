package com.github.tranchis.caller.test;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Test;

import com.github.tranchis.caller.Caller;
import com.owl_ontologies.ecsdiservices.EcografiaType;
import com.owl_ontologies.ecsdiservices.Imagen;

public class CallerTest {
	@Test
	public void test() throws DatatypeConfigurationException {
		Imagen					imagen;
		EcografiaType			eco, result;
		XMLGregorianCalendar	xgc;
		Caller					c;
		
		xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
		
		imagen = new Imagen();
		imagen.setIDPrueba("IDImagen");
		
		eco = new EcografiaType();
		eco.setEcoBool(true);
		eco.setEcoDate(xgc);
		eco.setEcoDateTime(xgc);
		eco.setEcoFloat((float)1.1111);
		eco.setEcoInt(1);
		eco.setEcoString("EcoPrueba");
		eco.setEcoTime(xgc);
		eco.setIDPrueba("IDEcoPrueba");
		eco.setSubPrueba(imagen);
		
		c = new Caller();
		result = (EcografiaType) c.callService("http://localhost:8080/ExampleWebApplication/EcografiaService?WSDL#asignarCita", new Object[] {eco, "sergio"}, EcografiaType.class);
		System.out.println(result.getSubPrueba().getIDPrueba());
	}
}
