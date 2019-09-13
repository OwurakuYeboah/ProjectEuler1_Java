//This program solves Problem 1 of Project Euler which is as follows
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. 
//Find the sum of all the multiples of 3 or 5 below 1000.


public class Main {
	public static void main (String [] args) {
		eulerSolution = 0;	// Variable to hold solution
		
		for (int i = 0; i < 1000; ++i) {	// Loop through numbers below 1000
			if (i % 3 == 0)
				eulerSolution = eulerSolution + i;	// Add number if multiple of 3
			else if (i % 5 == 0)
				eulerSolution = eulerSolution + i;	// Add number if multiple of 5
		}
		// Display results and exit
		System.out.println("PROJECT EULER 1 SOLUTION")
		System.out.print("The sum of multiples of 3 and 5 below 1000 is: ");
		System.out.print(eulerSolution);
	}
}