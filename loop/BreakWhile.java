package loop;

import java.util.Scanner;

public class BreakWhile {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double sum=0,n=0;
        while(true) {
            System.out.print(">> ");
            double x = kb.nextInt();
            if(x<0)
                break;
            sum+=x;
            n+=1;
        }
        System.out.println("Average = "+sum/n);
    }
    
}
