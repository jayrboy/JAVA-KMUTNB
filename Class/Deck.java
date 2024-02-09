package Class;

public class Deck {
    private Card[] deck;
    private int numberOfCards;
    private String []suit = {"\u2660", "\u2665", "\u2666", "\u2663"};
    private String []rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    private int []value = {2, 3, 4, 5, 6, 7, 8, 9, 10 ,11, 12, 13, 14};
    
    public Deck() {
        deck = new Card[52];
        int k = 0;
        for(int i = 2; i <= 14; i++) {
            deck[k++] = new Card(i, suit[0]);
            deck[k++] = new Card(i, suit[1]);
            deck[k++] = new Card(i, suit[2]);
            deck[k++] = new Card(i, suit[3]);
        }
        numberOfCards = 52;
    }
    public Card nextCard() {
        numberOfCards--;
        return deck[numberOfCards];
    }
    public void cut(int k) {
        Card[] temp = new Card[k];
        
        for (int i = 0; i < k; i++)
            temp[i] = deck[i];
        int j = 0;
        for (int i = k; i < numberOfCards; i++, j++)
            deck[j] = deck[i];
        for (int i = 0; i < k; i++, j++)
            deck[j] = temp[i];
    }

    @Override
    public String toString() {
        String s = "";
        for (int j = 0; j < numberOfCards; j++) {
            s = s + deck[j].toString() + "\n";
            System.out.println("");
        }
        return s;
    }
    
    public void cardSwap() {
        for (int k = 5; k < 0; k--) {
            int r = (int) Math.random() * k;
            Card t = deck[k];
            deck[k] = deck[r];
            deck[r] = t;
        }
    }
  
    
    
}

