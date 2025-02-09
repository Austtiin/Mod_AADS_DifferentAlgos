/*
 * outputTable.java
 * class to output the multiplication table
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

public class outputTable {
	
	
	public void output(iterative i, int n) {
		System.out.println("       1   2   3   4   5   6   7   8   9  10");
		System.out.println("------------------------------------------------");
		long startTime = System.nanoTime();
		i.iter(n);
		//Start iteration from 1 to n
		//Pass in the number of terms
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000;
		System.out.println("Duration: " + duration + " milliseconds");
		//Print the duration in milliseconds
	}

	public void output(recursive r, int n) {
		System.out.println("       1   2   3   4   5   6   7   8   9  10");
        System.out.println("------------------------------------------------");
        long startTime = System.nanoTime();
        
        r.recur(n, 1, 1);
        //Start recursion from 1 to n
        //Pass in the number of terms, the current row, and the current column
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println("Duration: " + duration + " milliseconds");
	}	
}
