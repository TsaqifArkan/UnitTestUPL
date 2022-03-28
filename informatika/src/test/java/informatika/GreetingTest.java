package informatika;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GreetingTest {

	@Test
	public void testGreet() {
		// fail("Not yet implemented");
		
		// Pola Unit Test:
		// arrange
		Greeting greeting = new Greeting();
		
		// set
		String actual = greeting.greet();
		String expected = "Hello World!";
		
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
//	@Disabled
	public void testGreetLagi() {
		assertEquals("Hello World!", new Greeting().greet());
	}

}
