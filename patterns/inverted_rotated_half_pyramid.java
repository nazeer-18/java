// write a java code to print inverted rotated half pyramid pattern for given dimensions
// sample input: n=4
// sample output:
/*
       *
      **
     ***
    ****
 */
// explanation : spaces + stars
//    *  i=1 (print (n-i)spaces + i stars ) so 4-1 = 3 spaces + 1 star
//   **  i=2 (print (n-i)spaces + i stars ) so 4-2 = 2 spaces + 2 stars
//  ***  i=3 (print (n-i)spaces + i stars ) so 4-3 = 1 spaces + 3 stars
// ****  i=4 (print (n-i)spaces + i stars ) so 4-4 = 0 spaces + 4 stars

import java.util.*; // importing util package to take input from user
public class inverted_rotated_half_pyramid {
    public static void pyramid(int n)  // create pyramid() method that will print inverted pyramid over n rows
    { 
        for(int i=1;i<=n;i++)
        {
            // use for loop to print space 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            // use for loop to print star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(); // to print the output in next line for every iteration
        }
    }
    public static void main(String args[]) //main method
    {
       Scanner sc = new Scanner(System.in); // create Scanner class object to take input from user
       System.out.print("Enter number of rows :"); 
       int n = sc.nextInt(); // taking input from the user
       pyramid(n); // calling pyramid() method
       sc.close(); // close scanner class object 
    }
}
