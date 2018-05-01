package uk.co.rightmove.WebAutomationTest;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPropterties extends TestBase{
	@BeforeClass
	public void init() throws IOException {
		
			System.out.println(getObject("AGE"));
		
	}
	@Test
	public void testProperties() throws IOException {
		System.out.println("Executing test");
		try {
		String name = getObject("NAME");
		System.out.println(name);
		}
		catch(NullPointerException e)
		{
			
			System.out.println(e.getMessage());
		}
	}
}
