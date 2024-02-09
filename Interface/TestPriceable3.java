package Interface;


public class TestPriceable3 {
    public static void main(String[] args) {
        Toothpick toothpick = new Toothpick();
        BattleShip ship = new BattleShip();
        ship.setAge(3);
        
        Cart cart = new Cart();
        cart.items[0] = toothpick ;
        cart.items[1] = ship;
        System.out.println(cart.sumPrice());
    }

    
}
