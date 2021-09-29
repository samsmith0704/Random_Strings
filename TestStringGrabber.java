import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

class TestStringGrabber {

	@Test
	void test() {
		HashSet<String> x = StringGrabber.getUserInput();
		assertTrue(x.size() > 0);
	}

}
