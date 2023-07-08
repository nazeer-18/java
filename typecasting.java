/* Type Casting: It is also called as Explicit conversion or Narrowing conversion
 i.converting a larger type to a smaller size type (manually)
ii.double -> float -> long -> int -> char -> short -> byte
 * 
 */
public class typecasting {
    public static void main(String args[])
    {
        float a = 9.18f;
        int b = (int)a; /*converting float to int , as float is larger type and 
                          we are converting it to smaller data type int*/
        System.out.println(b); // output: 9
        long c=255908;
        int d= (int)c; /*  in type conversion this is not possible
                            but we can convert long to int explicitly by type casting  */
        System.out.println(d); // output: 255
    }
}
