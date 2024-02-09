package loop;

// คล้ายกับ while
// ต่างกันตรงที่ ลูป do-while จะทำงานคำสั่งของ do ก่อน 1 รอบ
// จากนั้นจึงตรวจสอบเงื่อนไข while ถ้าเป็นจริงจะวนกลับไปทำงานตามคำสั่งของ do อีกครั้ง

public class BasicDoWhile {
    public static void main(String[] args) {
        
        int k = 1;
        do {
            System.out.println(k);
            
            k++;
        } while(k<=5);
        
        int j = 6;
        do {
            System.out.println(j);
            j+=2;
        } while(j<=5);
        
        int i = 5;
        do {
            System.out.println(i);
            i=i-1;
        } while(i>1);
        
    }
    
}
