package es.uniovi.asw.e3b.loader_e3b.executer;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Test;

import com.lowagie.text.DocumentException;

import es.uniovi.asw.e3b.loader_e3b.model.Agent;
import es.uniovi.asw.e3b.loader_e3b.model.Operario;
import es.uniovi.asw.e3b.loader_e3b.model.util.ModelException;
import es.uniovi.asw.e3b.loader_e3b.persistence.UserFinder;
import es.uniovi.asw.e3b.loader_e3b.persistence.util.Jpa;

public class ExecuterTest {

	@Test
	public void testActionSingleton() throws FileNotFoundException, DocumentException, IOException, ModelException {
		ActionSingleton aS = ActionSingleton.getInstance();
		ActionSingleton aS2 = ActionSingleton.getInstance();
		
		assertEquals(aS, aS2);		
		
		Agent user = new Agent("Paco",null, "francisco@gmail.com","paco123","Ciudadano");
		
		aS.getAF().saveData(user);
		
		EntityManager mapper = Jpa.createEntityManager();
		EntityTransaction trx = mapper.getTransaction();
		trx.begin();
		
		Agent user2 = UserFinder.findByEmail("francisco@gmail.com").get(0);
		
		assertEquals(user, user2);
		
		trx.commit();
		
	}
	
	@Test
	public void testActionSingletonOperario() throws FileNotFoundException, DocumentException, IOException, ModelException {
		ActionSingleton aS = ActionSingleton.getInstance();
		ActionSingleton aS2 = ActionSingleton.getInstance();
		
		assertEquals(aS, aS2);		
		
		Operario user = new Operario("operario1@gmail.com","123456");
		
		aS.getAF().saveData(user);
		
		EntityManager mapper = Jpa.createEntityManager();
		EntityTransaction trx = mapper.getTransaction();
		trx.begin();
		
		Operario user2 = UserFinder.operarioFindByEmail("operario1@gmail.com").get(0);
		
		assertEquals(user, user2);
		
		trx.commit();
		
	}

}
