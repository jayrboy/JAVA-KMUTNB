package Class;

public class Class01 {
    public static void main(String[] args) {
        // แต่ละ object มีตัวแปรประจำ object ของตัวเอง
        Book b1 = new Book("Data Science", "149190142X", 28.79); // ตัวแปร b1 ตัวอ้างอิง Object แบบ Class Book
        Book b2 = new Book("Learning Java", "1449355730",  37.06);
        Book b3 = new Book("Data Analysis", "1449319793", 27.68);
        
        System.out.println(b1.title);
        System.out.println(b1.isbn);
        System.out.println(b1.price);
        System.out.println("--------------");
        System.out.println(b2.title);
        System.out.println(b2.isbn);
        System.out.println(b2.price);
        System.out.println("--------------");
        System.out.println(b3.title);
        System.out.println(b3.isbn);
        System.out.println(b3.price);
        // การใช้/เปลี่ยนค่าของตัวแปรประจำ object
        b3.price = b3.price * 1.10;
        System.out.println("--------------");
        System.out.println(b3.title);
        System.out.println(b3.isbn);
        System.out.println(b3.price);
        
    }
    

    
}
