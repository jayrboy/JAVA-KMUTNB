package variables;

import java.util.Scanner;

public class Celsius2Fahrenheit {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print("c = "); // 100
        double c = kb.nextDouble();
        double f = (9 / 5) * c + 32;
        System.out.println("Temperature "+ c +" Celsius = "+ f + " Fahrenheit "); // 57.5
        
        double f1 = 9 * c / 5 + 32;
        System.out.println("Temperature "+ c +" Celsius = "+ f1+ " Fahrenheit "); // 77.9 *
        
        double f2 = c / 5 * 9 + 32;
        System.out.println("Temperature "+ c +" Celsius = "+ f2+ " Fahrenheit "); // 77.9 *
        
        double f3 = 9 / 5 * c + 32;
        System.out.println("Temperature "+ c +" Celsius = "+ f3+ " Fahrenheit "); // 57.5
    }
    
}
