package selection;

import java.util.Scanner;

public class YearOfBirth {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int m = kb.nextInt(); int y = kb.nextInt();
        y+=543;
        
        if(m == 2){
            if((y%4 == 0) && (y%100!=0) || (y%400==0))
                System.out.println("29 Days");
            else
                System.out.print("28 Days ");
            }
            else if(m == 1 || m ==3 || m ==5 || m==8 || m==10 || m==12) {
            System.out.println("31 Days");
            }
            else if (m == 4 || m == 6 || m==9 || m==11) {
                System.out.println("30 Days");
            }
            else  {
               System.out.println("Error Please Enter Again ! (-1)");
            }
    }
}
