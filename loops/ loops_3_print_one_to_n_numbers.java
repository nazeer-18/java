// Write code in java to print numbers from 1 to n using while loop.
// sample input: 6
// sample output: 1 2 3 4 5 6
// Exaplanation: 1 2 3 4 5 6 are the numbers from 1 to 6.

import java.util.*;

public class loops_003_print_one_to_n_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // creating object to scanner class to take inputs.
        System.out.println("Enter value of n ");
        int n = sc.nextInt(); // taking input from the user.
        int i = 1; // loop iterator initialization starts with 1 as we are printing from 1 to n.
        while (i <= n) { // condition is iterate till i is less then or equal to n
            System.out.print(i + " "); // at each iteration output the value of iterator i.e i
            i++; // incrementing the iterator.
        }
        sc.close(); // closing the scanner object to prevent data leak.
    }
}
