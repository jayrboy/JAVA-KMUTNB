package Interface;

public class TestPriceable4 {
    public static void main(String[] args) {
        Toothpick toothpick = new Toothpick();
        Monkey monkey = new Monkey();
        
        Cart cart = new Cart();
        cart.items[0] = monkey ;
        cart.items[1] = toothpick;
        System.out.println(cart.sumPrice());
    }
}
