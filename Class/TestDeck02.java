package Class;

public class TestDeck02 {
    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println(d);
        System.out.println("-----");
        
        for (int j = 0; j < 100; j++) {
            int k = (int) (Math.random()* 52);
            d.cut(k);
        }
        
    }
}
