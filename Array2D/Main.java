package Array2D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String []team = new String[4];
        for (int i = 0; i < team.length; i++) {
            team[i] = kb.next();
        }
       
        int [][]t = new int[4][4];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j <t[i].length; j++) {
                t[i][j] = kb.nextInt();
            }
        }
        System.out.println("--------------------");
    }
    
}
