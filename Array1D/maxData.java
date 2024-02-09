package Array1D;


public class maxData {
    public static void main(String[] args) {
        int[] data = {35, 78, 9, 47, 99, 1, 23, 23, 74};
        int max = data[0];
        for(int i=1; i<data.length; i++) {
            if(data[i] > max)
                max = data[i];
        }
        System.out.println("max[] = " + max);
        
        int maxI = 0;
        for(int i=1; i<data.length; i++) {
            if(data[i] > data[maxI])
                maxI = i;
        }
//        data[maxI]/=2;  //ต้องการลดค่า ของค่ามากที่สุดในอาเรย์
        System.out.println("max = " + data[maxI]);
        
    }
    
}
