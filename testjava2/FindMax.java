package testjava2;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter 1# : ");
        int a = kb.nextInt();
        System.out.print("Enter 2# : ");
        int b = kb.nextInt();
        System.out.print("Enter 3# : ");
        int c = kb.nextInt();
        System.out.print("Enter 4# : ");
        int d = kb.nextInt();
        System.out.print("Enter 5# : ");
        int f = kb.nextInt();
        
        int max = f;
//        if (a>b && a>c && a>d && a>f)     ไม่นิยม หากมีข้อมูลล้านๆ ไม่สามารถนำไป loop ได้
//            max = a;
        if (a > max) max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("Max = "+max);
    }
}
