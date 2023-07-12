/* Java automatically promotes each byte ,short or char operand to int when evaluating an expression
 * if one operand is long,float or double then whole expression is promoted to long,float or 
 * double respectively
 */
// the below program explains about how type promotion happens in java
/* explanation: a,b,c,d are converted into double because , the definition of type promotion states that if an expression has  one data type as long ,float or
*/ double then  whole expression is converted into long,float or double respectively
//program:
public class typepromotion {
    public static void main (String args[])
    {
        int a =20;
        float b = 19.98f;
        long c = 99;
        double d = 12;
        double ans =a+b+c+d;       // output:150.97999572753906
        System.out.println(ans); 
    }
}
// program 2:
// sample input : 5
// sample output :10
// explanation: 5*2=10
// here if we write  f= e*2 then error will be dsplayed as: cannot convert from int to byte because java converts byte to int when evaluating an expression 
// then the  value stored in variable f will be an integer and we cannot store int into byte , so we have to  type caste the int into byte
public class typepromotion {
    public static void main (String args[])
    {
        byte e = 5;
        byte f=(byte) (e*2);
        System.out.println(f); 
    }
}
