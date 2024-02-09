package Array1D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScoreStat {
    public static void main(String[] args)  throws FileNotFoundException {
        int []c = new int[5];
        try (Scanner in = new Scanner (new File("C:\\Users\\JJayO\\Documents\\NetBeansProjects\\ECT-24\\src\\arrays\\StudentGrade.txt"))) {
            while(in.hasNext()) {
                String id = in.next();
                int p = in.nextInt();
                c[p]++;
            }
            in.close();
            for(int p=0; p<c.length;p++){
                System.out.println(c[p]+" Students "+ p + " Grade");
            }
        }
        
    }

}
