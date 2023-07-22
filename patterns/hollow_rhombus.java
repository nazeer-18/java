// write a java code to print hollow rhombus for given dimensions
// sample input: n=5
// sample output:
/*
 *        *****
         *   *
        *   *
       *   *
      *****
 */
// explanation:
//  n-i spaces are printed + n stars are printed only at the border
// when i==1 || i==n || j==1 || j==n stars are printed (boundary condition)
import java.util.*; // importing util package to take input from user
public class hollow_rhombus {
    public static void hollowrhombus(int n) // create hollowrhombus() method that will print hollow rhombus over n rows
    {
        //outer loop
        for(int i=1;i<=n;i++)
        {
            // inner loop to print spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            // loop to print stars at boundaries
            for(int j=1;j<=n;j++)
            {
               if(i==1 || i==n || j==1 || j==n)
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
        System.out.print("Enter value of n:");
        int n = sc.nextInt(); // taking input from the user
        hollowrhombus(n); // calling hollowrhombus() method
        sc.close();  // close scanner class object
    }
}
