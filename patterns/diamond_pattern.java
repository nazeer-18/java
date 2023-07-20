//write code in java to print diamond pattern
// sample input: 5
//sample output:
/* 
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/
// explanation :
//       *     i=1   n-i spaces  + (2*i)-1 stars => 5-1=4 spaces , (2*1)-1= 1 star
//      ***    i=2   n-i spaces  + (2*i)-1 stars => 5-2=3 spaces , (2*2)-1= 3 stars
//     *****   i=3   n-i spaces  + (2*i)-1 stars => 5-3=2 spaces , (2*3)-1= 5 stars
//    *******  i=4   n-i spaces  + (2*i)-1 stars => 5-4=1 spaces , (2*4)-1= 7 stars
//   ********* i=5   n-i spaces  + (2*i)-1 stars => 5-5=0 spaces , (2*5)-1= 9 stars
//------------------- inverted pattern
//   ********* i=5   n-i spaces  + (2*i)-1 stars => 5-5=0 spaces , (2*5)-1= 9 stars
//    *******  i=4   n-i spaces  + (2*i)-1 stars => 5-4=1 spaces , (2*4)-1= 7 stars
//     *****   i=3   n-i spaces  + (2*i)-1 stars => 5-3=2 spaces , (2*3)-1= 5 stars
//      ***    i=2   n-i spaces  + (2*i)-1 stars => 5-2=3 spaces , (2*2)-1= 3 stars
//       *     i=1   n-i spaces  + (2*i)-1 stars => 5-1=4 spaces , (2*1)-1= 1 star
import java.util.*; // importing util package to take input from user
public class diamond_pattern {
    public static void diamond(int n) // diamond() method that will print diamond pattern over n rows
    { 
        // outer loop 
        for(int i=1;i<=n;i++)
        {
            // for loop to print spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            // for loop to print stars
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println(); // to print the output in next line for every iteration
        }
        // reverse the loop to print inverted pattern
        for(int i=n;i>=1;i--)
        {
            // for loop to print spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            // for loop to print stars
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println(); // to print the output in next line for every iteration
        }

    }
    public static void main(String args[]) //main method
    {
       Scanner sc = new Scanner(System.in); // create Scanner class object to take input from user
       System.out.print("Enter value of n:");
       int n = sc.nextInt(); // taking input from the user
       diamond(n);  // calling diamond() method
       sc.close();   // close scanner class object
    }
}
