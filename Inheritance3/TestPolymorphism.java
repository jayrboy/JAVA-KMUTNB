package Inheritance3;
// Polymorphism     referance สามารถสร้าง new ใน supclass ได้เพิ่มจากของ superclass
public class TestPolymorphism {
    public static void main(String[] args) {
        Shape shape;
        
        shape = new Rectangle(10, 20);
        System.out.println(shape.getArea());
        
        shape = new Circle(10);
        System.out.println(shape.getArea());
    }
}
