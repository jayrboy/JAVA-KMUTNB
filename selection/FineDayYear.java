package selection;

import java.util.Scanner;

public class FineDayYear {
    public static void main(String[] args) {
        // ตรวจสอบในปีนั้น เดือนนั้น เดือนกุมถาพันธ์
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int y = kb.nextInt();
        
        if((y%4 == 0) && (y%100!=0) || (y%400==0))
            System.out.println("February 29 Days");
        else 
            System.out.println("February 28 Days");

    }
}
        
      
