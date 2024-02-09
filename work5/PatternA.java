package work5;

import java.util.Scanner;

public class PatternA {
    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int k = kb.nextInt();
        int n = 6;
        System.out.println("Pattern A");
        
        for(int r=1; r<=n; r++) { //  row
            for(int c = 1; c<=r; c++) {   // column ทำถึง r
                System.out.print(c + " ");
            }
            System.out.println();
        }
        
    }
}
