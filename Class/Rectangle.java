package Class;

public class Rectangle {
    private Point p = null;
    private double width;
    private double height;
    
    public  Rectangle(double x, double y, double w, double h) {
        this.p = new Point(x,y);
        width = w;        height = h;
    }
    public Rectangle(Point p, double w, double h) {
        this.p = new Point(p);
        width = w;      height = h;
    }
    
    @Override
        // Method สือทอดมาจาก object ถ้าซ้ำ Override จะแทนที่ (ข้างในเป็นของเราเอง)
    public String toString() {
        return "[ " + p.toString() + " : " + "w = " + this.width + " h = " + this.height + " ]";
    }
    
    public double gatArea() {
        return  width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    public boolean contains(Point p) {
        boolean c = (this.p.getX() <= p.getX() && p.getX() <= this.p.getX() + width) &&
                    (this.p.getY() >= p.getY() && p.getY() >= this.p.getY() - height);
        return c;
    }
    
}
