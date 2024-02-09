package methods;

import java.util.Scanner;

public class TestGCD {
    public static void main (String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("n = ");
        int n=kb.nextInt();
        System.out.print("m = ");
        int m=kb.nextInt();
        int gcd=gcd(m, n);
        System.out.println("gcd = "+gcd);
    }
    
    public static int gcd(int n, int m) {
        int t;
        while(m > 0) {
            t = n%m;
            n=m;
            m=t;
        }
        return n;
    }
    
}
