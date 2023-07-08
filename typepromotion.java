/* Java automatically promotes each byte ,short or char operand to int when evaluating an expression
 * if one operand is long,float or double then whole expression is promoted to long,float or 
 * double respectively
 */
public class typepromotion {
    public static void main (String args[])
    {
        int a =20;
        float b = 19.98f;
        long c = 99;
        double d = 12;
        double ans =a+b+c+d;// a,b,c,d are converted into double 
        System.out.println(ans);// output:150.97999572753906
        byte e = 5;
        byte f=(byte) (e*2);
        System.out.println(f); // output:10
        /*  f= e*2;   here error will be dsplayed as: cannot convert from int to byte
                because java converts byte to int when evaluating an expression . so 10 is converted
                 into int and as e is byte , we cannot convert int to byte  by type conversion
                 so we do explicitly by type casting */
    }
}
