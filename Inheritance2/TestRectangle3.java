package Inheritance2;

public class TestRectangle3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 5);
        System.out.println(r1);
        
        Rectangle r2 = new Rectangle(5, 2);
        System.out.println(r2);
        System.out.println(r1.equals(r2));
        
        Rectangle r3 = new Rectangle(5, 2);
        System.out.println(r3);
        System.out.println(r1.equals(r3));

    }
}
