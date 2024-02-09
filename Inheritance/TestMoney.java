package Inheritance;


public class TestMoney {
    public static void main(String[] args) {
        PiggyBank p = new PiggyBank();
        p.add1(12);
        p.add5(3);
        p.add10(7);
        System.out.println("กระปุกออมสินลูกหมู มีเงินอยู่ = " + p.getTotal());
        System.out.println("--------------------------------"); 
        
        MoneyBox m = new MoneyBox();
        m.add10(25);
        m.add500(2);
        System.out.println("กล่องรับเงิน มีเงินอยู่ = " + m.getTotal());
        System.out.println("--------------------------------");
        
        MoneyBox m1 = new MoneyBox(p);
        m1.add10(3);
        m1.add50(1);
        System.out.println("กล่องรับเงิน มีเงินอยู่ = " + m1.getTotal());  // p = 97
        System.out.println("--------------------------------");

    }
    
}
