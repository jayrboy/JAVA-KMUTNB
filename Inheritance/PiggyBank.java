package Inheritance;

public class PiggyBank {
    private int one, two, five, ten;
    public PiggyBank() {
        clear();
    }
    public void clear() { 
        one = two = five = ten = 0;
    }
    public void add1(int coins) { one = one + coins; }
    public void add2(int coins) { two = two + coins; }
    public void add5(int coins) { five = five + coins; }
    public void add10(int coins) { ten = ten + coins; }
    public int getTotal() {
        return one + 2*two + 5*five + 10*ten;
    }
}