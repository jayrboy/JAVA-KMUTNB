package variables;


public class FineSquareRoot1 {
    public static void main(String[] args) { 
        // ปรับปรุงใหม่ ใช้ตัวแปร 2 ตัว
        double a = 100;
        double x = 1;
        x = (x + (a / x)) / 2.0;   //  50.5
        x = (x + (a / x)) / 2.0;  //  26.24
        x = (x + (a / x)) / 2.0;  //  15.03
        x = (x + (a / x)) / 2.0;  //  10.84
        x = (x + (a / x)) / 2.0;  //  10.03
        x = (x + (a / x)) / 2.0;  //  10.00
        System.out.println("Square Root "+ a + " =  " + x);
        
        // ปรับปรุงใหม่ ใช้ตัวแปร 3 ตัว
//        double a = 100;
//        double x0 = 1, x1;
//        x1 = (x0 + (a / x0)) / 2.0;   //  50.5
//        x0 = (x1 + (a / x1)) / 2.0;  //  26.24
//        x1 = (x0 + (a / x0)) / 2.0;  //  15.03
//        x0 = (x1 + (a / x1)) / 2.0;  //  10.84
//        x1 = (x0 + (a / x0)) / 2.0;  //  10.03
//        x0 = (x1 + (a / x1)) / 2.0;  //  10.00
//        System.out.println("Square Root "+ a + " =  " + x0);
    }

    
    
    
}
