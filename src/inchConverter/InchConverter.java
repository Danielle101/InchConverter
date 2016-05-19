/*Date: 5/16/16
Description: Converts inches to other units of measurement*/
package inchConverter;

import java.util.*;

public class InchConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// created scanner for user input
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		// welcome message
		System.out.println("Welcome to the inch conversion app!");
		// ask for user input
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Please enter your measurement in inches:");
			double userInch = sc.nextDouble();
			System.out.println("What unit of measurement would you like to convert inches to?\n");
			System.out.println("Selection Menu:\n1 for Millimeters\n2 for Centimeters\n3 for Feet\n4 for Yards");
			System.out.println("\nPlease enter a number (1-4):");
			int userSelect = sc.nextInt();
			if (userSelect == 1) {
				double MilliCon = userInch * 25.4;
				System.out.println(userInch + " inches is equivalent to " + MilliCon + " millimeters.");
			} else if (userSelect == 2) {
				double CentiCon = userInch * 2.54;
				System.out.println(userInch + " inches is equivalent to " + CentiCon + " centimeters.");
			} else if (userSelect == 3) {
				double feetCon = userInch * 0.0833333;
				System.out.println(userInch + " inches is equivalent to " + feetCon + " feet.");
			} else if (userSelect == 4) {
				double yardCon = userInch * 0.0277778;
				System.out.println(userInch + " inches is equivalent to " + yardCon + " yards.");
			}
				System.out.println("\nWould you like to convert another number? (y/n):");
				choice = sc.next();
			}
		System.out.println("Thanks for using the Inch Converter App! Come back soon!");
		sc.close();
		}
	}

