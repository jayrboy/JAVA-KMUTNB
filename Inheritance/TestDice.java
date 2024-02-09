package Inheritance;

public class TestDice {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        System.out.print("d1 = ");
        for (int i = 1; i <= 10; i++) {
            d1.roll();
            System.out.print(d1.getValue() + " ");
        }
        
        System.out.println("");
        CrookedDice d2 = new CrookedDice();
        System.out.print("d2 = ");
        for (int i = 1; i <= 10; i++) {
            d2.roll();
            System.out.print(d2.getValue() + " ");
        }
        System.out.println("");
    }
}
