package Array1D;

public class SortArray1D {
    public static void main(String[] args) {
        int[] data = {35, 78, 9, 47, 99, 1};
        
    for(int j=0; j<data.length; j++ ) { //เอาไว้สร้าง method สำหรับเรียงข้อมูล
        for(int k = j+1; k<data.length; k++) {
            if(data[j] > data[k]) {
                int t = data[j];
                data[j] = data[k];
                data[k] = t;
                System.out.println(j+","+k);
            }
        }
    }
  
        
    }
    
}
