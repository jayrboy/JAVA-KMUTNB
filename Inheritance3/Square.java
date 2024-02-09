package Inheritance3;

public final class Square extends Rectangle {
//    public Square() { }
    public Square(double w) {
        super(w, w);
    }
    @Override
    public String toString() {
        String str = "Square" + "\n";
        str += " color = "  + getColor() + "\n";
        str += " width = "  + width + "\n";        
        str += " area = "   + getArea()+ "\n";
        return str;
    }
}