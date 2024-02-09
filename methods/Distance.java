package methods;

public class Distance {
    public static void main(String[] args) {
        
        int q = (int) distance (10, 10, 20, 30);    //การส่งค่า int และรับค่า int ที่ส่งไปให้ชนิดข้อมูล double
        double x = 20.5;
        double p = distance(10, 10, 20, (int) x);
        System.out.println("distance = "+p);
        
        int a = 99;
        int b = 20;
        clear(a);   //ตัวแปร a ส่งค่าไปที่ method clear();
        swap(a, b);
    }
    
    public static double distance(int x1, int y1, int x2, int y2) { //method distance
        double dx = (x1 - x2);
        double dy = (y1 - y2);
        double d = (dx*dx + dy*dy);
        return d;
    }
    
    public static void clear(int a){    //ตัวแปรของ method สามารถเปลี่ยนแปลงได้ เพราะคนละตัวแปรฝั่งรับค่า
        a= 0;
    }
    
    public static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }
    
    
}
