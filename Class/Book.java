package Class;

// ประกาศ class Book ประกอบด้วยข้อมูลย่อยๆ อะไรบ้าง
public class Book {
    // สร้างที่เก็บข้อมูล เรียกว่า (object) ภายในมีตัวแปรเก็บข้อมูลย่อย
    public String title;
    public String isbn;     
    public double price;
    
    // สร้าง Object จาก class Book เพื่อเก็บข้อมูล
    public Book(String t, String i, double p) {
        // ตอนประกาศตัวอ้างอิง b=new Book(); ต้องส่งค่ามาด้วย
        title = t;
        isbn = i;
        price= p;
    }
    
}
