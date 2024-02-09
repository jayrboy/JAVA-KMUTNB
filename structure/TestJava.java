package structure;

import java.util.Scanner;

public class TestJava {
    public static void main(String[]args) {
            System.out.println("Hello Program JAVA");    // Comment
            System.out.println("JDK 19.0.1");
            System.out.println("Apache NetBeans IDE 16\n");
            
            System.out.println("First Time 6-12-2022\n08:00-12:00 AM");
            System.out.println("Data Structure and Algorithm\n");
            
            
            System.out.println("Program Convertor Temperature Celsius to Fahrenheit");
            Scanner kb=new Scanner(System.in);
            // System.out.print("ป้อนอุณหภูมิ (ฟาเรนไฮน์) = ");
            // float fahren=kb.nextFloat();
            // float cel = (fahren-32)*5/9;
            // System.out.println(fahren+" องศาฟาเรนไฮน์ = "+ cel +" องศาเซลเซียส");

            System.out.print("Enter temperature (Celsius) = ");
            float cel=kb.nextFloat();

            float fahren = (cel*9/5)+32;
            System.out.println(cel+" Celsius  = "+ fahren +" Fahrenheit");
            
    }
    
}
