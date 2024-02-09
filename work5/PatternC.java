package arrays;

public class PatternC {
    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int k = kb.nextInt();
        int k = 6;
        System.out.println("Pattern C");
        
        for(int m=1,r=1;r<=k;r++,m++) { //  row
            int j = r;
            for(int c = 1;c<=k;c++) {   // column ทำถึง r
                if (c <= k-m)
                    System.out.print("  ");
                else
                    System.out.print(" "+j--);
            }
            System.out.println();
        }
    }
}
