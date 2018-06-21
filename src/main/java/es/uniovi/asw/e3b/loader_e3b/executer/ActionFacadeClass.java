package es.uniovi.asw.e3b.loader_e3b.executer;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.lowagie.text.DocumentException;

import es.uniovi.asw.e3b.loader_e3b.dbupdate.Insert;
import es.uniovi.asw.e3b.loader_e3b.dbupdate.InsertP;
import es.uniovi.asw.e3b.loader_e3b.model.Agent;
import es.uniovi.asw.e3b.loader_e3b.model.Operario;

public class ActionFacadeClass implements ActionFacade {

	@Override
	public void saveData(Agent user) throws FileNotFoundException, DocumentException, IOException {
		Insert insert = new InsertP();
		insert.save(user);
			
	}
	
	@Override
	public void saveData(Operario oper) throws FileNotFoundException, DocumentException, IOException {
		Insert insert = new InsertP();
		insert.save(oper);
			
	}
}