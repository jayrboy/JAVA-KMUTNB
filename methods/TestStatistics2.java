package methods;

import java.util.Scanner;

public class TestStatistics2 {
    public static void main(String[] args) {
        int[] d=readData();
        double mean=mean(d);
        double median=median(d);
        int mode=mode(d);
        System.out.println(mean + "," + median + "," + mode);
    }
    
    public static int[] readData() {                        //Read Data
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        int[] d = new int[n];
        for(int i=0; i < d.length; i++) {
            d[i] = kb.nextInt();
        }
        return d;
    }
    
    public static int sum(int[] d) {
        int s=0;                                                 //Sum
        for(int i=0;i<d.length;i++) {
            s+=d[i];
        }
        return s;
    }
    
    public static double mean(int[] d) {                //Mean
        int s = sum(d);
        double mean=(double) s/d.length;
        return mean;
    }
    
    public static void swap (int[] d, int j, int k) {
        int t = d[j];
        d[j] = d[k];
        d[k] = t;
    }
    
    public static void sort(int[] d) {
        for(int j=0; j < d.length; j++) {
            for(int k = j+1; k < d.length; k++) {
                if (d[j] > d[k]) {
                swap(d, j, k);
                }
            }
        }
    }
    
    public static double median(int[] d) {
        sort(d);
        double median = (d[(d.length-1)/2]+d[(d.length/2)]) / 2.0;
        return median;
    }
    
    public static int mode(int[] d) {
        int mode = 0;
        int maxCount =0;
        for(int j=0; j<d.length;j++) {
            int c = 0;
            for(int k=0; k <d.length; k++) {
                if(d[j] == d[k])
                    c++;
            }
            if(c > maxCount) {
                maxCount = c;
                mode = d[j];
            }
        }
        return mode;
    }
    
}
