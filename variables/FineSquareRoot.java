package variables;


public class FineSquareRoot {
    public static void main(String[] args) {
        // ใช้ตัวแปร 8 ตัว
        double a = 50;
        double x0 = 1;
        double x1 = (x0 + (a / x0)) / 2.0;   //  50.5
        double x2 = (x1 + (a / x1)) / 2.0;  //  26.24
        double x3 = (x2 + (a / x2)) / 2.0;  //  15.03
        double x4 = (x3 + (a / x3)) / 2.0;  //  10.84
        double x5 = (x4 + (a / x4)) / 2.0;  //  10.03
        double x6 = (x5 + (a / x5)) / 2.0;  //  10.00
        System.out.println("Square Root "+ a + " =  " + x6);
        
    }

    
    
    
}
