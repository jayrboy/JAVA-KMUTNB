package testjava2;


import java.util.Scanner;

public class FindAVG {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = kb.nextInt();

        int sum = 0;
        for (int j = 1; j <= n; j++) {
            System.out.print("Enter" + j + "# : ");
            int a = kb.nextInt();
            sum += a;
        }
        double avg = (double) sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("AVG = " + avg);
    }

}
