package selection;

import java.util.Scanner;

public class FineBMI {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter weight (kg.) = ");  double w = kb.nextDouble();
        if (w <= 10) {
            System.out.println("Very Bad !");
            System.exit(0);
        }
        System.out.print("Enter height (cm.) = ");  double h = kb.nextDouble();
        if (h == 0) {
            System.out.println("--Please Enter Height Again--");
            System.exit(0);
        }
        double hm = h/100;
        double bmi = w/(hm*hm);
        
        System.out.println("BMI = "+ bmi);
    }
    
}
