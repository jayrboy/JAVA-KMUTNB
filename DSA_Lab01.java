public class DSA_Lab01 {
    
    public void print1D(int []d) {  // => [1,2,3], จะให้โชว์แปปนี้ หรือ [7,0,1,2]
        String s = "[";
        for(int j=0;j<d.length;j++) {
            s = s+d[j];
            if(j < d.length-1)
            s = s+",";
        }
        System.out.println(s + "]");
    }
    
    public void shuffle(int[] d) {
        for(int i=0;i<=d.length;i++) {
            int x = (int)(Math.random() * d.length);
            int y = (int)(Math.random() * d.length);
            int t = d[x];
            d[x] = d[y];
            d[y] = t;
        }
    }
    
    public void remove(int[] d,int i) {
        for(int j=0; j<d.length; j++) {
            if (d[j] == d[i])
                d[j] = 0;
            for(int k=j+1; k<d.length; k++) {
                if(d[j] < d[k]) {
                    int t = d[j];
                    d[j] = d[i];
                    d[k] = t;
                }
            }
        }
    }
    
    public static void swap(int[] d) {
        for(int j=0;j<d.length;j++) {
            for(int k= j+1;k<d.length;k++) {
                if(d[j] > d[k]) {
                    int  t = d[j];
                    d[j] = d[k];
                    d[k] = t;
                }
            }
        }
    }
    
}
