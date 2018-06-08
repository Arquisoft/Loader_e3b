package modeltest;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Agent;
import model.Localizacion;
import model.Operario;
import model.util.ModelException;

public class OperarioTest {

	@Test
	public void testEquals() throws ModelException {		
	
		//
		Operario oper1 = new Operario("oper1@gmail.com","123456");
		Operario oper2 = new Operario("oper2@gmail.com","123456");
		Operario oper3 = new Operario("oper3@gmail.com","123456");
		Operario oper4 = new Operario("oper4@gmail.com","123456","Admin");

		Operario oper5  = new Operario("oper25@gmail.com","123456");
		
		assertNotNull(oper1);
		assertNotNull(oper2);
		assertNotNull(oper3);
		assertNotNull(oper4);
		
		//compruebo hashCode del ultimo operario
		assertEquals(oper4.hashCode(), -228767646);
		
		//ahora probamos el metodo equals
		assertTrue(oper1.equals(oper1));
		assertFalse(oper1.equals(null));
		assertFalse(oper1.equals( new Agent("Entidad 1",null,"entidad123@gmail.com","entidad123","Entidad")));
		assertFalse(oper1.equals(oper4));
		oper1.setRole(null);
		assertFalse(oper1.equals(oper5));
		oper1.setPassword(null);
		assertFalse(oper1.equals(oper5));
		oper1.setId(null);
		assertFalse(oper1.equals(oper5));
		oper1.setEmail(null);
		assertFalse(oper1.equals(oper5));
		
	}


	@Test(expected = ModelException.class)
	public void testConstructor() throws ModelException {
		Operario oper1 = new Operario("oper1@gmail.com","123456");
		
		assertNotNull(oper1);
		assertEquals("oper1@gmail.com", oper1.getEmail());
		assertEquals("123456", oper1.getPassword());
		
		//ahora creamos un operario mal
		oper1 = new Operario("oper1@gmail.com", null);
	}
	
	@Test
	public void testToString() throws ModelException {
		Operario oper1 = new Operario("oper1@gmail.com","123456");
		
		assertEquals(oper1.toString(), "Operador [id=null, email=oper1@gmail.com, password=123456, role=null, partes=[]]");
	}

}
