package Inheritance2;

public class Rectangle extends Shape {
    public double width;
    public  double height;
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        return super.getArea();
//        return width * height;
    }
            
    @Override
    public String toString() {
        String str = "Rectangle" + "\n";
        str += " color = "  + getColor() + "\n";
        str += " width = "  + width + "\n";
        str += " height = " + height + "\n";
        str += " area = "   + getArea() + "\n";
        return str;
    }
    
    @Override
    public boolean equals(Object otherObject) {
        // object ที่รับมาเป็นแบบ Rectangle ก็จะทำงานได้
        // instanceof ฉันคือตัวฉัน
        if (otherObject instanceof Rectangle) { 
            Rectangle otherRect = (Rectangle) otherObject;
        
            boolean equalWidth  = width  == otherRect.width;
            boolean equalHeight = height == otherRect.height;
            
            return equalWidth && equalHeight;
        }
        return false;
    }
    
    // ลูกแก้ไขไม่ได้ ต้องใช้ของแม่เนื่องจากเป็น final
//    @Override
//    public  Color getColor() {
//        color =Color.Green;
//        return color;
//    }
    


}
