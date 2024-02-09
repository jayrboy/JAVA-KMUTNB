package Inheritance2;

public class Ring extends Circle {
    protected double innerRadius;
    
    public Ring(double r1, double r2) {
        super(r2);
        innerRadius = r1;
    }
    
    public double getInnerRadius() {
        return innerRadius;
    }
    
    @Override
    public double getArea() {
//        double outerArea = Math.PI * radius * radius;
        double outerArea = super.getArea();
        double innerArea = Math.PI * innerRadius * innerRadius;
        return outerArea - innerArea;
    }
    
    @Override
    public String toString() {
        String str = "Rectangle" + "\n";
        str += " color = "  + getColor() + "\n";
        str += " radius = "  + radius + "\n";
        str += " innerRadius = " + innerRadius + "\n";
        str += " area = "   + getArea() + "\n";
        return str;
    }
}
