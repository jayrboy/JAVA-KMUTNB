package Interface;

public class TestgetPriceable1 {
    public static void main(String[] args) {
        Priceable item = new Toothpick();
        System.out.println(item.getPrice());
    }
}
