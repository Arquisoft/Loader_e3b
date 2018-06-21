package es.uniovi.asw.e3b.loader_e3b.parser.cartas;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.lowagie.text.DocumentException;

import es.uniovi.asw.e3b.loader_e3b.model.Agent;
import es.uniovi.asw.e3b.loader_e3b.model.Operario;

public abstract class Letter {
		public abstract void createLetter(Agent user) throws DocumentException, FileNotFoundException, IOException;

		public abstract void createLetter(Operario user) throws DocumentException, FileNotFoundException, IOException;


			
		
}
