// write a java code to print solid rhombus for given dimensions
// sample input: n=5
// sample output:
/*
 *        *****
         *****
        *****
       *****
      *****
 */
// explanation: n-i spaces are printed + n stars are printed
import java.util.*; // importing util package to take input from user
public class solid_rhombus {
    public static void rhombus(int n) // create rhombus() method that will print solid rhombus over n rows
    {
        // outer loop
        for(int i=1;i<=n;i++)
        {
            // for loop to print spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            // for loop to print stars
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println(); // to print the output in next line for every iteration
        }
    }
    public static void main(String args[]) //main method
    {
        Scanner sc = new Scanner (System.in); // create Scanner class object to take input from user
        System.out.print("Enter number of rows:");
        int n = sc.nextInt(); // taking input from the user
        rhombus(n); // calling rhombus() method
        sc.close(); // close scanner class object
    }
}
