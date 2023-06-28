// Program to print factorial of a number.
// sample input: 5  
// sample output: Factorial of 5 is 120
// Explanation: 5! = 1 x 2 x 3 x 4 x 5 = 120.

// Note: 0! = 1 do not confuse with ! operator. ! is a logical operator which is used to reverse the logical state of its operand. If a condition is true then Logical NOT operator will make false. In mathematics and computer science, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n. For example, 5! = 5 x 4 x 3 x 2 x 1 = 120.

/*
    Approach:
    1. Take a variable to store the factorial of a number, let's say factorial = 1.
    2. Run a loop from 1 to n.
    3. Multiply factorial with i.
    4. Print the factorial. 

    Example: for 5! 
    i    factorial
    1   1 x 1 = 1
    2   1 x 2 = 2
    3   2 x 3 = 6
    4   6 x 4 = 24
    5   24 x 5 = 120

 */

import java.util.*;

public class loops_013_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating object to scanner class to take inputs.
        System.out.println("Enter a number to print it's factorial: "); // asking user to enter a number.
        int n = sc.nextInt(); // taking input from the user.
        int factorial = 1; // initializing factorial variable to 1.
        for (int i = 1; i <= n; i++) { // iterating the loop from 1 to n.
            factorial *= i; // multiplying factorial with i.
        }
        System.out.println("Factorial of " + n + " is " + factorial); // printing the factorial.
        sc.close(); // closing the scanner object to prevent data leak.
    }
}
