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
	
	static String removeRandomString(List<String> originalList, boolean shouldIReplace) {
		int randomNum=0;
		
		if ( originalList.size() > 0) {
			Random rand = new Random();
			randomNum = rand.nextInt(originalList.size());
			String strToRemove = originalList.get(randomNum);
			if (!shouldIReplace) {
				originalList.remove(randomNum);
			}
			myObj.close();
			return strToRemove;
			
		}
		
		myObj.close();
		return "List is empty";
	}
	
	public static void main (String[] args) {
		/*
		 * call getreplacementinput
		 * if that is yes, then dont call remove randomstring
		 * if it is no, then call remove randomstring 
		 * 
		 * */
		List<String> lst = StringGrabber.getUserInput();

		boolean shouldIReplace = StringGrabber.getReplacementInput();
		
		System.out.println(StringGrabber.removeRandomString(lst, shouldIReplace));
		System.out.println(lst);

		
	}
}