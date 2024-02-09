package Class;

public class TestRectangle {
    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle(1,1,4,2);
//        System.out.println(r1);
        
        Rectangle r = new Rectangle(3,4,5,3);
        System.out.println(r);
        Point A = new Point(5, 2);
        Point B = new Point(9, 5);
        System.out.println(r.contains(A));
        System.out.println(r.contains(B));
    }
}
