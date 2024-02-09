package loop;

public class NestedPatternNum {
    public static void main(String[] args) {
        
        int n = 6;
        System.out.println("Pattern B");
        
        for(int r=1; r<=n; r++) { //  row
            System.out.print("  ");
            for(int m=1, c = r; c<=n; m++, c++) {
                System.out.print(" "+m);
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
