package loop;

// เริ่มต้นตรวจสอบเงื่อนไข
// ถ้าเป็นจริง จะทำงานตามคำสั่งของ while
// เมื่อทำงานเสร็จแล้ว ก็จะวนกลับไป ตรวจสอบเงื่อนไขใหม่
// ทำงานเรื่อยๆ จนกว่าเงื่อนไขจะเป็นเท็จ ถึงจะหลุดออกจากการทำงาน

public class BasicWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            System.out.println("i = "+ i);
            i++;
        }
        System.out.println("");
        int j = 1;
        while(j <= 5) {
            System.out.println("j = "+ j);
            j+=2;
        }
        System.out.println("");
        
        int k = 5;
        int sum = 0;
        while(k > 1) {
            System.out.println("k = "+ k);
            sum+=k;
            k -=1;
        }
        System.out.println("sum k = "+ sum);
    }
}
