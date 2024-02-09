package loop;

import java.util.Random;
import java.util.Scanner;

public class TryNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is my magic number (1 to 100)  ?");
        Random rand = new Random();
        int myNumber= rand.nextInt(1,100);
        int nTries = 1;
        int yourGuess=-1;
        while(nTries < 7 && yourGuess != myNumber) {
            String msg = ""+ nTries+" >> ";
            if(nTries == 6)
                msg = msg + "(last chance) ";
            System.out.print(msg);
            yourGuess = kb.nextInt();
            if(yourGuess > myNumber)
                System.out.println("--> too high");
            if(yourGuess < myNumber)
                System.out.println("--> too low");
            nTries += 1;
        }
        if(yourGuess == myNumber)
            System.out.println("Yes! it's "+myNumber);
        else
            System.out.println("Sorry! my number is "+ myNumber);
    }
}
