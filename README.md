# JAVA-KMUTNB

- Algorithms1.java => Compile (javac Algorithms1.java) ==> Algorithms1.class
- Algorithms1.class == Run (java Algorithms1) ==> Algorithms1.class
- 1 class จะ Run ได้ จะต้องมี 1 method ( main() method ) => Run(java.exe)
- Integer => int	(64 bit)
- Full Floating (Real number) => double (64 bit)
- 12 in java = int
- 12.38 in java = double	// เวลาเจอเลขทศนิยมภาษาจาวา จะมองเป็น double
- float || boolean = True, False
- ประกาศตัวแปรที่ไหนก็ได้ แต่ต้องตั้งประกาศตัวแปรก่อนนำไปใช้งาน

 13-12-2022 (Structure)
  - การประกาศตัวแปร boolean, int, double
  - ตัวดำเนินการ ในภาษาจาวาหากเจอเลข "ทศนิยม" จะมองเป็นชนิด double 10.0 = 5.0/5 และประกาศตัวแปรที่ไหนก็ได้ อย่างเช่นประกาศก่อนแล้วนำไปใช้
  - ตัวดำเนินการ > < != == และ if statement
  - รับข้อมูลตัวเลขจาก keyboard ด้วย Scanner แล้ว แสดงผลตัวเลขที่ป้อนเข้ามา
  - โปรแกรมหา ค่าเลข "มากกว่า"(Max) และ "น้อยกว่า"(Min) แล้วสามารถนำค่า Max หรือ Min ไป process ต่อได้
  - โปรแกรม ให้เข้าเงื่อนไข ถ้าป้อนข้อมูลตัวเลขคู่ เป็นจริง(True) จะ *2 แล้วหากเป็นเลขคี่ มากกว่า 10 จะแสดง True หากน้อยกว่า 10 จะ แสดง False
 
 19-12-2022 (OOP)
  - โปรแกรมหา ค่าเลขมากที่สุดจากการป้อนข้อมูลจาก keyboard จำนวน 5 ครั้ง ชนิด int แบบที่ 1 ใช้ if statement ทั่วไป
  - โปรแกรมหา ค่าเลขมากที่สุดจากการป้อนข้อมูลจาก keyboard นิยามจำนวนรอบที่ต้องการหา ชนิด int แบบที่ 2 ใช้ for statement
  - โปรแกรมหา ค่าเลขมากที่สุดจากการป้อนข้อมูลจาก keyboard นิยามจำนวนรอบที่ต้องการหา ชนิด int แบบที่ 3 ใช้ for statement ใช้ Integer.MIN_VALUE 
  - โปรแกรมหา ค่าเฉลี่ย (ผลรวมของค่าที่หารด้วยจํานวนค่า) จากการป้อนข้อมูลจาก keyboard นิยามจำนวนรอบที่ต้องการหา ชนิด int ใช้ for statement มีการใช้ Integer.MIN_VALUE
  - โปรแกรมหา ค่าบวก(+) ถึง ค่าลบ(-) จากการป้อนตัวเลขจาก keyboard นิยามจำนวนรอบที่ต้องการหา ชนิด int ใช้ while statement
  - โปรแกรมหา ค่าลบ(-) ถึง ค่าบวก(+) จากการป้อนตัวเลขจาก keyboard นิยามจำนวนรอบที่ต้องการหา ชนิด int ใช้ while statement
