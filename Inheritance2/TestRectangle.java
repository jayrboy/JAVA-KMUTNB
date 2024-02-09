package Inheritance2;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 7);
        System.out.println(r1);
        r1.setColor(Color.Pink);
        System.out.println(r1);
        System.out.println(r1.getColor());  // ใช่ไม่ได้ เพราะว่า getColor เป็น final
    }
}
