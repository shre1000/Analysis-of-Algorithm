
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class FortuneTeller {
	public static void main(String[] args ) {
		
		Scanner keyboard = new Scanner(System.in);
			
		System.out.println ("Welcome to FortuneTeller_JP!");
		System.out.println ("Answer the questions, and I shall divine your fortune!");
		System.out.println ( );
		
		System.out.println ("First, what's your name?");
		String name = keyboard.nextLine();
		 

		System.out.println ("Enter a number between 1 and 8, or enter -1 to stop playing");
		int number = keyboard.nextInt();
		while (number != -1){
			keyboard.nextLine();
				
			for(int i = 1; i <= number; i++){			
				System.out.println ();
				System.out.println (i);
			}
				
				System.out.println ("Enter a color (Red, Green, Blue, or Yellow)");
				String color = keyboard.nextLine().toLowerCase();
				int color2 = color.length();
				
				for (int charIndex = 0; charIndex < color2; charIndex++) {
					System.out.println(color.charAt(charIndex));
				}
				
				
				System.out.println (name + ", your fortune is as follows: ");
				System.out.println ();
				
				int number2 = number + color2;
	
				if (number2 == 4){
				System.out.println("Wear some brown pants next time you go to a scary movie (you'll thank me later).");
				}
				else if (number2 == 5){
				System.out.println ("You're single and ready to mingle...and if you're in a relationship, you're ABOUT to single and ready to mingle!");
				}
				else if (number2 == 6){
				System.out.println ("Something good is gonna happen...to the person next to you. Tough Luck buddy :^( ");
				}
				else if (number2 == 7){
				System.out.println ("Keep your eyes to the ground, and you'll find a whooping 5 cents today!");
				}
				else if (number2 == 8){
				System.out.println("You're gonna eat too much this Sunday - keep some Pepto Bismol at the ready.");
				}
				else if (number2 == 9){
				System.out.println ("Disappointment is a part of life, so don't feel too bad once your next paycheck come in.");
				}
				else if (number2 == 10){
				System.out.println ("Omae wa mou Shinderu.");
				}
				else if (number2 == 11){
				System.out.println ("Get off the computer and socialize, you lazy bum!");
				}
				else if (number2 == 12){
				System.out.println("There's a high chance that someone in the same building as you is/will be a murderer (Don't look behind you....).");
				}
				else if (number2 == 13){
				System.out.println ("Someone will do a nice thing for you. Yay!");
				}
				else if (number2 == 14){
				System.out.println ("You'll take a nice nap later on today.");
				
				}
			System.out.println ();
			System.out.println ("Enter a number between 1 and 8, or enter -1 to stop playing.");
			number = keyboard.nextInt();
			}
				
			while (number == -1){
			System.out.println ("Farewell " + name + ", and may Lady Fortune continue to smile upon you!");
			break;
			}
					
	}
}
