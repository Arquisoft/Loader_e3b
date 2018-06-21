package es.uniovi.asw.e3b.loader_e3b.parsertest;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import com.lowagie.text.DocumentException;
import es.uniovi.asw.e3b.loader_e3b.model.Agent;
import es.uniovi.asw.e3b.loader_e3b.model.util.ModelException;
import es.uniovi.asw.e3b.loader_e3b.parser.cartas.Letter;
import es.uniovi.asw.e3b.loader_e3b.parser.cartas.PdfLetter;
import es.uniovi.asw.e3b.loader_e3b.parser.cartas.TxtLetter;
import es.uniovi.asw.e3b.loader_e3b.parser.cartas.WordLetter;

public class LetterTest {

	@Test
	public void creadasCorrectamente() throws FileNotFoundException, DocumentException, IOException, ModelException {
		Letter letter = new PdfLetter();		
		Agent user1 = new Agent("Paco", null, "francisco@gmail.com","paco123","Ciudadano");
		letter.createLetter(user1);

		File file = new File("cartas/pdf/paco123.pdf");
		assertTrue(file.exists());
		file.delete();

		letter = new WordLetter();
		letter.createLetter(user1);

		file = new File("cartas/word/paco123.docx");
		assertTrue(file.exists());
		file.delete();

		letter = new TxtLetter();
		letter.createLetter(user1);

		file = new File("cartas/txt/paco123.txt");
		assertTrue(file.exists());
		file.delete();
	}

	
}
