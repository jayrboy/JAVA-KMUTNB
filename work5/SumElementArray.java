package work5;

public class SumElementArray {
    public static void main(String[] args) {
        // double [ ] arr = new double[10];
        double [ ] arr = {2.3, 11.4, 3.6, 7.8, 2.1, 9.9, 7.3, 6.5, 4.7, 4.7};
        double a = sumA2B (arr, 2, 7);  // {2.3, 11.4, 3.6, 7.8, 2.1, 9.9, 7.3, 6.5, 4.7, 4.7}; a = 30.7
        double b = sumA2B(arr, 0, 3);   // {2.3, 11.4, 3.6, 7.8, 2.1, 9.9, 7.3, 6.5, 4.7, 4.7}; b = 17.3
        double c = sumA2B(arr, 8, 7);   // {2.3, 11.4, 3.6, 7.8, 2.1, 9.9, 7.3, 6.5, 4.7, 4.7}; c = 0.0
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
    }
    
    public static double sumA2B(double []d, int a, int b) {
        
        if (b <= a || b > d.length)
            return 0.0;
        
        double sum = 0;
        for (int k = a; k < b; k++) {
            sum += d[k];
        }
        return sum;
}
    
    
}
