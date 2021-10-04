import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestStringGrabber {
	private static List<String> lst = StringGrabber.getUserInput();
	@Test
	void testInputSize() {
		assertTrue(lst.size() > 0);
		System.out.println("----------------------------------------");
	}
	
	
	@Test
	void testReplacement() {
		boolean shouldIReplace = true; 
		int originalLstSize = lst.size();
		StringGrabber.removeRandomString(lst, shouldIReplace);		
		assertEquals(originalLstSize, lst.size());
		System.out.println("----------------------------------------");

	}
	
	@Test
	void testNoReplacement() {
		boolean shouldIReplace = false; 
		int originalLstSize = lst.size();
		StringGrabber.removeRandomString(lst, shouldIReplace);		
		assertNotEquals(originalLstSize, lst.size());
		System.out.println("----------------------------------------");

	}
	
	
	
	
}
