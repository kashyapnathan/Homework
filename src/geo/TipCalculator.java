/**
 * 
 */
package geo;

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		
		Scanner getDisBread = new Scanner (System.in);
		System.out.println("Please enter your name ");
		String name;
		name=getDisBread.nextLine();
		System.out.println("\n\nHello "+name+ ", welcome to the Tip Calculator");
		System.out.println("Press enter to continue");
		getDisBread.nextLine();
		
		System.out.println("Please enter the name of your apetizer");
		String appetizer = getDisBread.nextLine();
		System.out.println("Please enter the price of your apetizer");
		String appetizerPrice = getDisBread.nextLine();
		System.out.println("Please enter the name of your entree");
		String entree = getDisBread.nextLine();
		System.out.println("Please enter the price of your entree");
		String entreeName = getDisBread.nextLine();
		System.out.println("Please enter the name of your dessert");
		String dessert = getDisBread.nextLine();
		System.out.println("Please enter the price of your dessert");
		String dessertPrice = getDisBread.nextLine();
		System.out.println("Please enter the amount that you would like to tip as a decimal (ex. 0.18)");
		String tipAmount = getDisBread.nextLine();
		
		System.out.print("Item\t\t\t\t\tPrice");
	}

}
