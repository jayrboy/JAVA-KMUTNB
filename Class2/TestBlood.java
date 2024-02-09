package Class2;
public class TestBlood {
    public static void main(String[] args) {
        String[] name = {"Somchai", "Sompong", "Somsak",
                                "Somying", "Somporn", "Somkiat",
                                "Somwang", "Somyot", "Somjit", "Somsri"};
        
        BloodPressure []bp = new BloodPressure[5];
        for (int i = 0; i < 5; i++) {
            int k = (int) (Math.random()*name.length);
            int s = (int) (Math.random()*(200-100)) + 100;
            int d = (int) (Math.random()*(90-50)) + 50;
            bp[i] = new BloodPressure(name[k], s, d);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(bp[i] + " = " + bp[i].isHigh());
        }
        
    }
    
}
