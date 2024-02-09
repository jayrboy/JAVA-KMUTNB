package Inheritance;

public class A {
    public  int a;
//    private int a;      // เข้าถึงได้เฉพาะ superclass
//    protected int a;  // เข้าถึงได้ใน package เดียวกัน
    public int x;
    private int y;
    
    public A() {
//        System.out.println("I'm A");
    }
    public A(int x1) {
        x = x1;
    }
    public int xx(int c) {
        return a = c;
    }
    public void m1() { }
    public int m2(int z) {
        return z;
    }
    private void m3() { }
    
}
