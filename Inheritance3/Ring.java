package Inheritance3;
// เข้าถึง superclass ไม่ได้ แต่เข้าถึง subclass ได้
public class Ring extends Circle {
    protected double innerRadius;
    public Ring(double r) {
        super(r);
    }
    @Override
    public double getArea() {
        double outerArea = Math.PI*radius*radius;
        double innerArea = Math.PI*innerRadius*innerRadius;
        return  outerArea - innerArea;
    }
}
