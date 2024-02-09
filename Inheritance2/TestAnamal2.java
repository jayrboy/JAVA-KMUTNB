package Inheritance2;

public class TestAnamal2 {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.keepCoconut();
        Animal a = new Animal();
//        a.keepCoconut(); // Error เนื่องจากยังไม่กำหนดประเภทสัตว์
    }
}
