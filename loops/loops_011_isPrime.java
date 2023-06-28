// Write a program in java to check if a number is prime or not.
// sample input: 3
// sample output: 3 is a prime number.
// Explanation: 3 is only divisible by 1 and 3 so it's a prime number.

// Approach:
/*
    Prime number is a number that is greater than 1 and divided by 1 or itself only.
    In other words, prime numbers can't be divided by other numbers than itself or 1.
    For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
    Note: 0 and 1 are not prime numbers.
    
    Brute Force Approach:
    A simple solution is to iterate through all numbers starting from 2 to n-1 and for every number check if it divides n.
    If we find any number that divides, we return false.
    else we return true.
    Time Complexity: O(n)
    
    4 = {1*4 , 2*2 , 4*1}           sqrt(4) = 2;
    6 = {1*6 , 2*3 , 3*2 , 6*1}     sqrt(6) = 2.44 = 2;
    8 = {1*8 , 2*4 , 4*2 , 8*1}     sqrt(8) = 2.82 = 2;
    9 = {1*9 , 3*3 , 9*1}           sqrt(9) = 3;

    Note that the highest divisor of a number n can be sqrt(n), also after sqrt(n) the pairs are repeating in interchanged order. n = √n * √n
    
    Optimized Approach:
    A better approach is to check if a number is divisible by any number from 2 to square root of that number.
    If we find any number that divides, we return false.
    else we return true.
    Time Complexity: O(sqrt(n))

 */

import java.util.*;

public class loops_011_isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating object to scanner class to take inputs.
        System.out.println("Enter a number: ");
        int n = sc.nextInt(); // taking input from the user.
        boolean isPrime = true; // initializing a boolean variable to true.
        if (n < 2) { // checking if the number is less than 2 or not.
            isPrime = false; // if the number is less than 2 then it's not a prime number.
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // iterating from 2 to sqrt(n).
            if (n % i == 0) { // checking if the number is divisible by any number from 2 to sqrt(n).
                isPrime = false; // if the number is divisible by any number from 2 to sqrt(n) then it's not a
                                 // prime number.
                break; // break the loop if the number is divisible by any number from 2 to sqrt(n).
            }
        }
        if (isPrime) { // checking if the number is prime or not.
            System.out.println(n + " is a prime number."); // if the number is prime then print the number is prime.
        } else {
            System.out.println(n + " is not a prime number."); // if the number is not prime then print the number is
                                                               // not prime.
        }
        sc.close(); // closing the scanner class object to prevent data leak.
    }
}
