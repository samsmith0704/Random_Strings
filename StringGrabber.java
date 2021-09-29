import java.util.HashSet;
import java.util.Scanner;

public class StringGrabber {
	static HashSet getUserInput() {
		HashSet<String> mySet = new HashSet<>();
		
		
		while (true) {
			
			Scanner myObj = new Scanner(System.in);
			System.out.println("Enter a String: ");
		
			String inputString = myObj.nextLine();
			if (inputString.isEmpty()) {
				myObj.close();
				break;
			}
			mySet.add(inputString);
			
		}

		
		return mySet;
	}
	
	public static void main (String[] args) {
		System.out.println(StringGrabber.getUserInput());
		
	}
}