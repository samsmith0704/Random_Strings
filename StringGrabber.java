import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StringGrabber {
	static Scanner myObj = new Scanner(System.in);
	static List getUserInput() {
		List<String> myList = new ArrayList<>();
		

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
	
	static List<String> removeRandomString(List<String> originalList, boolean shouldIReplace) {
		if (!shouldIReplace) {
			Random rand = new Random();
			int randomNum = rand.nextInt(originalList.size());
			originalList.remove(randomNum);
		}
		
		myObj.close();
		return originalList;
	}
	
	public static void main (String[] args) {
		/*
		 * call getreplacementinput
		 * if that is yes, then dont call remove randomstring
		 * if it is no, then call remove randomstring 
		 * 
		 * */
//		boolean shouldIReplace = StringGrabber.getReplacementInput();
//		List<String> lst = StringGrabber.getUserInput();
//		StringGrabber.removeRandomString(lst, shouldIReplace);
//		System.out.println(lst);

		
	}
}