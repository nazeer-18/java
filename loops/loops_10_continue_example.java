// Write a program to print all the numbers except the numbers which are divisible by 10.
// sample input: 1 2 3 4 5 6 7 8 9 121 10 11 12 13 14 15 16 17 18 19 20
// sample output: 1 2 3 4 5 6 7 8 9 121 11 13 14 15 16 17 18 19
// Explanation: 10 , 20 are the multiple of 10 so the loop continues and these are not printed.

import java.util.*;

public class loops_10_continue_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating object to scanner class to take inputs.
        while (true) { // this loop will iterate infinitely as the condition is always true.
            System.out.println("Enter a number: ");
            int n = sc.nextInt(); // taking input from the user.
            if (n % 10 == 0) { // checking if the number is multiple of 10 or not.
                continue; // continue the loop if it's multiple of 10.
            } else {
                System.out.println(n); // if the number is not a multiple of 10 then print the number.
            }
        }
    }
}
