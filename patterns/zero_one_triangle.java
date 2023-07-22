// write java code to print 0-1 triangle
// sample input : 5
/* sample output:
 *  1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
 */
// explanation:
// here each cell is represented as (i,j). if i+j is even then print 1 . othrewise print 0
// 1           (1,1) ->(i+j)=1+1->2 . as i+j is  even we printed 1
// 0 1         (2,1)(2,2) ->2+1=3 so print 0 . 2+2=4 so print 1
// 1 0 1       (3,1)(3,2)(3,3) ->3+1=4 so print 1 3+2=5 so print 0 3+3=6 so print 1
// 0 1 0 1     (4,1)(4,2)(4,3)(4,4)->4+1=5 so print 0. 4+2 = 6 so print 1 4+3 =7 so print 0 4+4= 8 so print 1
// 1 0 1 0 1   (5,1)(5,2)(5,3)(5,4)(5,5)-> 5+1=6 so print 1 5+2=7 so print 0 5+3=8 so print 1 5+4=9 so print 0 5=5=10 so print 1
import java.util.*; // importing util package to take input from user
public class zero_one_triangle {
    public static void zero_one(int n)// create zero_one() method that will print numbers 0-1 triangle over n rows
    {
        //outer loop
        for(int i=1;i<=n;i++)
        {
            // inner loop
            for(int j=1;j<=i;j++)
            { 
                //each cell is represented as (i,j)
                if((i+j)%2==0)
                {
                    System.out.print("1"+" ");
                }
                else
                {
                    System.out.print("0"+" ");
                }
            }
            System.out.println(); // to print the output in next line for every iteration
        }
    }
    public static void main(String args[]) //main method
    {
        Scanner sc = new Scanner(System.in);// create Scanner class object to take input from user
        System.out.print("Enter value of n:");
        int n = sc.nextInt(); // taking input from the user
        zero_one(n); // calling zero_one() method
        sc.close(); // close scanner class object
    }
}
