package structure;
import java.util.Scanner;

public class DisplayPrintF {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int k = kb.nextInt();
        int num1, num2, num3, num4, num5;
        
        num1 = num2 =num3 =num4 =num5 = 0;
        
        for (int i = 2; i <= k ; i++) {
            int sum = 0;
            for (int j = 1; j <=5; j++) {
                int v =  i*j;
                System.out.printf("%6d", v);
                sum+= v;
            }
            System.out.printf(" %6d\n ",sum);
        }

    }
}
