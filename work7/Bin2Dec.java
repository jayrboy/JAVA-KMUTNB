package work7;

import java.util.Scanner;

public class Bin2Dec {
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            String s = kb.next();
            int sum = 0;
            
            for(int k=2, p=0; k>=0; k=-1 , p++) {
                int d = Integer.parseInt(s,k);                // แปลง String เป็น Integer
                int b = (int) (Math.pow(k, p)); 
                sum= sum + d * b;
            }
            System.out.println(sum);
    }
    
}
