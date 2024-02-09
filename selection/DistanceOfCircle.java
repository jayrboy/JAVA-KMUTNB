package selection;

import java.util.Scanner;

public class DistanceOfCircle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("R1 = "); double r1 = kb.nextDouble();
        System.out.print("X1 = "); double x1 = kb.nextDouble();
        System.out.print("Y1 = "); double y1 = kb.nextDouble();
        
        System.out.print("R2 = "); double r2 = kb.nextDouble();
        System.out.print("X2 = "); double x2 = kb.nextDouble();
        System.out.print("Y2 = "); double y2 = kb.nextDouble();
        
        double R = r1 + r2;
        if (Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2) <= R*R) {
            System.out.println("วงกลมสองวงนี้แตะกันหรือทับกัน");
        
        } 
        
    }
    
}
