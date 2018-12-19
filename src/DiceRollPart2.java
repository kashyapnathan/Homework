import java.util.Random;
import java.util.Scanner;

public class DiceRollPart2 {

	public static void main(String[] args) 
	{
		System.out.println("How many times would you like to roll?");
		Random dice = new Random();
		Scanner getDisBread = new Scanner(System.in);
		int times = getDisBread.nextInt();
		
		int one=0;
		int two=0;
		int three=0;
		int four=0;
		int five=0;
		int six=0;
		
		for (int num=1; num<=times+1; num++)
		{
			int diceNumber = dice.nextInt(6)+1;
			if (diceNumber==1)
				one+=1;
			if (diceNumber==2)
				one+=1;
			if (diceNumber==3)
				one+=1;
			if (diceNumber==4)
				one+=1;
			if (diceNumber==5)
				one+=1;
			if (diceNumber==6)
				one+=1;
		}
		
	}

}
