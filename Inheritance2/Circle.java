package Inheritance2;

public class Circle extends Shape {
    protected double radius;
    
    public Circle(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
}
