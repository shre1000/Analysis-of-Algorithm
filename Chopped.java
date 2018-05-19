
import java.util.Scanner;

public class Chopped{
	public static void main(String[] args)
	{
	
	// The program constants	
	final  double SPEED_CONSTANT = 1.609;
	final  double LENGTH_CONSTANT = 1609.34; 
	Scanner keyboard = new Scanner(System.in);
	
	String greeting = "Hello user! \nThis is my program and I hope you will like it!" ;
	System.out.println(greeting);
	
	//Question 1: The conversion from MPH to km/h
	System.out.print("Enter the value you want to convert from Miles per hour to Kilometers per hour: ");
	double Q1 = keyboard.nextDouble();
	double ans1 = Q1 * SPEED_CONSTANT;
	System.out.println("Your value in km/h system is: "+ ans1+ "\n");
	
	//Question 2: The conversion from km/H to MPH
	System.out.print("Enter the value you want to convert from Kilometers per hour to Miles per hour: ");	
	double Q2 = keyboard.nextDouble();
	double ans2 = Q2 / SPEED_CONSTANT;
	System.out.println("Your value in MPH system is: "+ ans2+ "\n");
	keyboard.nextLine();
	// Question 3: User's favourite dish 
	System.out.print("Enter your favourite dish: ");
	
	String Q3 = keyboard.nextLine();
	int StringSize = Q3.length();
	String Uppercase = Q3.toUpperCase();
	System.out.println("The length of your favourite dish is: "+StringSize+ "\nand your is favourite dish is "+Uppercase+"\n");
	 
	// Question 4: converting the distance from meters to miles
	System.out.print("Enter the distance you want to convert from meters to miles: ");
	double Q4 = keyboard.nextDouble();
	double ans4 = Q4 / LENGTH_CONSTANT;
	System.out.println("The distance in miles is: "+ ans4+"\n");
	
	//Question 5: converting the distance from miles to meters
	System.out.print("Enter the distance you want to convert from miles to meters: ");
	double Q5 = keyboard.nextDouble();	
	double ans5 = Q5 * LENGTH_CONSTANT;
	System.out.println("The distance in meters is: "+ ans5+"\n");
	
	// Question 6: converting the temperature from Fahrenheit to Celsius
	System.out.print("Enter the temperature in Fahrenheit you want to convert to Celsius: ");
	double Q6 = keyboard.nextDouble();	
	double ans6 = ((Q6 - 32.0) * (5.0/9.0));
	System.out.println("The temperature in Celcius is: "+ ans6 + " degrees"+"\n");
	
	//Question 7: converting the temperature from Celsius to Fahrenheit
	System.out.print("Enter the temperature in Celsius you want to convert to Fahrenheit: ");
	double Q7 = keyboard.nextDouble();
	double ans7 = (Q7 * (9.0/5.0) + 32.0);
	System.out.println("The temperature in Fahrenheit is: "+ ans7 + " degrees"+"\n");
	
	//Question 8: Converting the amount of cups to Milliliters
	System.out.print("Enter the amount of cups: ");
	double Q8 = keyboard.nextDouble();
	double ans8 = Q8 * 240;
	System.out.println("The amount in milliliters is: "+ ans8 + "\n");
	
	//Question 9: Converting the amount of Milliliters to cups 
	System.out.print("Enter the amount of Milliliters: ");
	double Q9 = keyboard.nextDouble();
	double ans9 = Q9 / 240;
	System.out.println("The amount of cups is: "+ ans9 + "\n");
	
	//Question 10: converting the amount of gas from liters to Gallons
	System.out.print("Enter the amount of gas in Liters: ");
	double Q10 = keyboard.nextDouble();
	double ans10 = Q10 / 3.78541;
	System.out.println("the amount of gas in Gallons: "+ ans10+"\n");
	
	//Question 11: converting the amount of gas from Gallons to liters 
	System.out.print("Enter the amount of gas in Gallons: ");	
	double Q11 = keyboard.nextDouble();
	double ans11 = Q11 * 3.78541;
	System.out.println("the amount of gas in Liters: "+ ans11+"\n");
	
	
	}
}
