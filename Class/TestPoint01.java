package Class;
// การเปลี่ยนค่าของตัวแปรประจำ object
public class TestPoint01 {
    public static void main(String[] args) {
        Point p = new Point(5.0, 10.0);
        System.out.println("(" + p.x + "," + p.y + ")");
        p.setX(1);
        System.out.println(p);
        p.setY(2);
        System.out.println(p);
        
        
        // เปลี่ยนค่า
//        moveRight(p, 5);
//        System.out.println("(" + p.x + "," + p.y + ")");
    }
    
    public static void moveRight(Point p, int k) {
        // method ที่รับ object
        p.x += k;
    }
    
    
    
}
