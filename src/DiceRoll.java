import java.util.Random;
import java.util.Scanner;

/**
 * Kashyap Nathan
 */
public class DiceRoll {

	public static void main(String[] args) 
	{
		Random dice = new Random();
		Scanner getDisBread = new Scanner(System.in);
		System.out.println("Please enter a number from 1 to 6. This number will be the target number for the dice");
		int userInput = getDisBread.nextInt();
		int diceNumber = dice.nextInt(6)+1;
		int count = 0;
		
		
			while(userInput<1 || userInput>6)
			{
				System.out.println("Invalid number, please enter a valid one.");
				userInput=getDisBread.nextInt();
				getDisBread.nextLine();
			}
		
			while(userInput != diceNumber)
			{
			count +=1;
			System.out.println("The dice has rolled a: "+diceNumber+". Press enter to roll once more.");
			getDisBread.nextLine();
			diceNumber=dice.nextInt(6)+1;
			}
			System.out.println("Congragulations, you have rolled a "+userInput +" after "+count+" attempts");
	
	

}}