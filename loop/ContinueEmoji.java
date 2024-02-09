package loop;

import java.util.Scanner;

public class ContinueEmoji {
    public static void main(String[] args) {
        System.out.println("Emoji 1-5 any number break");
        
        int i=0;
        while(i <= 2) {
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter number 1-5 : ");
            int e = kb.nextInt();
            
            if (e == 1) {
                System.out.println("TT");
                continue;
            }
            else if (e == 2) {
                System.out.println(":3");
                continue;
            }
            else if (e == 3) {
                System.out.println(":)");
                continue;
            }
            else if (e == 4) {
                System.out.println(":(");
                continue;
            }
            else if (e == 5) {
                System.out.println("^_^");
                continue;
            }
            else
                break;  
        }
        System.out.println("Good Bye :P");
        
      
            
        
    }
    
}
