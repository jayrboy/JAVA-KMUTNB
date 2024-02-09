package selection;

public class ECTid {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            double rand = Math.random() * 10;
            int id = 6500 + (int)rand;
            System.out.print(id + " = ");
            if (id%100 == 3) // ตรวจสอบหา id นศ.มจพ. ป.ตรี คณะ วทอ.
                System.out.println("ECT");
            else
                System.out.println("No");
        }
    } 
}

