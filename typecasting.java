/* Type Casting: It is also called as Explicit conversion or Narrowing conversion
     i.converting a larger type to a smaller size type (manually)
     ii.double -> float -> long -> int -> char -> short -> byte
 */
// write a program to convert float into int 
// sample input: 9.18
//sample output: 9
// explanation: converting float to int , as float is larger type and  we are converting it to smaller data type int
// Program 1:
public class typecasting {
    public static void main(String args[])
    {
        float a = 9.18f;
        int b = (int)a;
        System.out.println(b); // output: 9
    }
}
// write a program to convert long into int
// sample input: 255908
//sample output: 255
// explanation: In type conversion this is not possiblebut we can convert long to int explicitly by type casting 
// Program:
public class typecasting {
    public static void main(String args[])
    {
        long c=255908;
        int d= (int)c; 
        System.out.println(d); // output: 255
    }
}
