package Lab8;
import dto.*;

import java.util.Scanner;

// Lab8.UserInput class
public class UserInput {
	private static Scanner input = new Scanner(System.in);

	public static String getString() {
		return input.nextLine();
	}
	
	public static int getInteger() {
		int value = 0;
		value = Integer.parseInt(input.nextLine()); // String -> int
		return value;
	}
	
	public static double getDouble() {
		double value = 0.0;
		value = Double.parseDouble(input.nextLine()); // String -> int
		return value;
	}
	
	public static boolean getExitKey() {
		System.out.print("Press q-key to exit or enter-key to continue: ");
		String str = input.nextLine();
		if (str.contentEquals("q"))
			return true;
		else
			return false;
	}
	
	// p-key to previous index or n-key to next index
	public static char getKey() {
		System.out.print("Press p-key to previous or n-key to next or q-key to exit or enter-key to continue: ");
		String str = input.nextLine();
		if (str.contentEquals("q"))
			return 'q';
		else if (str.contentEquals("p"))
			return 'p';
		else if (str.contentEquals("n"))
			return 'n';
		else
			return '\u0000';
	}

    // get between min_value and max_value
    public static int getIntegerBetween(int min, int max) {
    	int value = -1;
		do {
			System.out.printf("Please enter the number %d-%d: ", min, max);
       		try {
				value = Integer.parseInt(input.nextLine());
       		} catch (NumberFormatException e) {
       			System.out.printf("ERROR! Please enter the number %d-%d!\n", min, max);
       			//scan.next();
       			continue;
       		}
       		System.out.printf("You entered %d\n", value);
		} while (value < min || value > max);
        return value;
    }
    
	// getElement from user input (String->Lab8.Element) "1" or "HYDROGEN" -> HYDROGEN
	public static Element getElement() {
		return Element.nameOf(input.nextLine());
	}
	
	// getElement from user input (String->Lab8.State) "GAS" -> GAS
	public static State getState() {
		while (true) {
			try {
				return State.valueOf(input.nextLine());
			}
			catch (IllegalArgumentException e) {
				System.out.print("ERROR! Please reenter state [GAS, SOLID, LIQUID, UNKNOWN]:");
			}
		}
	}
	/* 일단 보류
	public static Element.PeriodicElement getPeriodicElement() {
		System.out.println("~~please input Lab8.Element.PeriodicElement~~");
		System.out.print("please input Lab8.Element.PeriodicElement number : ");
		int number = UserInput.getInteger();
		System.out.print("please input Lab8.Element.PeriodicElement symbol : ");
		String symbol = UserInput.getString();	
		System.out.print("please input Lab8.Element.PeriodicElement name : ");
		String name = UserInput.getString();
		System.out.print("please input Lab8.Element.PeriodicElement weight : ");
		double weight = UserInput.getDouble();	
		System.out.print("please input Lab8.Element.PeriodicElement state : ");
		State state = UserInput.getState();	
		return PeriodicElementFactory.getInstance(number, symbol, name, weight, period, group, type, state);
	}*/

}
