package Array2D;

public class TestECT {
    
    public int ectX(int[][] d) {
        int col =0;
        int sumMax = 0;
        int[] s = new int[d[0].length];
        for (int c = 0; c < d[0].length; c++) {
            int sum = 0;
            for (int r = 0; r < d.length; r++) {
                sum += d[r][c];
            }
            s[c] = sum;
            if (sum > sumMax) {
                sumMax = sum;
                col = c;
            }
        }
        for (int j = 0; j < d[0].length; j++) {
            if (sumMax == s[j] && j != col) 
                return -1;
        }
        return col;
    }
    
    public int ectY(int[][] d) {
        int row =0;
        int sumMax = 0;
        int[] s = new int[d.length];
        for (int r = 0; r < d.length; r++) {
            int sum = 0;
            for (int c = 0; c < 10; c++) {
                sum += d[r][c];
            }
            s[r] = sum;
            if (sum > sumMax) {
                sumMax = sum;
                row = r;
            }
        }
        for (int j = 0; j < d.length; j++) {
            if (sumMax == s[j] && j != row) 
                return -1;
        }
        return row;
    }
    
}
