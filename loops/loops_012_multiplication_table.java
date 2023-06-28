// Program to print multiplication table of a number entered by a user in pretty form
// sample input: 2
// sample output: 2 x 1 = 2
//                2 x 2 = 4
//                2 x 3 = 6
//                2 x 4 = 8
//                2 x 5 = 10
//                2 x 6 = 12
//                2 x 7 = 14
//                2 x 8 = 16
//                2 x 9 = 18
//                2 x 10 = 20
// Explanation: 2 is the number entered by the user. The program will print the multiplication table of 2 till 10.

import java.util.*;

public class loops_012_multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating object to scanner class to take inputs.
        System.out.println("Enter a number to print it's multiplication table: "); // asking user to enter a number.
        int n = sc.nextInt(); // taking input from the user.
        for (int i = 1; i <= 10; i++) { // iterating the loop from 1 to 10.
            System.out.println(n + " x " + i + " = " + n * i); // printing the multiplication table.
        }
        sc.close(); // closing the scanner object to prevent data leak.
    }
}
