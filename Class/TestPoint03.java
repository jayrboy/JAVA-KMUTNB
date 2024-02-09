package Class;


public class TestPoint03 {
        public static void main(String[] args) {
            Point p = new Point(3,4);
            System.out.println(p.toString());   // ถ้าไม่ @Override Class.Point@5fd0d5ae
            Point q=new Point(5,2);
            System.out.println(q);
//            Point m=new Point(3,4);
            System.out.println(p.equals(p.toString()));         // default = false
            System.out.println(q.equals(q.distanceTo(p)));    // default = false 
            

    }
}