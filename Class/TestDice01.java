package Class;

import Class2.Dice;

public class TestDice01 {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        
        for(int k=1 ; k<=10; k++) {
            int count = 0;
            for(int i=1 ; i<=1000000; i++) {
            
            System.out.println( d1.getValue() +" , " + d2.getValue() );
            d1.roll();
            d2.roll();
            if(d1.getValue() == d2.getValue())
                count++;
            System.out.println("-----");
            System.out.println(count );
            }
        }
        
    }
}
