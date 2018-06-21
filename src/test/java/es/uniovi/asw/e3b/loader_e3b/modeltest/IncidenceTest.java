package es.uniovi.asw.e3b.loader_e3b.modeltest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import es.uniovi.asw.e3b.loader_e3b.model.Agent;
import es.uniovi.asw.e3b.loader_e3b.model.Estado;
import es.uniovi.asw.e3b.loader_e3b.model.Incidence;
import es.uniovi.asw.e3b.loader_e3b.model.Localizacion;
import es.uniovi.asw.e3b.loader_e3b.model.Operario;
import es.uniovi.asw.e3b.loader_e3b.model.util.ModelException;

public class IncidenceTest {

	@Test
	public void test() {
		try {
			Agent agente = new Agent("Dani", null, "dani35@gmail.com", "dani123", "Ciudadano");
			Incidence incidence = new Incidence(agente, "incidencia", "Se ha producido una incidencia",
					new Localizacion(43, -6).toString(), null);
			assertEquals(incidence.getIncidenceName(), "incidencia");
			assertFalse(incidence.isPeligrosa());
			incidence.setDescription("peligro");
			assertTrue(incidence.isPeligrosa());
		} catch (ModelException e) {
			System.err.println("Se produjo error en el modelo");
		}

	}

	@Test
	public void testIncidencia() throws ModelException {

		Agent agente = new Agent("Dani", null, "dani35@gmail.com", "dani123", "Ciudadano");
		Operario oper = new Operario("pepe@gmail.com", "123456");

		Set<String> labels = new HashSet<String>();
		Set<String> comments = new HashSet<String>();
		HashMap<String, String> fields = new HashMap<String, String>();
		Set<String> others = new HashSet<String>();

		Incidence incidencia = new Incidence(agente, "incidencia", "Descripcion", "1,1", labels, comments, fields,
				Estado.ABIERTA, new Date(), false, others, oper);
		
		Agent agente1 = new Agent("1", null, "1@gmail.com", "1", "Ciudadano");
		Operario oper1 = new Operario("2@gmail.com", "123456");

		Set<String> labels1 = new HashSet<String>();
		Set<String> comments1 = new HashSet<String>();
		HashMap<String, String> fields1 = new HashMap<String, String>();
		Set<String> others1 = new HashSet<String>();
		Date fecha = new Date();
		
		incidencia.setAgent(agente1);
		assertEquals(agente1,incidencia.getAgent());
		incidencia.setCacheable(true);
		assertTrue(incidencia.isCacheable());
		incidencia.setComments(comments1);
		assertEquals(comments1,incidencia.getComments());
		incidencia.setDescription("Descripcion1");
		assertEquals("Descripcion1",incidencia.getDescription());
		incidencia.setExpiration(fecha);
		assertEquals(fecha,incidencia.getExpiration());
		incidencia.setFields(fields1);
		assertEquals(fields1,incidencia.getFields());
		incidencia.setIncidenceName("incidencia1");
		assertEquals("incidencia1",incidencia.getIncidenceName());
		incidencia.setLabels(labels1);
		assertEquals(labels1,incidencia.getLabels());
		incidencia.setLocation("2,2");
		assertEquals("2,2",incidencia.getLocation());
		incidencia.setOperario(oper1);
		assertEquals(oper1,incidencia.getOperario());
		incidencia.setOthers(others1);
		assertEquals(others1,incidencia.getOthers());
		incidencia.setStatus(Estado.CERRADA);
		assertEquals(Estado.CERRADA,incidencia.getStatus());
	}

}
