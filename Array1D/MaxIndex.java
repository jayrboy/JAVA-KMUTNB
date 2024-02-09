package Array1D;

public class MaxIndex {
    public static void main(String[] args) {
        int[] data={35, 78, 9, 47, 99, 1, 23, 23, 74};
        int maxIndex=0;
        for(int i=1; i<data.length; i++) {
            if(data[i] > data[maxIndex])
                maxIndex = i;
        }
        System.out.println("maxIndex = " + maxIndex);   //ค่าตำแหน่งของค่ามากสุดในอาเรย์คือตำแหน่งที่ 4
        System.out.println("max values = " + data[maxIndex]);   //data[4] = 99
        
        data[maxIndex]/= 2;     //เปลี่ยนค่า ของค่ามากที่สุดในอาเรย์
        System.out.println("max values = " + data[maxIndex]);   //data[4] = 49

    }
}
