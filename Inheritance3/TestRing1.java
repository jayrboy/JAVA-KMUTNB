package Inheritance3;

public class TestRing1 {
    public static void main(String[] args) {
        Ring r = new Ring(10);
        System.out.println(r);
        
        r.setColor(Color.Green);
        System.out.println(r.getColor());
        System.out.println(r.getArea());
    }
}
