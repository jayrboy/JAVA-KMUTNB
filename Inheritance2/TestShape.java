package Inheritance2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1.getColor());
        System.out.println(s1.getArea());
        
        Shape s2 = new Shape();
        s2.setColor(Color.Blue);
        System.out.println(s2.getColor());
        System.out.println(s2.getArea());
    }

}
