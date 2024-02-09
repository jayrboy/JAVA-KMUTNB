package Array1D;

public class PositionArray1D {
    public static void main(String[] args) {
        int[] data = {35, 78, 9, 47, 99, 1, 23, 23, 74};
        
        int position = -1;
        int k = 55;     // 78 เลือกค้นหาตำแหน่งของข้อมูลในตัวแปรอาเรย์
        for(int i=0; i<data.length; i++) {
            if(data[i] == k) {
                position = i;
                break;
            }
        }
        if(position > -1)
            System.out.println("position = " + position);
        else
            System.out.println("no data");
    }
}
