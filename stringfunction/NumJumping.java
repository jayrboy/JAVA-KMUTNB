import java.util.Scanner;

public class NumJumping {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter digits : ");
        String n = kb.nextLine();
        boolean isIncreasing = true;
        int prevD = 0;
        for(int j = 0; j<n.length(); j++) {
            String s = n.substring(j, j+1);
            int d = Integer.parseInt(s);
            if(d < prevD) {
                isIncreasing = false;
                break;
            }
            prevD = d;
        }
        if(isIncreasing)
            System.out.println("Yes, this is an in creasing-digit number");
        else
            System.out.println("No, is not an creasing-digit number");
    }
}
