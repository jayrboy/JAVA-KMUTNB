import java.util.Scanner;

public class FindMax3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = kb.nextInt();
        int max = Integer.MIN_VALUE;
        
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        for (int j = 1; j <= n; j++) {
            System.out.print("Enter" +j+ "# : ");
            int a = kb.nextInt();
            if(a > max) max = a;
        }
        System.out.println("Max = "+max);
    }
    
}
