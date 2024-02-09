package stringfunction;

import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = "Hello World";
        int a = s.length();	// คืนความยาวของ String s=11 [0 ถึง 11-1]
        System.out.println("\"" + s + "\" = " + a +" [0 to 11-1]");
	
        s = "  java tour ";
        String t = s.trim();	// คืน String ใหม่เหมือนเก่า แต่ตัดช่องว่าง ซ่ายขวา ทิ้ง = "java tour";
        System.out.println("\""+ s +"\" = \""+ t +"\"");
        
        String name = "Luis ";
        String lastName = "Diaz";
        String newPlayer = name.concat(lastName); // คืน String ใหม่ของ name ต่อกับ lastName = "Luis Diaz";
        System.out.println("\""+name+"\", "+" \""+ lastName + "\" = \"" + newPlayer + "\"");
        
        String country = "Thailand";						
        char c1 = country.charAt(0);    // คืนตัวอักษรในตำแหน่งที่กำหนด อย่างเช่น อักษรตัวแรก c1 = 'T'; 
        char c2 = country.charAt(country.length() - 1);     // คืนตัวอักษรตัวสุดท้าย c2 = 'd';
        System.out.println(country + " start = " + c1 + ", stop-1 = " + c2);
        
        s = "HeLLo";
        t = s.toUpperCase();    // คืน String ใหม่เหมือนเก่า แต่เปลี่ยนเป็นตัวอังกฤษ ใหญ่หมด
        System.out.println(s + " = " + t);
        
        s = "HeLLo";
        t = s.toLowerCase();    // คืน String ใหม่เหมือนเก่า แต่เปลี่ยนเป็นตัวอังกฤษ เล็กหมด
        System.out.println(s + " = " + t);
        
        s = "hello";
        t = s.substring(1,4);   // คืน String ใหม่ซึ่งเป็น String ย่อย ตั้งแต่ตัวที่ j ถึงตัวที่ k-1
        System.out.println(s + " = " + t);
        
        s = "hello hello";
        int k = s.indexOf("el");    // คืนดัชนีของ String1 ที่มีข้อความเหมือนกับ String2
        System.out.println(s + ", el = "+k);
        
        String ans = kb.nextLine();
        if(ans.equals("yes"))   // คืน true ถ้า String1 เหมือน String2
            System.out.println(true);

        ans = kb.nextLine();
        if(ans.equalsIgnoreCase("yes")) // คืน true ถ้า String1 เหมือน String2 แบบไม่สนใจตัวอังกฤษใหญ่เล็ก
            System.out.println(true);
    }
}
