package es.uniovi.asw.e3b.loader_e3b.parser;

import java.io.FileNotFoundException;

import com.lowagie.text.DocumentException;

public interface ReadList {
	public void load(String path) throws FileNotFoundException, DocumentException;
}
