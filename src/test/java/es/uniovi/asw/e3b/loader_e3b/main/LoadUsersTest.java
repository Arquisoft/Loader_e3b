package es.uniovi.asw.e3b.loader_e3b.main;

import org.junit.Test;

import com.lowagie.text.DocumentException;

public class LoadUsersTest {

	@Test
	public void test() throws DocumentException {
		LoadUsers.main("info");
		LoadUsers.main("--help");
	}

}
