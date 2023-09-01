// Passing Array to a Method in Java
/*
 * You can pass arrays to a method just like normal variables. 
 * When we pass an array to a method as an argument, actually the address of the array in the memory is passed (reference).
 * Therefore, any changes to this array in the method will affect the array.
 * To pass an array as an argument to a method, you just have to pass the name of the array without square brackets. 
 */
//Java Program to demonstrate the way of passing an array
// sample input:  98 86 93 96 90
// sample output: 99 87 94 97 91 
public class ArrayBasics1
{
    public static void update(int marks[]) //creating update method which receives an array as a parameter 
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;  // this method updates marks by adding 1
        }
    }
    public static void main (String args[]) // main function
    {
        int marks[]={98,86,93,96,90}; //declaring and initializing an array  
        update(marks); //passing array to method 
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" "); // printing array
        }
    }
}