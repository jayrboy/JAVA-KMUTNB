package variables;

import java.util.Scanner;

public class CircleArea2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Radius = ");
        double r = kb.nextDouble();
        double pi = 3.14159;
        String msg = "Circle Area ";
        double area = pi * r * r;
        System.out.println(msg + r +" = "+ area);
    }
    
}
