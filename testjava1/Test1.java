package testjava1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("a = ");
        int a  = kb.nextInt();
        System.out.print("b = ");
        int b  = kb.nextInt();
        
//        if (a < b) {
//            System.out.println(a +" < "+b);
//            System.out.println("min = "+a);
//            System.out.println("max = "+b);
//        }else {
//            System.out.println(a+">"+b);
//            System.out.println("min = "+b);
//            System.out.println("max = "+a);
//        }
  
        int max , min;
        
        if (a < b) {
            min = a;
            max = b;
        }else {
            min = b;
            max = a;
        }
            System.out.println("Max = "+ max);
            System.out.println("Min = "+ min);
            int tripleMin = 3 * min;
            System.out.println("3 x "+ min + "=" + tripleMin);
    }
    
}
