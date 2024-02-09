package loop;

public class NestedPatternLoop {
    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int k = kb.nextInt();
        int k = 6;
        
        // Increasing Triangle สามเหลี่ยมล่างมุมซ้าย
        for (int r =1; r<=k; r++){
            for (int c=1; c<=r; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Decreasing Triangle สามเหลี่ยมบนมุมซ้าย
        for (int r =1; r<=k; r++){
            for (int c=r; c<=k; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Right Sided Triangle  สามเหลี่ยมล่างมุมขวา
        for (int r=1; r<=k; r++) {
            for (int c=r; c<=k; c++) {
                System.out.print("  ");
            }
            for (int c=1; c<=r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Right Sided Triangle  สามเหลี่ยมบนมุมขวา
        for (int m=1, r=1; r<=k; r++) {
            for (int c=1; c<=r; c++) {
                System.out.print("  ");
            }
            for (int j=r; j<=k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
}
