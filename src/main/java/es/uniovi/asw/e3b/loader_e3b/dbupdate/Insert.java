package es.uniovi.asw.e3b.loader_e3b.dbupdate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.lowagie.text.DocumentException;

import es.uniovi.asw.e3b.loader_e3b.model.Agent;
import es.uniovi.asw.e3b.loader_e3b.model.Operario;

/**
 * 
 * @author Ignacio Escribano Burgos
 * Gestiona la conexión con la base de datos
 *
 */
public interface Insert {
	Agent save(Agent user) throws FileNotFoundException, DocumentException, IOException;

	List<Agent> findByDNI(String dni);

	List<Agent> findByEmail(String email);
	
	Operario save(Operario user) throws FileNotFoundException, DocumentException, IOException;
}
