//write code in java to print hollow rectangle for the given dimensions
// sample input: rows = 5
//               columns=6
// sample output:
/*
    ****** 
    *    *
    *    *
    *    *
    ******
 */
// explanation:
// Stars are printed only at the borders 
/*  
  if i==1 or i== 5 or j==1 or j==6  print stars otherwise print empty spaces
    ****** (1,1)(1,2)(1,3)(1,4)(1,5)(1,6) 
    *    * (2,1)                    (2,6)
    *    * (3,1)                    (3,6)
    *    * (4,1)                    (4,6)
    ****** (5,1)(5,2)(5,3)(5,4)(5,5)(5,6)
*/

import java.util.*; // importing util package to take input from user
public class hollow_rectangle_pattern {
    // create hollow_rectangle method that will print hollow rectangle over n rows
    public static void hollow_rectangle(int totRows, int totCols)
    {
        // loop for rows
        for(int i=1;i<=totRows;i++)
        {
            // loop for columns
            for(int j=1;j<=totCols;j++)
            {
                if(i==1 || i== totRows || j==1 || j==totCols) // boundary case
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); // to print the output in next line for every iteration
        }
    }
    public static void main(String args[]) //main method
    {
        Scanner sc = new Scanner(System.in); // create Scanner class object to take input from user
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt(); // taking row input from the user
        System.out.print("Enter number of columns:");
        int columns=sc.nextInt(); // taking column input from the user
        hollow_rectangle(rows,columns); //calling hollow_rectangle() method
        sc.close(); // close scanner class object 
    }
}

