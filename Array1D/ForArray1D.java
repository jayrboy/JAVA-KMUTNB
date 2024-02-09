package Array1D;

public class ForArray1D {
    public static void main(String[] args) {
        int[] data = new int[50];
        data[0]=7;  // เพิ่ม 7 ลงในตำแหน่งอาเรย์ที่ 0
        
        for(int i=1; i<data.length; i++) {  // เพิ่มข้อมูลตามขนาดแาเรย์ด้วย for loop
            data[i] = i;
            System.out.println("Array["+i+"] = " + data[i]);
        }
        System.out.println();
        
        for(int i=1; i<data.length; i++) {
            data[i] = data[i - 1] + i;
            System.out.println("data["+i+"] = "+data[i]);
        }
        
        
    }
    
}
