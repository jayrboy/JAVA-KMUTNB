import java.util.Scanner;

public class FindMax2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a Number :");   int n = kb.nextInt();
        System.out.print("Enter" +1+ "# : "); int a = kb.nextInt();
        
        int max = a;
        for (int j = 2; j < n; j++) {
            System.out.print("Enter"+j+ "# : ");
            a = kb.nextInt();
            if(a > max) max = a;
        }
        System.out.println("Max = "+max);
    }
    
}
