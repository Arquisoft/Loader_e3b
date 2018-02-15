package modeltest;

import static org.junit.Assert.*;

import java.awt.Point;
import java.util.Date;

import model.User;

import org.junit.Test;

public class UserTest {

	@Test
	public void testEquals() {
		Date date = new Date(System.currentTimeMillis());
		//coordenadas opcionales 
		Agent agenteCiudadano1 = new Agent("Dani","","dani35@gmail.com","dani123","Ciudadano");
		Agent agenteCiudadano1_1 = new Agent("Dani","","dani1456@gmail.com","dani123","Ciudadano");
		Agent agenteCiudadano2 = new Agent("Julio","","julio1235@gmail.com","julio125","Ciudadano");
		//
		Agent agenteEntidad1 = new Agent("Entidad 1","entidad123@gmail.com","entidad123","Entidad");
		Agent agenteEntidad1_1 = new Agent("Entidad 1.1","entidad123567@gmail.com","entidad123","Entidad");
		Agent agenteEntidad2 = new Agent("Entidad 2","entidad123@gmail.com","entidad567","Entidad");
		
		//
		
		Agent agentSensor1 = new Agent("Sensor 1",new Point(43,-6),"sensor@gmail.com","sensor123","Sensor");
		Agent agentSensor1_1= new Agent("Sensor 1.1",new Point(43,-6),"sensor1.1@gmail.com","sensor123","Sensor");
		Agent agentSensor2= new Agent("Sensor 2",new Point(43,-6),"sensor2@gmail.com","sensor456","Sensor");
		
		
		assertNotNull(agenteCiudadano1);
		assertNotNull(agenteCiudadano1_1);
		assertNotNull(agenteCiudadano2);
		assertNotNull(agenteEntidad1);
		assertNotNull(agenteEntidad1_1);
		assertNotNull(agenteEntidad2);
		assertNotNull(agentSensor1);
		assertNotNull(agentSensor1_1);
		assertNotNull(agentSensor2);

		assertEquals(true, agenteCiudadano1.equals(agenteCiudadano1_1));
		assertEquals(true, agenteEntidad1.equals(agenteEntidad1_1));
		assertEquals(true, agentSensor1.equals(agentSensor1_1));
		
		
		assertEquals(false, agenteCiudadano1.equals(agenteCiudadano2));
		assertEquals(false, agenteEntidad1.equals(agenteEntidad2));
		assertEquals(false, agentSensor1.equals(agentSensor2));
	}

	@Test
	public void testHashCode() {
	
		Agent agenteCiudadano1 = new Agent("Dani","","dani35@gmail.com","dani123","Ciudadano");
		Agent agenteCiudadano1_1 = new Agent("Dani","","dani1456@gmail.com","dani123","Ciudadano");
		Agent agenteCiudadano2 = new Agent("Julio","","julio1235@gmail.com","julio125","Ciudadano");
		
		Agent agenteEntidad1 = new Agent("Entidad 1","entidad123@gmail.com","entidad123","Entidad");
		Agent agenteEntidad1_1 = new Agent("Entidad 1.1","entidad123567@gmail.com","entidad123","Entidad");
		Agent agenteEntidad2 = new Agent("Entidad 2","entidad123@gmail.com","entidad567","Entidad");

		assertEquals(agenteCiudadano1.hashCode(), agenteCiudadano1_1.hashCode());
		assertNotEquals(agenteCiudadano1.hashCode(), agenteCiudadano2.hashCode());
		
		assertEquals(agenteEntidad1.hashCode(), agenteEntidad1_1.hashCode());
		assertNotEquals(agenteEntidad1.hashCode(), agenteEntidad2.hashCode());
		

	}

	@Test
	public void testConstructor() {
		
		Agent agenteCiudadano1 = new Agent("Dani","","dani35@gmail.com","dani123","Ciudadano");

	
		assertEquals("Dani", agenteCiudadano1.getNombre());
		assertEquals("email@gmail.com", agenteCiudadano1.getEmail());
		assertEquals("dani123", agenteCiudadano1.getIdentificador);
		assertEquals("Ciudadano", agenteCiudadano1.getTipo());

	}

}
