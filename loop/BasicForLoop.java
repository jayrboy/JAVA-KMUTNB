package loop;

// ทำงานวนรอบ เช่นเดียวกับ while และ do-while
// แต่ for มีลักษณะพิเศษกว่าคำสั่งแบบอื่นๆ ตรง for เหมาะสมกับกรณีที่
// "รู้จำนวนแน่นอนแล้วว่าต้องการให้วนทำงานกี่รอบ" (นิยมมากในการเขียนโปรแกรม)

public class BasicForLoop {
    public static void main(String[] args) {
        
        for(int k=1;k<=5;k++) {
            System.out.println(k);
        }
        System.out.println();
        
        for(int j=1;j<=5;j+=2) {
            System.out.println(j);
        }
        System.out.println();
        
        for(int i=5;i>1;i--) {
            System.out.println(i);
        }
        
    }
    
}
