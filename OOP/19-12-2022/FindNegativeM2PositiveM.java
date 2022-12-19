import java.util.Scanner;
public class FindNegativeM2PositiveM {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int m = kb.nextInt();
//        int result = m-m*2;
        int result= m;
                
         // -m, -m+1, ...0, 1, 2, ..., m
        while(result >= -m){
            System.out.println("M = "+result);
            result--;
        }
        
    }
    
}
