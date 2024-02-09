package Array1D;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your Month = ");
        int m = kb.nextInt();
        if(1 <= m && m <= 12){
            String[] month = {"JAN", "FEB", "MAR", "ARP", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
            System.out.println(month[m-1]);
        }
        else   
            System.out.println("Error Number");
    }
    
}
