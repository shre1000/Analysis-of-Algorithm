
/*

Name: Mitchell Gauthier
Current Date: 11/15/2017
Sources Consulted: Notes from class lectures and textbook.

By submitting this work, I attest that it is my original work and that I did not violate the
University of Mississippi academic policies set forth in the M book.

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class P6Driver{
	public static void main(String [] args) throws FileNotFoundException {
		System.out.println("\nHello and welcome to your personal accountant.");
		Scanner scan = new Scanner(new File("data.txt"));
		
		Employee emp1 = new Employee();
		
		Employee[] emp = new Employee[20];
		
		for(int i =0; i<emp.length; i++){
			emp[i] = new Employee();
			}
			
		int index = 0;
		
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			if(line.length()>7){
					emp[index].setName(line);
					index++;
				if(index > 12){
					index = 0;
					}
			}	
				else if(line.length()==7){
						emp[index].setId(line);
						index++;
					if(index>12){
						index = 0;
						}
					}
				else{
					emp[index].setSalary(Integer.parseInt(line));
					index++;
				}
			}
			Scanner keyboard = new Scanner(System.in);
				System.out.println("\nChose from the following:\n");
				System.out.println("\t1. Print all the data.");
				System.out.println("\t2. Print the average salary");
				System.out.println("\t3. Find the boss with the highest salary");
				System.out.println("\t4. Find the newest employee with the lowest salary");
				
				System.out.println("\nEnter a number or -1 to exit\n");
				
				int response = keyboard.nextInt();
				
				while(response != -1){
					
					
					if(response == 1){
						Print(emp, index);
						}
					if(response == 2){
						Average(emp, index);
						}
					if(response == 3){
						Boss(emp, index);
						}
					if(response == 4){
						Newest(emp, index);
						}
					
					System.out.println("\nIf you would like to make another selection, enter a number or -1 to exit\n");
					
					response = keyboard.nextInt();
					
					}
					
					
					

					System.out.println("Goodbye and have a wonderful day!");

}

					
					
					
					
public static void Print(Employee[] emp, int length){

	for(int i = 0; i<length; i++){
		System.out.println("Name: " + emp[i].getName() + " ID#: " + emp[i].getId() + " Salary: " + emp[i].getSalary());
		}
}

public static void Average(Employee[] emp, int length){
	int sum = 0;
	for(int i = 0; i < length; i++){
		sum += emp[i].getSalary();
		}
	int average;
	
	average = sum/length;
	
	System.out.println("The average salary is " + average + " dollars.");
}

public static void Boss(Employee[] emp, int length){
	int highest;
	highest = emp[0].getSalary();
	int index =0;
	
	for(int i = 0; i<length; i++){
		if(emp[i].getSalary()>highest){
			highest = emp[i].getSalary();
			index = i;
			}
		}
	System.out.println("The Boss with the highest salary: ");
	System.out.println("Name: " + emp[index].getName() + " ID#: " + emp[index].getId() + " Salary: " + emp[index].getSalary());
					
}

public static void 	Newest(Employee[] emp, int length){
				
	int lowest;
	lowest = emp[0].getSalary();
	int index=0;
	
	for(int i =0; i<length; i++){
		if(emp[i].getSalary()<lowest){
			lowest = emp[i].getSalary();
			index = i;
			}
		}
	
	System.out.println("The newest employee with the lowest salary: ");
	System.out.println("Name: " + emp[index].getName() + " ID#: " + emp[index].getId() + " Salary: " + emp[index].getSalary());
	}
}
	
					
					
					
					
					
					
					
					
					
					
					
					
						
				
				
				
				
				
				
