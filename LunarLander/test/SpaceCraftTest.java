import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.*;

public class SpaceCraftTest {
	private SpaceCraft sc;
	@Before
	public void setUp() throws Exception {
		sc=new SpaceCraft();
	}

	@After
	public void tearDown() throws Exception {
		sc=null;
	}
	
	@Test
	public void testCalcNewValues() {
		 	 //SpaceCraft sc = new SpaceCraft();
		 	 sc.init();
		 	 assertEquals(0, sc.getBurnRate());
		 	
		 	 sc.setBurnRate(1000);
		 	try {
				 sc.calcNewValues();
				 fail("Exception should be thrown");
		 	 } catch (Exception e){
				 ;//Exception expected
		 	 }
		 	
		 	 sc.setBurnRate(5);
		 	 sc.setFuel(45);
		 	 try{
				 sc.calcNewValues();
		 	 } catch (Exception e){
				 ;//Ignore this time
		 	 }
		 	 assertEquals(40, sc.getFuel());
	}
	@Ignore
	public void oldTest(){
		 	 fail("If executed, this test should fail.");
		 	
	}

	@Test
	public void testGetAltitude() {
		sc.init();
		assertEquals(1000, sc.getAltitude());
		
	}

}
