package es.uniovi.asw.e3b.loader_e3b.executer;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.lowagie.text.DocumentException;

import es.uniovi.asw.e3b.loader_e3b.model.Agent;
import es.uniovi.asw.e3b.loader_e3b.model.Operario;

public interface ActionFacade {
	public void saveData(Agent user) throws FileNotFoundException, DocumentException, IOException;
	// public void verifySecurity();  Esto es una ampliacion opcional y no se en que consiste

	void saveData(Operario oper) throws FileNotFoundException, DocumentException, IOException;
}