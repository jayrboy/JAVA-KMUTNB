package loop;

public class SumDoWhile {
    public static void main(String[] args) {
        
        int k = 1, sum=0;
        do {
            System.out.println(k);
            sum = sum + k;
            k++;
        } while(k <= 10);
        System.out.println(sum);
        
        int j = 1, sum1=0;
        do {
            System.out.println(j);
            sum1 = sum1 + j;
            j=j+2;
        } while(j <= 199);
        System.out.println(sum1);
    }
    
}
