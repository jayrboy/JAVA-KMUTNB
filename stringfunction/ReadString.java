package stringfunction;

import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("FirstName = ");
        String name = kb.nextLine();
        System.out.println("Hello " + name);
        
        String s = "The Best";
        System.out.println(s);
        
        s = "The Bed";
        System.out.println(s);
        
        s = "Excellent";
        System.out.println(s);
        
        s = "A";
        for(int j=1; j<=10;j++) {
            s = s + "A";
            System.out.println("s = " + s);
        }
        
        s = "Hello World"; // index[11] = 0 ถึง 11-1
        int a = s.length();
        System.out.println("length = " + a);
    }
    
}
