package Inheritance2;

public class Shape {

    public Shape() {
        color = Color.Red;
    }
    public double getArea() { 
        return 0; 
    }
    public void setColor(Color c) { 
        color = c; 
    }
    // final หวงสมบัติไม่ให้ใครใช้ ลูก Override ไม่ได้ แต่แก้ไขได้
    public Color getColor() {
        return color;
    }    
    private Color color;


    
}
