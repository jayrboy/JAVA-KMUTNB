package Inheritance;

public class TestDice2 {
   
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int c = 0;
        while (!d1.equals(d2)) {
            d1.roll();
            d2.roll();
            System.out.println(d1.getValue() + "," + d2.getValue());
            c++;
        }
        System.out.println(c);
    }
    
}
