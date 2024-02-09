package Array1D;

public class Test2D {
    public static void main(String[] args) {
        int [][]d = {   {1,2,4,5},
                            {0,3,4,7},
                            {9,8,6,1}   };
        
        System.out.println(d[1][2]);            // แถวที่1 ข้อมูลในอาเรย์ที่ 2
        System.out.println(d.length);       //rows 3 แถว
        System.out.println(d[0].length);    // column 0 = 4 แถว
        System.out.println(d[1].length);    // column 1 = 4 แถว
        System.out.println(d[2].length);    // column 2 = 4 แถว
        
        int [][]e = {   {1,2,4,11,5,4},
                            {0,3},
                            {9,8,6,1}, 
                            {1} };
        int sum = 0;
        for(int j =0; j< e.length;j++) {
            for (int k=0;k< e[j].length;k++) {
                sum = sum +e[j][k];
            }
        }
        System.out.println("sum e[j][k] = "+sum);   //55
        
        for (int c =0; c < e[2].length;c++) {
            sum = sum + e[2][c];
        }
        System.out.println("sum e[2][c] = "+sum);   //79
        }
    
}
