package arrays;

public class PatternD {
    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int k = kb.nextInt();
        int k = 6;
        for (int i =1; i<=k; i++){;
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int m=1, j = i; j <= k; m++, j++) {
                System.out.print(" " + m);
            }
            System.out.println();
        }
    }
}
