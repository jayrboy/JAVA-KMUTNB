package Inheritance3;

public class Circle extends Shape {
    protected double radius;
    public Circle(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        String str = "Circle" + "\n";
        str += " color = "  + getColor() + "\n";
        str += " Radius = "  + radius + "\n";
        str += " area = "   + getArea() + "\n";
        return str;
    }
}
