package stringfunction;

import java.util.Scanner;

public class AEIOUfor {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String : ");
        String s = kb.nextLine().toLowerCase();
        int nVowels = 0;
        String vowels ="aeiou";
        for (int k=0; k < s.length(); k++) {
            String t = s.substring(k, k+1);
            if(vowels.indexOf(t) >= 0)
                nVowels += 1;
        }
        System.out.println("Number of vowels in String is " + nVowels);
    }
    
}
