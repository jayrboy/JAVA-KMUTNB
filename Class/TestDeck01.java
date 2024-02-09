package Class;


public class TestDeck01 {
    public static void main(String[] args) {
        Deck d = new Deck();
        
        for(int i=0; i< 52; i++) {
            Card c = d.nextCard();
            System.out.println(c);
        }
        System.out.println(d);
    }
}
