package loop;

import java.util.Scanner;

public class IncreasingNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print(">> ");
        int n=kb.nextInt();
        boolean is_increasing= true;
        int d, right_of_d = 99;
        while( n >=  right_of_d ) {
            d = n%10;
            n /= 10;
            if(d >= right_of_d) {
                is_increasing = false;
                break;
            }
            right_of_d = d;
        }
        if(is_increasing)
            System.out.println("Yes, this is an increasing-digit number");
        else
            System.out.println("No, this is not an increasing-digit number");
    }
    
}
