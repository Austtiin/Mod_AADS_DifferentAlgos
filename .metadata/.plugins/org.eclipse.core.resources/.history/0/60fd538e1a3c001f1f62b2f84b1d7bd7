
/*
 * Main.java
 * class to run the solution
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

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();

		System.out.println("Iterative Approach: ");
		o.output(i, n);
		
		System.out.println("Recursive Approach: ");
		o.output(r, n);
		
		System.out.println("Completed");
		sc.close();
	}
}
