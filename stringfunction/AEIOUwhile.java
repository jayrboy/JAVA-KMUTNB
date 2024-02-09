package stringfunction;

import java.util.Scanner;

public class AEIOUwhile {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("String : ");
        String s = kb.nextLine().toLowerCase();
        int nVowels = 0;
        int k = 0 ;
        String vowels ="aeiou";
        while(k < s.length()) {
            String t = s.substring(k, k+1);
            if(vowels.indexOf(t) >= 0)
                nVowels += 1;
            k+=1;
        }
        System.out.println("Number of vowels in String is " + nVowels);
    }
}
