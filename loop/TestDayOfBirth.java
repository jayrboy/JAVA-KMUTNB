package loop;

import java.util.Scanner;

public class TestDayOfBirth {
    public static void main(String[] args) {
        int [][]d = new int [40][2];
        // d[0][0] = day, d [0][1] = month
        Scanner kb = new Scanner(System.in);
        for(int j=0; j<40;j++) {
            System.out.print("#"+ (j+1) + " = ");
            d[j][0] = kb.nextInt(); //day
            d[j][1] = kb.nextInt(); // month
        }
        for (int j=0;j<40;j++) {
            for (int k=j+1;k<40; k++) {
                if(d[j][0] == d [k][0] && d[j][1] == d [k][1] ) {
                    System.out.print("Someone born on the same day, month, year is.. ");
                    System.out.println("Date "+ d[j][0] + " Month " + d[j][1]);
                }
            }
        }
    }
    
}
