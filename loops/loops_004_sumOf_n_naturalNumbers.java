// Write code in java to print sum of first n natural numbers.
// sample input: 6
// sample output: 21
// Exaplanation: 1+2+3+4+5+6 = 21

import java.util.*;

public class loops_004_sumOf_n_naturalNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // creating object to scanner class to take inputs.
        System.out.println("Enter value of n ");
        int n = sc.nextInt(); // taking input from the user.
        int sum = 0, i = 1; // loop iterator initialization starts with 1 as we are finding sum from 1 to n.
                            // Sum is initialized to 0 as we are adding values to it.
        while (i <= n) { // condition is iterate till i is less then or equal to n
            sum += i; // adding the value of i to sum
            i++; // incrementing the iterator.
        }
        System.out.println("Sum of first " + n + " natural numbers is : " + sum); // printing the sum of first n natural
                                                                                  // numbers.
        sc.close(); // closing the scanner object to prevent data leak.
    }
}
