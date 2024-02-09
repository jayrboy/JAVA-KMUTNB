package Inheritance;

public class MoneyBox extends PiggyBank {
    private int b20, b50, b100, b500, b1000;
    public MoneyBox() {
        super(); 
    }
    // สร้าง Constructor รับค่ามา และส่งเป็นเหรียญ 1 บาทหมดเลย (รับกระปุกออมสิน)
    public MoneyBox(PiggyBank p) {
        this.clear();
        add1(p.getTotal()); //เพิ่มจำนวน
    }
    @Override
    public void clear() {
        super.clear();
        b20 = b50 = b100 = b500 = b1000 = 0;
    }
    public void add20(int b) { b20 = b20 + b; }
    public void add50(int b) { b50 = b50 + b; }
    public void add100(int b) { b100 = b100 + b;}
    public void add500(int b) { b500 = b500 + b; }
    public void add1000(int b) {b1000 = b1000 + b; }
    @Override
    public int getTotal() {
        return super.getTotal() + 20*b20 + 50*b50 + 100*b100 + 500*b500 + 1000*b1000;
    }

}
