package loop;

import java.util.Scanner;

public class AverageFor {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=10;i++) {
            System.out.print(">> ");    int x = kb.nextInt();
            sum = sum+i;
        }
        double avg = sum / 10.0;
        System.out.println("Average = " + avg);
    }
    
}
