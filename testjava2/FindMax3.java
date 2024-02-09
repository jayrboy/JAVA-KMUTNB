package testjava2;

import java.util.Scanner;

public class FindMax3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = kb.nextInt();
        int max = Integer.MIN_VALUE;
    
//        System.out.println(Integer.MIN_VALUE); // -2147483648 = -2^31
//        System.out.println(Integer.MAX_VALUE); // 2147483647 = ( 2^31) - 1

        for (int j = 1; j <= n; j++) {
            System.out.print("Enter" +j+ "# : ");
            int a = kb.nextInt();
            if(a > max) max = a;
        }
        System.out.println("Max = "+max);
    }
    
}
