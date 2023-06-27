// Write a program in java to reverse a number using for loop.
// sample input: 1234
// sample output: 4321
// Exaplanation: 1234 is reversed to 4321.

import java.util.*;

public class loops_6_reverse_a_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // creating object to scanner class to take inputs.
        System.out.println("Enter a number ");
        int n = sc.nextInt(); // taking input from the user.
        int rev = 0; // initializing rev to 0 to store the reverse of the number.
        while (n > 0) { // condition is iterate till n is greater than 0
            rev = rev * 10 + n % 10; // adding the last digit of n to rev
            n = n / 10; // removing the last digit of n
        }
        System.out.println("Reverse of the number is : " + rev); // printing the reverse of the number.
        sc.close(); // closing the scanner object to prevent data leak.
    }
}
