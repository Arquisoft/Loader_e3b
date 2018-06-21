package modeltest;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.e3b.loader_e3b.model.Localizacion;

public class LocalizacionTest {

	@Test
	public void testEquals() {
		Localizacion l1=new Localizacion(45.6,5);
		Localizacion l1_1=new Localizacion(45.6,5);
		
		Localizacion l2=new Localizacion(42.3,4);
		
		assertFalse(l1.equals(l2));
		assertTrue(l1_1.equals(l1));
				
	}
	@Test
	public void testHash() {
		Localizacion l1=new Localizacion(45.6,5);
		Localizacion l1_1=new Localizacion(45.6,5);
		
		Localizacion l2=new Localizacion(42.3,4);
		
		assertNotEquals(l1.hashCode(),l2.hashCode());
		assertEquals(l1.hashCode(),l1_1.hashCode());
				
	}
	@Test
	public void testConstructor() {
		Localizacion l= new Localizacion();
		assertNotNull(l);
	
		Localizacion l1=new Localizacion(45.6,5);		
		assertNotNull(l1);
		assertEquals(45.6,l1.getLatitud(),0.1);
		assertEquals(5,l1.getLongitud(),0.1);
	
		
				
	}
	@Test
	public void testEqualsFal() {
		Localizacion l1=new Localizacion(40.6,5);		
		Localizacion l2=new Localizacion(45.6,5);	
		assertNotNull(l1);
		assertNotNull(l2);
		assertFalse(l1.equals(l2));
		assertFalse(l1.equals(null));
		assertTrue(l1.equals(l1));
		assertFalse(l1.equals(new Integer(5)));
		
		
				
	}

}
