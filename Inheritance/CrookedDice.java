package Inheritance;

public class CrookedDice extends Dice {
    public CrookedDice() { }
    
    // roll() นี้ แทน roll() ใน superclass
    @Override
    public  int roll() {
        if(Math.random() < 0.9) 
            value =1;
        else
            value = 2 + (int) (5 * Math.random());
        return value;
    }
    
}
