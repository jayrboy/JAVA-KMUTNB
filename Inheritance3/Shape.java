package Inheritance3;
// ไม่ให้ class อื่นเข้าถึง แต่อ้างถึง object ใน supclass ได้
public abstract class Shape {
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
