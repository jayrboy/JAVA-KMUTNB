package methods;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("a = ");   double a = kb.nextDouble(); //1
        System.out.print("b = ");   double b = kb.nextDouble(); //-3
        System.out.print("c = ");   double c = kb.nextDouble(); //-4
        quadraticAns(a, b, c);  //x1 = 4.0, x2 = -1.0
    }
    
    public static void quadraticAns(double a, double b, double c) {
        if (b*b  < a*a*c || a == 0) {
            System.out.println("............Can't find values...........");
            System.out.println("b*b < || = 4*a*c");
            return;
        }
        double k = Math.sqrt(b*b - 4*a*c);  //2 -1 1 = NaN
        double x1 = (-b + k) / (2*a);
        double x2 = (-b - k) / (2*a);
        System.out.println("x1 = " + x1);
        System.out.println("x1 = " + x2);
        
    }
    
}
