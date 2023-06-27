import java.util.*;
public class loops_3_print_one_to_n_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);    // creating object to scanner  class to take inputs.
        System.out.println("Enter value of n ");
        int n = sc.nextInt();   // taking input from the user.
        int i = 1;  // loop iterator initialization starts with 1 as we are printing from 1 to  n.
        while(i<=n){    // condition is iterate till i is less then or equal to n
            System.out.print(i+" ");    // at each iteration output the value of iterator i.e i
            i++;    // incrementing the iterator.
        }
        sc.close(); // closing the scanner object to prevent data leak.
    }
}