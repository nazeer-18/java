// write a java code to print inverted half pyramid with numbers pattern for given dimensions
// sample input: n=5
// sample output:
/*
 *  1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
 */
// explanation:
//  1 2 3 4 5  i=1  print numbers from 1 to n-i+1 => 5-1+1 = 5 . print (1 to 5) numbers
//  1 2 3 4    i=2  print numbers from 1 to n-i+1 => 5-2+1 = 4 . print (1 to 4) numbers
//  1 2 3      i=3  print numbers from 1 to n-i+1 => 5-3+1 = 3 . print (1 to 3) numbers
//  1 2        i=4  print numbers from 1 to n-i+1 => 5-4+1 = 2 . print (1 to 2) numbers
//  1          i=5  print numbers from 1 to n-i+1 => 5-5+1 = 1 . print 1 

import java.util.*; // importing util package to take input from user
public class inverted_half_pyrmid_with_numbers { 
    public static void numbers_pyramid(int n) // create numbers_pyramid() method that will print numbers pyramid over n rows
    {
        //outer loop
       for(int i=1;i<=n;i++)
       {
        // inner loop to print numbers from 1 to n-i+1
        for(int j=1;j<=(n-i+1);j++)
        {
            System.out.print(j+" ");
        }
        System.out.println(); // to print the output in next line for every iteration
       }
    }
    public static void main(String args[]) //main method
    {
        Scanner sc = new Scanner(System.in); // create Scanner class object to take input from user
        System.out.print("Enter number of rows:");
        int n = sc.nextInt(); // taking input from the user
        numbers_pyramid(n); // calling numbers_pyramid() method
        sc.close(); // close scanner class object 
    }
}
