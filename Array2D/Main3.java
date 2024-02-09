package Array2D;

public class Main3 {
    public static void main(String[] args) {
        int[][] a = {{1 ,2, 3}, 
                        {4, 5, 6}, 
                        {7, 8, 9}, 
                        {1, 0, 1}};
        print2D(a);
        swap1D(a, 1, 3);
        System.out.println("");
        print2D(a);
        rowSort(a);
        System.out.println("");
        print2D(a);
    }
    // methods บริการ Array2D
    
    // เรียงแถว Array 2D จาก แถวล่างสุดขึ้น แถวบนสุด
    public static void rowSort(int [][]d) {        
        for(int j=0; j<d.length; j++) {
            for(int k=j+1; k<d.length; k++) {
                if( sum(d[j] ) > sum(d[k]) ) {
                    swap1D(d,j,k);                    
                }
            }
        }
    }
    // เลือกสลับแถว Array 2D
    public static void swap1D(int [][]d, int j, int k) {
        for (int i = 0; i < d[j].length; i++) {
            int t =d[j][i];
            d[j][i] = d[k][i];
            d[k][i] = t;
        }
    }
    // รวมค่าทั้งหมดใน Array 1D
    public static int sum(int []d) {
        int s = 0;
        for(int j=0; j<d.length; j++)
            s = s + d[j];
        return s;
    }
    //แสดงผล Array 2D จากตัวแปร
    public static void print2D(int [][]d) {
        for(int j=0; j<d.length; j++) {
            print1D( d[j] );
        }
    }
    //แสดงผล Array 1D จากตัวแปร
    public static void print1D(int []d) {
        System.out.print("[");
        for(int j=0; j<d.length; j++) {

            if( j < d.length-1 )
                System.out.print(d[j] + ",");
            else
                System.out.print(d[j] + "] \n");
        }        
    }
    // รวมค่าทั้งหมดใน Array 2D
    public static int sum2D(int [][]d) {
        int sum = 0;
        for(int j =0; j< d.length;j++) {
            for (int k=0;k< d[j].length;k++)
                sum = sum +d[j][k];
        }
        return sum;
    }
    // รวมค่าในแถวอาเรย์ 2 มิติ แบบเลือกแถว
    public static int sumRow(int[][] d, int r) {
        int sum=0;
        for (int c = 0; c < d[r].length;c++) {
            sum = sum + d[r][c];
        }
        return sum;
    }
    // รวมค่าในหลักอาเรย์ 2 มิติ แบบเลือกหลัก
    public static int sumColumn(int[][]d, int c) {
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum+= d[i][c];
        }
        return sum;
    }
    // รวมค่าของช่องในแนวทแยงมุม มุมซ้ายบนไป-มุมขวาล่าง
    public static int sumDiagonal(int[][] d) {
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum+= d[i][i];
        }
        return sum; 
    }
    // รวมค่าของช่องในแนวทแยงมุม มุมขวาบนไป-มุมซ้ายล่าง
    public static int sumDiagonalR(int[][] d) {
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum+= d[i][d.length-i-1];
        }
        return sum;
    }
    // หาผลรวมสามเหลี่ยมล่าง
    public static int sumTriangleDown(int[][] d) {
        int sum = 0; 
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum+= d[i][j];
            }
        }
        return sum; 
    }
    // หาผลรวมสามเหลี่ยมบน
    public static int sumTriangleUp(int[][] d) {
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                sum+= d[i][j];
            }
        }
        return sum;
    }
    // อาเรย์ 2 มิติ + กัน Matrix
    public static int[][] addArray2D(int[][] a, int[][] b) {
        int[][] sum = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum[i][j] = a[i][j] + b[i][j]; 	
            }
        }
        return sum;
    }
    // หาค่ามากสุดใน Array 2D
    public static int max2D(int[][] d) { 
        int max2D = d[0][0];
        for (int i = 0; i<d.length; i++) {
            for (int j = 0; j<d[i].length; j++) {
                if (d[i][j] > max2D) 
                    max2D = d[i][j];
            }
        }
        return max2D;
    }
    // หาค่าน้อยสุดใน Array 2D
    public static int min2D(int[][] d) { 
        int min2D = d[0][0];
        for (int i = 0; i<d.length; i++) {
            for (int j = 0; j<d[i].length; j++) {
                if (d[i][j] < min2D) 
                    min2D = d[i][j];
            }
        }
        return min2D;
    }
    // หาค่ามากสุดซ้ำกัน Array 2D
    public static int maxCount2D(int[][] d) {
        int max2D = d[0][0];
        int count2D = 1;
        for (int i = 1; i<d.length; i++) {
            for (int j = 0; j<d[i].length; j++) {
                if (d[i][j] > max2D) { 
                    max2D = d[i][j];
                    count2D = 1;
                } else if (d[i][j] == max2D) {
                    count2D++;
                }
            }
        }
        return count2D;
    }
       
}
