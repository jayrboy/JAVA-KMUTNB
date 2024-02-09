package Class;
// Card 1 ใบ
public class Card {
    private String suit;                // Spades, Heart, Diamond, Club 
    private int rank;                   // 2, 3, ..., 14
    public Card(int r, String s) {
        suit = s;
        rank = r;
    }
    public int getRank() {
        return rank;
    }
    public String getSuit() {
        return suit;
    }
    public String toString() {
        return "(" + suit + "," + rank + ")";
    }
}


