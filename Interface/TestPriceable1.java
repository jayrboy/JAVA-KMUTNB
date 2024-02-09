package Interface;
// ทดสอบ class ไม้จิ้มฟัน
public class TestPriceable1 {
    public static void main(String[] args) {
        Priceable item = new Toothpick();
        System.out.println(item.getPrice());
    }
}
