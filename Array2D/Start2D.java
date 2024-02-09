package Array2D;


public class Start2D {
    public static void main(String[] args) {
        int[][] d = {   {1,  2,  3,  4},
                            {5,  6,  7,  8}, 
                            {9, 10, 11, 12},
                            {10, 30, 14, 16}};
        int[][] a = {   {1,  2,  3,  4},
                            {5,  6,  7,  8}, 
                            {9, 10, 11, 12},
                            {10, 30, 14, 16}};
        print2D(d);
        System.out.println("sum = "+ sum2D(d));
        System.out.println("sumRow = "+ sumRow(d,0));
        System.out.println("sumColumn = "+ sumColumn(d, 3));
        System.out.println("ผลรวมของช่องในแนวทแยงมุม ซ้าย-ขวา= " + sumDiagonal(d));
        System.out.println("ผลรวมของช่องในแนวทแยงมุม ขวา-ซ้าย = " + sumDiagonalR(d));
        System.out.println("ผลรวมของช่องในแนวทแยงมุม ขวา-ซ้าย = " + sumTriangleDown(d));
        System.out.println("ผลรวมของช่องในแนวทแยงมุม ขวา-ซ้าย = " + sumTriangleUp(d));
        System.out.println(addArray2D(a, d));
    }
    
    // แสดงผล Array 2D จากตัวแปร
    public static void print2D(int [][]d) {
        for(int j=0; j<d.length; j++) {
            print1D( d[j] );
        }
    }
    // แสดงผล Array 1D จากตัวแปร
    public static void print1D(int []d) {
        System.out.print("[");
        for(int j=0; j<d.length; j++) {
            if( j < d.length-1 )
                System.out.print(d[j] + ",");
            else
                System.out.print(d[j] + "] \n");
        }        
    }
    // รวมค่าในอาเรย์ 2 มิติ
    public static int sum2D(int[][] d) {
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                sum+=d[i][j];
            }
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
    public static int[][] addArray2D(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j]; 
            }
        }
        return c;
    }
    
}
