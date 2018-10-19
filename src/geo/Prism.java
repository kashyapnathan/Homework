package geo;

import java.util.Scanner;

public class Prism {

	public static void main(String[] args) {
		
		Scanner getDisBread = new Scanner (System.in);
		System.out.println("\nWelcome to the Prism Calculator");
		
		
		System.out.print("Enter the length of the Base:");
		String baseStr = getDisBread.nextLine();
		System.out.println("Enter the width of the Base");
		double base = Double.parseDouble(baseStr);
		String widthStr = getDisBread.nextLine();
		double width = Double.parseDouble(widthStr);
		
		System.out.print("Please enter the Height:");
		String heightStr = getDisBread.nextLine();
		double height = Double.parseDouble(heightStr);
		System.out.println("Please enter the unit of measure:");
		String unit=getDisBread.nextLine();
		
		double answer = base*height*width;
		System.out.println("The area is "  + answer+ " " + unit + "^2");
		

	}

}
