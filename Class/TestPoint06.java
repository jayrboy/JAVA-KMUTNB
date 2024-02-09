package Class;
public class TestPoint06 {
    public static void main(String[] args) {
        Point a = new Point(2,2);
        Point b = new Point(10, 2);
        int k =1;     
        while( !a.equals(b) ) {
            // ถ้า (จุด a) != (จุด b) ไม่รู้ว่าเลื่อนขวากี่ครั้งเลยใช้ while
                System.out.println(a);
                moveRight(a, k);
        }
        System.out.println(a);
        
    }
    
    public static void moveRight(Point p, int k) {
        // ความหมาย คืนค่าปัจจุบัน พึ่งให้เข้าถึง private ได้
        // เอาไปใช้งานได้จริง เวลาเลื่อน graphic
        p.setX(p.getX()+k);
    }
    
    public static void moveUP(Point p, int k) {
        // ความหมาย คืนค่าปัจจุบัน พึ่งให้เข้าถึง private ได้
        // เอาไปใช้งานได้จริง เวลาเลื่อน graphic
        p.setY(p.getY()+k);
    }
   
    
}
