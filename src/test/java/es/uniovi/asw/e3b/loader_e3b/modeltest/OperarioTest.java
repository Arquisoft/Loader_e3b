package es.uniovi.asw.e3b.loader_e3b.modeltest;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.e3b.loader_e3b.model.Agent;
import es.uniovi.asw.e3b.loader_e3b.model.Incidence;
import es.uniovi.asw.e3b.loader_e3b.model.Localizacion;
import es.uniovi.asw.e3b.loader_e3b.model.Operario;
import es.uniovi.asw.e3b.loader_e3b.model.util.ModelException;

public class OperarioTest {

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void testEquals() throws ModelException {		
	
		//
		Operario oper1 = new Operario("oper1@gmail.com","123456");
		Operario oper2 = new Operario("oper2@gmail.com","123456");
		Operario oper3 = new Operario("oper3@gmail.com","123456");
		Operario oper4 = new Operario("oper4@gmail.com","123456","Admin");
		
		assertEquals("Admin", oper4.getRole());
		
		Operario oper5  = new Operario("oper25@gmail.com","123456");
		
		assertNotNull(oper1);
		assertNotNull(oper2);
		assertNotNull(oper3);
		assertNotNull(oper4);
		
		
		
		//ahora probamos el metodo equals
		assertTrue(oper1.equals(oper1));
		assertFalse(oper1.equals(null));
		assertFalse(oper1.equals( new Agent("Entidad 1",null,"entidad123@gmail.com","entidad123","Entidad")));
		assertFalse(oper1.equals(oper4));
		oper1.setRole(null);
		oper5.setRole(null);
		assertFalse(oper1.equals(oper5));
		oper1.setPassword(null);
		oper5.setPassword(null);
		assertFalse(oper1.equals(oper5));
		oper1.setId(null);
		oper5.setId(null);
		assertFalse(oper1.equals(oper5));
		oper1.setEmail(null);
		assertFalse(oper1.equals(oper5));
		oper5.setEmail(null);
		assertTrue(oper1.equals(oper5));
		
	}


	@Test(expected = ModelException.class)
	public void testConstructor() throws ModelException {
		Operario oper1 = new Operario("oper1@gmail.com","123456");
		
		assertNotNull(oper1);
		assertEquals("oper1@gmail.com", oper1.getEmail());
		assertEquals("123456", oper1.getPassword());
		
		//ahora creamos un operario mal
		oper1 = new Operario("oper1@gmail.com", null);
		oper1 = new Operario("oper1@gmail.com", "");
		
		//probamos que se crea tambien bien el rol
		Operario oper4 = new Operario("oper4@gmail.com","123456","Admin");
		assertEquals("Admin", oper4.getRole());
	}
	
	@Test
	public void testToString() throws ModelException {
		Operario oper1 = new Operario("oper1@gmail.com","123456");
		
		assertEquals(oper1.toString(), "Operador [id=null, email=oper1@gmail.com, password=123456, role=null, partes=[]]");
	}
	
	@Test
	public void testHashCode() throws ModelException {
		Operario oper4 = new Operario("oper4@gmail.com","123456","Admin");
//		Agent agente = new Agent("Dani",null,"dani35@gmail.com","dani123","Ciudadano");
//		Incidence incidence = new Incidence(agente, "incidencia", "Se ha producido una incidencia", new Localizacion(43,-6).toString(), null);
//		
		//compruebo hashCode del ultimo operario
		assertEquals(oper4.hashCode(), -228767646);
		oper4.setRole(null);
		assertEquals(oper4.hashCode(), -291883725);
		oper4.setPassword(null);
		assertEquals(oper4.hashCode(), 1984917302);
//		oper4.añadirIncidencia(incidence);
//		//assertEquals(oper4.hashCode(), 1768972570);
//		oper4.setId((long) 8999);
//		assertEquals(oper4.hashCode(), 2037061779);
//		oper4.setEmail(null);
//		assertEquals(oper4.hashCode(), 80773628);
	}
	
	@Test
	public void testIncidencias() throws ModelException {
		Operario oper1 = new Operario("oper1@gmail.com","123456");
		Agent agente = new Agent("Dani",null,"dani35@gmail.com","dani123","Ciudadano");
		Incidence incidence = new Incidence(agente, "incidencia", "Se ha producido una incidencia", new Localizacion(43,-6).toString(), null);
		assertEquals(0, oper1.getIncidencias().size());
		oper1.añadirIncidencia(incidence);
		assertEquals(1, oper1.getIncidencias().size());
	}
	
	@Test
	public void testEqualsFal() throws ModelException {
		
		Operario oper1 = new Operario("oper1@gmail.com","123456");
		Operario oper2 = new Operario("oper1@gmail.com","123456");
		Operario oper3 = new Operario("oper1@gmail.com","12");
		Operario oper4 = new Operario("oper1@gmail.com","12456","admin");
		Incidence inc= new Incidence();
		oper2.añadirIncidencia(inc);
		
		
		assertNotNull(oper1);
		assertNotNull(oper2);
		assertNotNull(oper3);
		assertNotNull(oper4);
		assertNull(oper1.getId());
	
		
		assertFalse(oper1.equals(null));
		assertFalse(oper1.equals(oper2));
		assertFalse(oper1.equals(oper3));
		assertFalse(oper1.equals(oper4));
		assertFalse(oper1.equals(inc));
	}

}
