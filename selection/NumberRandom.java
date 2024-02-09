package selection;

public class NumberRandom {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            double rand = Math.random() * 1000000;  // 0.8789874.. = 8.789874
            int r = (int)rand;
            System.out.print(r + " = ");
            if (r/10%10 == 5)   // ตรวจสอบว่ามีเลข 5 อยู่ในหลักสิบ ?
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    } 
}
