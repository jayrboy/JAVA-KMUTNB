package methods;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
//        System.out.print("Weigth kg. = ");
//        double weight = kb.nextDouble();
//        System.out.print("Height cm. = ");
//        double height = kb.nextDouble();
        double weight = readDouble(kb,"weight (kg.) = ");
        
        double height = readDouble(kb,"height (kg.) = ");
        
        double hm = height / 100.0;
        double bmi = weight / (hm * hm);
        System.out.println("BMI = " + bmi);
    }
    
    public static double readDouble (Scanner kb, String msg) {
        System.out.print(msg);
        double v = kb.nextDouble();
        return v;
    }
    
}
