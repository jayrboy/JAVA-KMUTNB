package loop;

import java.util.Scanner;

public class Interest1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Interest = ");    // 5.0
        double r=kb.nextInt();
        int year=0;
        double balance = 100000;
        while(balance<=1000000) {
            year++;
            balance=balance+(balance*r/100);

        }
        System.out.print(year+" years for ");
        System.out.print("Deposit compound "+ r +" % ");
        System.out.print(" interrest ");
        System.out.println("about 1,000,000");
    }
    
}
