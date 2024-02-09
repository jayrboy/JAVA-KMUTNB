package Inheritance2;

public final class Square extends Rectangle {
    
//    public Square() { } // ค่า default ไม่ได้รับ
    // ใช้ของแม่
    public Square(double w) {
        super(w, w);
    }
    // ไม่ให้ใครมาสร้างคลาสสืบทอดต่อ
    
}
