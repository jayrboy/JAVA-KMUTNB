package Class;


public class TestPoint04 {
        public static void main(String[] args) {
            Point p = new Point(1,1);
            System.out.println(p.toString());   // ถ้าไม่ @Override Class.Point@5fd0d5ae
            Point q = new Point(5,3);
            System.out.println(q.toString());
            System.out.println(q.distanceTo(p));
            System.out.println(p.distanceTo(q));
            

    }
}