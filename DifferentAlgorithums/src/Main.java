
/*
 * Main.java
 * class to run the solution
 * 
 * ***Solution is setup with different classes to provide a clean separation of concerns
 * ***Soulution provides a modular approach to solving the problem for Maintenance and Scalability
 * 
 * Austin Stephens
 * 07/05/2024
 * Rasmussen University
 * Professor Kumar
 * COT4530C Section 01 Algorithm and Data Structure Analysis
 * 
 * Write a Java program that outputs a multiplication table for numbers between 1 and 10. 
 * The value k for a specific run should be solicited from the user. 
 * Implement both the iterative and recursive approaches. 
 * Perform a test on the two algorithms using a low bound of k =1, 
 * median k = 5, and upper bound k = 10, 20, 50, and 100. and report on your 
 * performance (milliseconds) findings on these two algorithms 
 * (iterative and recursive).
 * 
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		recursive r = new recursive();
		iterative i = new iterative();
		outputTable o = new outputTable();
		//Start the classes for recursive, iterative, and outputTable

		Scanner sc = new Scanner(System.in);
		//New scanner object to get user input
		
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();
		//Get the number of terms from the user

		System.out.println("Iterative Approach: ");
		o.output(i, n);
		//Output the multiplication table using the iterative approach
		//Pass in the iterative object and the number of terms
		//We just created the iterative object above in the outputTable class
		
		System.out.println("Recursive Approach: ");
		o.output(r, n);
		//Output the multiplication table using the recursive approach
		//Pass in the recursive object and the number of terms
		//We just created the recursive object above in the outputTable class
		
		System.out.println("Completed");
		sc.close();
	}
}
