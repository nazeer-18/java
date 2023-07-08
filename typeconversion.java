/*Type Conversion: It is also called as implicit conversion or widening conversion
 * type conversion happens when two data types are compatable i.e, we can convert int to float
 * but we cannot convert int to boolean 
 *  i. here destination type should always be greater than source type (destination type > source type )
 * ii. byte->short->int->float->long->double
 */
import java.util.*;
public class typeconversion{
    public static void main(String args[])
    {
        int a = 9;
        long b = a; // here integer is converted into long and this conversion is posssible  because long>int
        System.out.println(b); // output : 9
        long c = 55;
        int d = c;           /* here we are trying to convert long into int . this is not possible because 
                            destination  type (int) is less than source type (long ) */                       
        System.out.println(d);  // output: error -> Type mismatch: cannot convert from long to int
        char ch ='n';
        int e = ch; // converting char to int , it will print ASCII value of given character
        System.out.println(e); // output: 110               
    }
}