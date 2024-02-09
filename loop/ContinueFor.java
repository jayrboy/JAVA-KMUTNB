package loop;

public class ContinueFor {
    public static void main(String[] args) {
        int b=3;
        for(int j=1;j<=5;j++) {
            if(j == b)
                continue;   //  ทำเงื่อนไขต่อไปที่ j++ 
            System.out.println("j = "+j);
        }
        // ถ้าคำสั่ง break; จะมาทำส่วน หรือ หลุดจาก for ในโปรแกรมนี้
    }
    
}
