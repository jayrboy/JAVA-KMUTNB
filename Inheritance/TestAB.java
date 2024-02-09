package Inheritance;

public class TestAB {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);                // private
        System.out.println(b.xx(7));       // public
        System.out.println(b.a);                // private
    }
}
