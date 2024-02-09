package Interface;

public class A implements ECT {
    private int score;
    public A(int s) {
        score = s;
    }
    @Override
    public boolean isStudent() {
        return this.score > 34;
   }
    @Override
    public void addBonus(int c) {
        score += c;
   }
    public int getScore() {
        return score;
    }
}
