
// Array: an array is a collection of similar type of elements which has contiguous memory location.
//Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
// We can store only the fixed size of elements in the array. It doesn't grow its size at runtime.
/* 
    Declaration an Array:

       syntax: dataType []arr;
        ex: int [] a;
              (or)  
       syntax: dataType arr[];  
        ex: int a[];

*/
/*
     Instantiation of an Array:

      syntax:  arr_name = new datatype[size];  
      ex:        marks  = new int[10];

 */
/*
     Initialization of an Array:

      syntax: arr_name[index]=value;
         ex:  marks[0]=99;
              marks[1]=95;

 */
/*
 * Declaration, Instantiation and Initialization together:
 *  syntax: datatype arr_name[]= {values};
        ex: int marks[]={99,95,98,96};
        ex: String fruits[]={"apple","mango","banana"};
 */
//Java Program to illustrate the use of declaration, instantiation and initialization 
public class ArrayBasics{  
   public static void main(String args[]){  
      int a[];      // declaration of an array
      a=new int[4]; // Instantiation of an Array       
      a[0]=33;      // Initialization of an Array 
      a[1]=2;
      a[2]=21;
      a[3]=61; 
    for(int i=0;i<a.length;i++) //printing array 
   {  
      System.out.println(a[i]);  
   } 
 }  
}

