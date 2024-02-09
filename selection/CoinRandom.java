package selection;

public class CoinRandom {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            if (Math.random() < 0.5) {
                System.out.print("ก้อย ");
            }
            else {
                System.out.print("หัว ");
            }
        }
    }
}
