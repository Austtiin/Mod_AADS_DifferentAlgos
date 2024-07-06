/*
 * iterative.java
 * class to calculate the multiplication table iteratively
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

public class iterative {
	public int iter(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
		return n;
	}
}
