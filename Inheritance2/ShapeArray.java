package Inheritance2;

public class ShapeArray {
    public static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape s : shapes) {
            sum += s.getArea();
        }
        return sum;
    }
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Circle(10);
        System.out.println(s[0]);
        s[1] = new Rectangle(10,20);
        System.out.println(s[1]);
        s[2] = new Square(20);
        System.out.println(s[2]);
        
        double d = ShapeArray.sumArea(s);
        System.out.println(d);

    }
}

