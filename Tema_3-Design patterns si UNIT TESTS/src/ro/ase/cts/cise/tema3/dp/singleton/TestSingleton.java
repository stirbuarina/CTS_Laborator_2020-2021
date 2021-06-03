package ro.ase.cts.cise.tema3.dp.singleton;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestSingleton {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
    
	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void testSingleton() {

		ConexiuneServer con1=ConexiuneServer.getConexiune();
		ConexiuneServer con2=ConexiuneServer.getConexiune();
		assertEquals("Aceeasi referinta", con1,con2);
	}
	

}
