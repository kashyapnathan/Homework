/**
 * 
 */
package geo;

import java.util.Scanner;

public class GeoCalculator {

	public static void main(String[] args) 
	{
	
		Scanner getDisBread = new Scanner (System.in);
		System.out.print("Please enter your name ");
		String name;
		name=getDisBread.nextLine();
		System.out.println("\n\nHello "+name+ ", welcome to the Geometry Calculator");
		System.out.print("Press enter to continue");
		getDisBread.nextLine();
		
		
		
		System.out.println("Area of a Triangle");
		System.out.print("Enter the length of the Base:");
		String baseStr = getDisBread.nextLine();
		double base = Double.parseDouble(baseStr);
		System.out.print("Please enter the Height:");
		String heightStr = getDisBread.nextLine();
		double height = Double.parseDouble(heightStr);
		System.out.println("Please enter the unit of measure:");
		String unit=getDisBread.nextLine();
		
		double answer = 0.5 *base *height;
		System.out.println("The area is "  + answer+ " " + unit + "^2");
		
		
		
		
		
		
		
		
		
	}

}
