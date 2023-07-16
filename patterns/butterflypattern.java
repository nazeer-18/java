//write code in java to print butterfly pattern
// sample input: 4
//sample output:
/*   *      *   
     **    **   
     ***  ***   
     ********   
     ********
     ***  ***
     **    **
     *      *
*/
// explanation: stars + space + stars
//   *      *   i=1(1 star)+ spaces (here spaces are 6)=> 2*(n-i)   => 2*(4-1)=6 +stars  
//   **    **   i=2(2 stars)+ spaces (here spaces are 4) => 2*(n-i) => 2*(4-2)=4 +stars
//   ***  ***   i=3(3 stars)+ spaces (here spaces are 2) => 2*(n-i) => 2*(4-3)=2 +stars
//   ********   i=4(4 stars)+ spaces (here spaces are 0) => 2*(n-i) => 2*(4-4)=0 +stars
// ------------- just reverse the loop to print the below inverted pattern
//   ********   i=4(4 stars)+ spaces (here spaces are 0) => 2*(n-i) => 2*(4-4)=0 +stars
//   ***  ***   i=3(3 stars)+ spaces (here spaces are 2) => 2*(n-i) => 2*(4-3)=2 +stars
//   **    **   i=2(2 stars)+ spaces (here spaces are 4) => 2*(n-i) => 2*(4-2)=4 +stars
//   *      *   i=1(1 star)+ spaces (here spaces are 6)=> 2*(n-i)   => 2*(4-1)=6 +stars
import java.util.*; // importing util package to take input from user
public class butterflypattern {   
    public static void butterfly(int n)  // create butterfly() method that will print Butterfly over n rows
    {
        for(int i=1;i<=n;i++)
        { 
            // use for loop to print star  
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // use for loop to print space  
            for(int j=1;j<=2*(n-i);j++)
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
        for(int i=n;i>=1;i--) // reverse for loop to print inverted pattern
        {
            // use for loop to print star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // use for loop to print space 
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }           
             // use for loop to print star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) //main method
    {
        Scanner sc = new Scanner(System.in); // create Scanner class object to take input from user
        System.out.print("Enter value of n :");
        int n = sc.nextInt(); // taking input from the user
        butterfly(n); // calling butterfly() method
        sc.close(); // close scanner class object  
    }
    
}
