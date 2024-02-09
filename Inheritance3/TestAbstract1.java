package Inheritance3;

public class TestAbstract1 {
    public static void main(String[] args) {
//        Shape s = new Shape(); abstract ไม่สามารถสร้า Object ได้

        Shape s = new Rectangle(2, 8);  // Create Object
        System.out.println(s);
    }
}