package Interface;


public class TestA {
    public static void main(String[] args) {
        A a = new A(19);
        ECT e = a;
        System.out.println(e.isStudent() + " " + a.getScore());
        e.addBonus(16);
        System.out.println(e.isStudent());
        // หน้ากากนี้เหมือนกัน แต่รายละเอียด วงจรฟังชันก์แตกต่างตาม code มันตรงตามข้อตกลง
    }
    
}
