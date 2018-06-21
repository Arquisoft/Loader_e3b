package es.uniovi.asw.e3b.loader_e3b.db;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.lowagie.text.DocumentException;

import es.uniovi.asw.e3b.loader_e3b.parser.RList;

public class RListTest {

	@Test
	public void RListTestVal() throws FileNotFoundException, DocumentException {
		RList rl = new RList();
		assertNotNull(rl);
//		rl.load("doc/test/examples/agents.xlsx");
		
	}
	
	@Test(expected = FileNotFoundException.class)
	public void RListTestFail() throws FileNotFoundException, DocumentException {
		RList rl = new RList();
		assertNotNull(rl);
		rl.load("doc/test/examples/inventado.xlsx");
		
	}
	
}
