package selection;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++) {
            double rand = Math.random() * 90000;
            int r = 10000 + (int)rand;
            System.out.print(r + " = ");
            if (r%1000/100 == 7) // ตรวจสอบหักร้อยว่ามีเลข 7 ?
                System.out.println("Yes");
            else
                System.out.println("No");
            // 123 -> 784
            // 784 - 123 + 1 ต้อง + เนื่องจากนับ 123 ด้วย
            // a -> b ; a < b
            // b - a + 1
            // 10000 - 99999
            // 99999 - 10000 + 1 = 90000
            // double rand = Math.random() * 90000;
            // double rand = Math.radom() * (b - a + 1) + a;
            // int r = (int)rand;   // บังคับให้ r เป็น int
            // ใช้สำหรับสุ่มตัวเลขต่าง ๆ 3 ตัวอย่าง
        }
    } 
}
