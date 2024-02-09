package Class;

public class PiggyBank {
    private int one, two, five, ten;
    
    private final int capacity;
    public PiggyBank(int cap) {
        clear();
        capacity = cap;
    }
    public void clear() {
        one = two = five = ten = 0;
    }
    private int getCoinsTotal() {
        return one + two +five + ten;
    }
    public void add1(int coins) {
        int v = capacity - getCoinsTotal();
        if( coins > v)
            one += v;
        else
            one += coins;
    }
    public void add2(int coins) {
        int v = capacity - getCoinsTotal();
        if( coins > v)
            two += v;
        else
            two += coins;
    }
    public void add5(int coins) {
        int v = capacity - getCoinsTotal();
        if( coins > v)
            five+= v;
        else
            five += coins;
    }
    public void add10(int coins) {
        int v = capacity - getCoinsTotal();
        if( coins > v)
            ten+= v;
        else
            ten += coins;
    }
    public int getTotal() {
        // ตัวแปร ประจำ object ที่เป็น private
        return one + 2*two + 5*five + 10*ten;
    }
    public int getCapacity() {
        return capacity;
    }
    
    @Override
    public String toString() {
        return "===== My PiggyBank =====" + "\n" +
                "Coin 1 = " + one + "\n" + 
                "Coin 2 = " + two + "\n" +
                "Coin 3 = " + five + "\n" +
                "Coin 4 = " + ten + "\n" +
                "Total = " + getTotal() + "\n" +
                "=================== \n";
    }
    
}
