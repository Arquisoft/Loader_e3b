package es.uniovi.asw.e3b.loader_e3b.parser.cartas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import es.uniovi.asw.e3b.loader_e3b.model.Agent;
import es.uniovi.asw.e3b.loader_e3b.model.Operario;

public class PdfLetter extends Letter{
	private Document document;
	public  void createLetter(Agent user) throws DocumentException, FileNotFoundException{
		document = null;
		FileOutputStream letter = null;
		letter = new FileOutputStream(
				"cartas/pdf/" + user.getIdentificador() + ".pdf");
		document = new Document();
		PdfWriter.getInstance(document, letter);
		document.open();	
		document.add(new Paragraph("Nombre: " + user.getNombre()));
		document.add(new Paragraph("Identificador: " + user.getIdentificador()));
		document.add(new Paragraph("Clave: " + user.getClave()));
		document.close();
	}
	@Override
	public void createLetter(Operario user) throws DocumentException, FileNotFoundException, IOException {
		document = null;
		FileOutputStream letter = null;
		letter = new FileOutputStream(
				"cartas/pdf/" + user.getEmail() + ".pdf");
		document = new Document();
		PdfWriter.getInstance(document, letter);
		document.open();	
		document.add(new Paragraph("Email: " + user.getEmail()));
		document.add(new Paragraph("Identificador/Clave: " + user.getPassword()));
		document.close();
		
	}
}
