
import java.util.Scanner;
import java.util.Random;

public class Game21
{
	
public static Scanner keyboard = new Scanner (System.in);

public static void main (String [] args)
{
		
System.out.println("The game is called 21\nTry to get as close to 21" + " without going over and have a higher hand than the computer dealer.\n" + "Here we go!");
							
int play = 0;
int won = 0;
int lost = 0;
int tied = 0;
String ans;
char repeat = 'y';
int totalPlayer, totalDealer;
		
		
while (repeat == 'y' || repeat == 'Y')
{
	
play = play+1;
int total = generateCard();
System.out.println("The dealer is showing a " + total);
totalPlayer=Player();
			
if (totalPlayer ==-1)
{
System.out.println("You busted with a " + totalPlayer);
lost++;
}
			
else{
	
totalDealer = Dealer(total);

if (totalDealer ==-1)
{
System.out.println("The dealer has busted. You win!");
won++;
}

else if (totalDealer < totalPlayer)
{
System.out.println("The dealer has " + totalDealer + " and you have " + totalPlayer + "\nYou win!");
won++;
}

else if (totalDealer > totalPlayer)
{
System.out.println("The dealer has " + totalDealer + " and you have " + totalPlayer + "You lose!");
lost++;
}
				
else 

{
System.out.println("Tis a draw!");
tied++;
}
			
}

System.out.println("Would you like to play again? (y/n)");
ans = keyboard.nextLine();
repeat = ans.charAt(0);
			
			
}
			
System.out.println("Games played: " + play);	
System.out.println("Games won: " + won);
System.out.println("Games tied: " + tied);
System.out.println("Games lost: " + lost);
		
if (won > lost)
{
System.out.println("Must be your luck day!");
}	
		
else
{
System.out.println("Maybe just stick t penny slots...");
}
		
System.out.println("Have a good day!");	
		
}
	
public static int Player ()
{
int card = generateCard( );
int card2 = generateCard( );

if (card == 11 && card2 == 11)
{
card = 1;
}
		
int total2 = card + card2;
PlayerTotal(total2);
		
String ans1;
char repeat1;
		



System.out.println("Would you like another card? y / n?");
ans1 = keyboard.nextLine();
repeat1 = ans1.charAt(0);	


while (repeat1 == 'y'|| repeat1 == 'Y')
{	
card = generateCard( );


int total3 = total2 + card;

if (card == 11 && total3 > 21)
{
card = 1;
}
			
System.out.println("Your new card is " + card);
total2 += card;
PlayerTotal(total2);
			
if (total2 <= 21)
{
System.out.println("Would you like another card? y / n?");
ans1 = keyboard.nextLine();
repeat1 = ans1.charAt(0);					
}
			
else
{
total2 = -1;

repeat1 =' ';
}
			
}
		

return total2;
}
	

public static int generateCard ()
{
Random rand = new Random();
int card = rand.nextInt(14)+1;
if ((card >= 10 && card < 14))
{
card = 10;
}
else if (card == 14)
{
card = 11;
}
return card;
}
	
public static void PlayerTotal (int total)
{
if (total <= 21)
{
if (total >= 20 || total <= 21)
{
System.out.println("Your total is " + total + " that is pretty good");
}
else if (total >= 17 && total <= 19)
{
System.out.println("Your total is " + total + "That is good");
}
else if (total <=16 && total >= 12)
{
System.out.println("Your total is " + total + " bet you can do better");
}
else
{
System.out.println("It's only a " + total + "please do not stop");
}
}
else {
System.out.println("total is" + total);
}
}
	
	
public static int Dealer (int total)
{  
int card = generateCard( );  
if ((total == 11) && (card == 11)) 
{  
card = 1;    
}  
total += card;  
System.out.println("The dealer has " + total);  
while (total < 17) 
{ // takes cards until they get 17
card = generateCard( );   
if (card == 11) 
{   
if ((card + total) > 21) 
{     
card = 1;    
}   
}   
total += card;   
System.out.println("The dealer got " + card + " for a total of " + total);   
}  
if (total <= 21) 
{   
return total;  
}  
else return -1; 
} 
 
}
