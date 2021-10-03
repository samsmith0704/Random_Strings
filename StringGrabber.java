import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StringGrabber {
	static List getUserInput() {
		List<String> myList = new ArrayList<>();
		
		Scanner myObj = new Scanner(System.in);

		while (true) {
			
			System.out.println("Enter a String: ");
		
			String inputString = myObj.nextLine();
			if (inputString.isEmpty()) {
				break;
			}
			myList.add(inputString);
			
		}

		
		return myList;
	}
	
	static boolean getReplacementInput() {
		boolean replacementBoolean; 
		Scanner myObj = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Replacement? (y/n) ");
		
			String inputString = myObj.nextLine().strip();

			if (inputString.equals("y")) {
				replacementBoolean=true; 
				break;
			}
			else if (inputString.equals("n")) {
				replacementBoolean=false;
				break;
			}
		}
		
		return replacementBoolean; 
	}
	
	static List<String> removeRandomString(List<String> originalList) {
		Random rand = new Random();
		int randomNum = rand.nextInt(originalList.size());
		originalList.remove(randomNum);
		return originalList;
	}
	
	public static void main (String[] args) {
		/*
		 * call getreplacementinput
		 * if that is yes, then dont call remove randomstring
		 * if it is no, then call remove randomstring 
		 * */
		List<String> lst = StringGrabber.getUserInput();
		System.out.println(lst);
		StringGrabber.removeRandomString(lst);
		System.out.println(lst);

		
	}
}