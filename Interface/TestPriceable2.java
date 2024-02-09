package Interface;
// ทดสอบ class เรือรบ
public class TestPriceable2 {
    public static void main(String[] args) {
        BattleShip ship = new BattleShip();
        ship.setAge(3);
        
        Priceable item = ship;  //
        System.out.println(item.getPrice());
    

    }
}
