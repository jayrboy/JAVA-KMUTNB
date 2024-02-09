package work5;

public class SumSeries {
    public static void main(String[] args) {
        System.out.println("1/3 + 3/5 + 5/7 +7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99 = 45.124450303050196 \n");

        double result, sum = 0;
        
        for(int i=1,j=i+2; i<=97; i+=2,j+=2) {
            result = ((double) i / j);
            System.out.println(i + " / " + j + " = " + result);
            sum = sum + ((double) i / j);
        }
        System.out.println("\nSum a Series : \n" + sum);
        
    }
}