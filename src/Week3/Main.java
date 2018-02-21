/*
 * @project Week3
 * @author  Osbardo Rodriguez
 * Date:    2/20/18
 */
package Week3;

/*
 * Import the Scanner java package.
 */
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {

    	/*
    	 * Write a program that calculates the factorial of a number
    	 * between 1 and 8 inclusive as entered by the user
    	 */

    	// Instantiate the Scanner
    	Scanner input = new Scanner( System.in );

    	/*
    	 * Declare our variables
    	 */
    	int userVar;
    	int counter = 1;
    	int result = 1;

		/*
		 * Go from 1 to the user number
		 * Update result each time.
    	 */
		System.out.print( "Please enter a variable to get the factorial of: " );
		userVar = input.nextInt();

		/*
		 * When you write code that repeats, there are often 4 elements to the loop:
		 * 1) Identify a control variable - the key variable that controls whether we stay in the loop.
		 * 2) A test for the control variable
		 * 3) Once you've identified and tested for a control variable, you need to initialize the control variable.
		 * 4) Update the value of your control variable correctly inside the loop.
		 */
		while ( counter <= userVar ) {
			result = result * counter;
			++ counter;
		}

		// Print out the result.
		System.out.println( "The factorial of " + userVar + " is " + result );
    }
}
