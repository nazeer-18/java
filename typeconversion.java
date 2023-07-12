/*Type Conversion: It is also called as implicit conversion or widening conversion
 * type conversion happens when two data types are compatable i.e, we can convert int to float
 * but we cannot convert int to boolean 
 *  i. here destination type should always be greater than source type (destination type > source type )
 *  ii. byte->short->int->float->long->double
 */
// write a program to convert int to long 
// sample input: 9
// sample output: 9
// Explanation:  integer is converted into long and this conversion is posssible  because long>int
//program:
import java.util.*;
public class typeconversion{
    public static void main(String args[])
    {
        int a = 9;
        long b = a; 
        System.out.println(b); // output : 9
    }
}
// write a program to convert long to int 
// sample input: 55
// output: Type mismatch: cannot convert from long to int
// Explanation: we are trying to convert long into int , this is not possible because destination  type (int) is less than source type (long )
//program:
public class typeconversion{
    public static void main(String args[])
    {
        long c = 55;
        int d = c;                                 
        System.out.println(d);
    }
} 
// write a program to convert char to int
// sample input: n
// sample output: 110
// Explanation: converting char to int , it will print ASCII value of given character
//program:
public class typeconversion{
    public static void main(String args[])
    {
        char ch ='n';
        int e = ch;  
        System.out.println(e);               
    }
}
