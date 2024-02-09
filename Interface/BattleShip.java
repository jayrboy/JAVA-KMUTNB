package Interface;
// คลาสเรือรบ
public class BattleShip implements Priceable {
    public int getPrice() { 
        int deprecation = age * 100000;
        return Math.max(originalPrice - deprecation, 10000);
    }
    public void setAge(int year) {
        age = year;
    }
    int originalPrice = 1000000;
    int age = 0;  
}
