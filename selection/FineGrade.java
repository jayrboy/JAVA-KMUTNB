package selection;

import java.util.Scanner;

public class FineGrade {
    public static void main(String[] args) {
        System.out.print("Please enter your grade = ");
        Scanner kb = new Scanner(System.in);
        int grade = kb.nextInt();
        String s="";
        switch (grade) {
            case 4 : s = "Easy งั้นๆ";    break;
            case 3 : s = "พื้นพื้น";    break;
            case 2 : s = "พอได้";    break;
            case 1 : s = "เยี่ยม";    break;
            case 0 : s = "ขึนสวรรค์"; break;
            default : s =".<";
//            case 0 -> s = "ขึนสวรรค์"; break;
        }
        System.out.println(grade + " = " +s);
        
        
    }
    
}
