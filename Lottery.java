
//This program calculates playing the lottery by generating three random numbers
	import java.util.Scanner;
	import java.util.Random;
public class Lottery {
	public static void main(String[] args){
		//Generate three random lottery integers
			Random rand = new Random();
				int lottery1 = rand.nextInt(9)+1;		//generates integer from 1-10
				int lottery2 = rand.nextInt(9)+11;		//generates integer from 11-20		
				int lottery3 = rand.nextInt(9)+21;		//generates integer from 21-30
			
		//create a Scanner object to read from the keyboard
		Scanner input=new Scanner(System.in);
		
		//display prompts and get input
		System.out.print("Enter you first lottery number between 1 and 10:");
			int guess1 = input.nextInt();
			
		System.out.print("Enter your second lottery number between 11 and 20:");
			int guess2 = input.nextInt();
		
		System.out.print("Enter your third lottery number between 21 and 30:");
			int guess3 = input.nextInt();
			
		System.out.println("The lottery numbers were:" + lottery1 + "," + lottery2 + ",and " + lottery3);
			
		//display results
		if ((guess1 == lottery1) && (guess2 == lottery2) && (guess3 == lottery3)){
			System.out.println("You won $1,000!");
		}
		
		else if ((guess1 == lottery1) ||(guess2 == lottery2)){
			System.out.println("You won $100!");
		}
		
		else if ((guess1 == lottery1)|| (guess3 == lottery3)){
			System.out.println("You won $100!");
		}
			
		else if ((guess2 == lottery2) || (guess3 == lottery3)){
			System.out.println("You won $100!");
		}
			
		else {
			System.out.println("Sorry, play again next week!");
		}
	}
}	
