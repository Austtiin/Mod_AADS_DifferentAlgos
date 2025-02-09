/*
 * recursive.java
 * class to calculate the multiplication table recursively
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
public class recursive {
	public void recur(int n, int i, int j) {
		//Pass in n, i, and j to the recur method 
		//n is the number of terms
		//i is the current row
		//j is the current column
		
		if (i > n) {
			//If i is greater than n, return
			//If our current row is greater than our number of terms, return
            return;
        }
        if (j > 10) {
        	//If j is greater than 10, print a new line and call recur again
        	//If our current column is greater than 10, print a new line and call recur again
            System.out.println();
            recur(n, i + 1, 1);
            //Increment i by 1 and set j to 1
            //Call recur with n, i, and 1 as the arguments because we are starting a new row
            
            return;
        }
        System.out.printf("%4d", i * j);
        //Print the product of i and j with a width of 4 for formatting
        recur(n, i, j + 1);
        //Increment j by 1 and call recur again to print the next column in the row
	}

}
