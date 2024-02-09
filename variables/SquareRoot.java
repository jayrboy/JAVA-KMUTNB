package variables;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print("a = ");
        double  a = kb.nextDouble(); // 2
        System.out.print("b = ");
        double  b = kb.nextDouble(); // 5
        System.out.print("c = ");
        double  c = kb.nextDouble(); // 2
        
        double t = Math.sqrt(b*b - 4*a*c);
        double x1 = (-b + t) / (2*a);
        double x2 = (-b - t) / (2*a);
        System.out.println("x1 = "+ x1 + ", x2 = "+ x2); // x1=-0.5, x2=-2.0
    }
    
}
