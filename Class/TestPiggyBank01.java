package Class;

public class TestPiggyBank01 {
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank(200);
        
        pb.add1(12);
        System.out.println(pb);
        
        pb.add1(55);
        System.out.println(pb);
        
    }
    
}
