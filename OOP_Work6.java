public class OOP_Work6 { // Clasee
    
    public static int sumEven(int m) {  // Method
        int s = 0;
        for (int i=2; i <=m ; i+=2) {
            s+=i;
        }
        return s;
    }
    
   public static int[] zeroPad(int n, int[] d) {
        int[] arr;
        if (n <= d.length) {
            return d;
        } else {
            arr = new int[n];
            int j = n - d.length;
            for (int i = 0; i < j; i++) {
                arr[i] = 0;
            }
            for (int i = j; i < n; i++) {
                arr[i] = d[i - j];
            }
        }
        return arr;
    }

    

}

