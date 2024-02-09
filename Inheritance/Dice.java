package Inheritance;
// class สร้าง ลูกเต๋า : มีบริการ method ดังนี้
 class Dice {
     protected int value;
     public Dice() { roll(); }
     
     public int roll() {
         // โยนลูกเต๋า แล้วคืนค่าหมายเลขหน้าที่ได้
         // มีตัวแปรรับค่าอยู่แล้ว
         value = 1 + (int)(6 * Math.random());
         return value;
     }
     public int getValue() {
         return value;  // คืนค่าหมายเลขหน้าของลูกเต๋า
     }
     
     
     
    
}
