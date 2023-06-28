// write a program in java that asks the user to enter a number repeatedly and print them, until the user enters a multiple of 10.
// sample input: 1 2 3 4 5 6 7 8 9 121 11 12 13 14 15 16 17 18 19 20
// sample output: 20
// Explanation: 20 is the multiple of 10 so the loop breaks and the program ends. Till 19 the loop iterates and prints the numbers as these are not the multiple of 10.

import java.util.*;

public class loops_009_break_example {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // creating object to scanner class to take inputs.
        while (true) { // this loop will iterate infinitely as the condition is always true.
            System.out.println("Enter a number: ");
            int n = sc.nextInt(); // taking input from the user.
            if (n % 10 == 0) { // checking if the number is multiple of 10 or not.
                break; // break the loop if it's multiple of 10.
            } else {
                System.out.println(n); // if the number is not a multiple of 10 then print the number.
            }
        }
        sc.close(); // closing the scanner object to prevent data leak.
    }
}
