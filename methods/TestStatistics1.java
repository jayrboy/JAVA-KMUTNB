package methods;

import java.util.Scanner;

public class TestStatistics1 {
    public static void main(String[] args) {
        
        Scanner kb=new Scanner(System.in);  //Read Data
        int n = kb.nextInt();
        int[] d = new int[n];
        for(int i=0; i < d.length; i++) {
            d[i] = kb.nextInt();
        }
        
        int s=0;                                                  //Mean
        for(int i=0;i<d.length;i++) {
            s+=d[i];
        }
        double mean = (double) s/n;
        
        for(int i=0; i<d.length; i++) {                    //Median
            for(int j=i+1; j<d.length; j++)  {
                if(d[i] > d[j]) {
                    int t = d[i];
                    d[i] = d[j];
                    d[j] = t;
                }
            }
        }
        double median = (d[(n-1)/2]+d[n/2])/2.0;
        
        int mode=0;                                         //Mode
        int maxCount=0;
        for(int i=0; i<d.length; i++) {
            int c=0;
            for(int j=0; j<d.length; j++) {
                if (d[i] == d[j])
                    c++;
            }
            if (c > maxCount) {
                maxCount=c;
                mode=d[i];
            }
        }   
    }
   
}
