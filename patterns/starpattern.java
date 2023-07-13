// java code to print the star pattern by taking user input 
// Sample input 4
// sample output 
// *
// **
// ***
// **** 
//As you can see The number of lines are four And the stars in lines are in ascending order 

import java.util.*;  
class Starpattern
{
    public static void main(String[]args)
    {
        int i,j;
        Scanner sc=new Scanner(System.in); // Creating an object named sc which is used to take user input
        int n=sc.nextInt();   //Take the input 
        for(i=0;i<n;i++)       //Loop Which is used for iterations of printing the stars
        {
            for(j=0;j<i+1;j++)  //As we carefully observe the pattern we can see that For i value 0 there is 1 star and i Value 1 there are two stars and So on Giving us the logic of number of stars for line i are i+1
            {
                System.out.print("*"); //Used to print stars in a line (*),
            }
            System.out.println(""); //to add line break
        }

    }
}