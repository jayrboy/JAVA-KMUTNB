package loop;

public class WhileLoop1 {
    public static void main(String[] args) {
        int i=1, sum=0;
        while(i<=199){
            System.out.println("i = "+i);
            sum = sum + i;
            i++;
        }
        System.out.println("sum = "+sum);
    }
    
}
