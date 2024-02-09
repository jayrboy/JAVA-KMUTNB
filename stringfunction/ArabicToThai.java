package stringfunction;

import java.util.Scanner;

public class ArabicToThai {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter digits : ");
        String inTxt = kb.nextLine();
        String outTxt = "";
        String arabicNumber = "0123456789";
        String thaiNumber = "๐๑๒๓๔๕๖๗๘๙";
        for(int j=0; j<inTxt.length(); j++) {
            String s=inTxt.substring(j, j+1);
            int k = arabicNumber.indexOf(s);
            if(k < 0)
                outTxt = outTxt + s;
            else
                outTxt = outTxt + thaiNumber.substring(k, k+1);
        }
        System.out.println(outTxt);
    }
}
