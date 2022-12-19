import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        for(int k=1;k<=6;k++){
        Scanner kb =new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = kb.nextInt();
        
            if (a%2 == 0){
                a*=2;
                System.out.println(a);
            }
            else if (a > 10){
                a%=2;
            }
            else {
                a = 0;
            }
            System.out.println("a = "+a);
        }
    }
    
}
