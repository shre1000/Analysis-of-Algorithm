

import java.util.*;

class Maximum_subarray{
public static void max_sub(int input[])//method to calculate maximum subarray
{
    if (input == null || input.length == 0)
        throw new IllegalArgumentException("Array is empty.");
 
    int size = input.length;
 
    int Max_Sum = input[0];
    int Max_Start_Index = 0;
    int Max_End_Index = 0;
 
    int Current_Sum = input[0];
    int Current_Start_Index = 0;
 
    for (int i = 1; i < size; i++)
    {
        if (Current_Sum < 0)
        {
            Current_Sum = 0;
            Current_Start_Index = i;
        }
 
        Current_Sum = Current_Sum + input[i];
 
        if (Current_Sum > Max_Sum)
        {
            Max_Sum = Current_Sum;
            Max_Start_Index = Current_Start_Index;
            Max_End_Index = i;
        }
    } 
  
    System.out.println("Start index is: "+ Max_Start_Index);
    System.out.println("End index is: "+ Max_End_Index);
    System.out.println("Sum is= " + Max_Sum);
    
    System.out.println("Maximum subarray is: ");
    for(int i = Max_Start_Index; i<=Max_End_Index; i++)
    {
	   System.out.print(input[i] + " ");
	
    }

}

public static void main(String args[])
{

	Scanner scan = new Scanner(System.in);
	
    System.out.println("This is program for calculating maximum subarray.");
    
    System.out.println("Enter number of elements of array.");
    int n = scan.nextInt();
    int b[]= new int[n];
    
    System.out.println("Enter array elements.");
    for(int i=0; i<n; i++)
    {
	  b[i] = scan.nextInt();
	
    }
    
    scan.close();
    
    max_sub(b);
    
}
}
