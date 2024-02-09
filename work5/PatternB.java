package arrays;

import java.util.Scanner;

public class PatternB {
    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int k = kb.nextInt();
        int n = 6;
        System.out.println("Pattern B");
        
        for(int r=1; r<=n; r++) { //  row
            for(int m=1, c = r; c<=n; m++, c++) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}
