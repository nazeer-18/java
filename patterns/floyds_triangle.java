// write a code in java to print floyd's triangle for the given dimensions
// sample input : n=5
/* sample output:
 * 1
   2 3
   4 5 6
   7 8 9 10
   11 12 13 14 15
 */
// explanation:
// take a variable counter and initialize it to 1 and increment it
// 1                    i=1 so 1 number is printed   -> 1
// 2 3                  i=2 so 2 numbers are printed -> 2,3
// 4 5 6                i=3 so 3 numbers are printed -> 4,5,6
// 7 8 9 10             i=4 so 4 numbers are printed -> 7,8,9,10
// 11 12 13 14 15       i=5 so 5 numbers are printed -> 11,12,13,14,15
import java.util.*; // importing util package to take input from user
public class floyds_triangle {
    public static void floyds(int n) // create floyds() method that will print floyds triangle over n rows
    {
       int counter=1; 
       // outer loop
       for(int i=1;i<=n;i++)
       {
        // inner loop to print numbers 
        for(int j=1;j<=i;j++)
        {
            System.out.print(counter+" ");
            counter++; // every time our number should be incremented by 1
        }
        System.out.println(); // to print the output in next line for every iteration
       }
    }
    public static void main(String args[]) //main method
    {
        Scanner sc = new Scanner(System.in); // create Scanner class object to take input from user
        System.out.print("Enter value of n:");
        int n=sc.nextInt(); // taking input from the user
        floyds(n); // calling floyds() method
        sc.close();  // close scanner class object
        
    }
}
