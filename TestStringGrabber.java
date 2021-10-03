import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestStringGrabber {

	@Test
	void testInputSize() {
		List<String> x = StringGrabber.getUserInput();
		assertTrue(x.size() > 0);
	}
	
	
	@Test
	void testReplacement() {
		boolean replacement = StringGrabber.getReplacementInput();
		
		
	}
}
