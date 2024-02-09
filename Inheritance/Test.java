package Inheritance;

public class Test {
    //  MAIN
    public static void main(String[] args) {
//        int j = firstindexOf("abcrbraradaf","aaabra");
//        System.out.println(j);

        String E = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String e = "abcdefghijklmnopqrstuvwxyz";
        String S = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (indexOf(E.s[i] >= 0))
                s = s+E[i];
            else
                s = s+ s[i];
        }
    }
    
    // Methods
    public static int firstindexOf(String s, String t) {
        return s.toLowerCase().indexOf(t.toLowerCase());
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
    public static int maxCount(int[] d) {
        int max = 0;
        for (int i =1; i < d.length; i++) {
            if(d[i] > d[max])
                max =i;
        }
        int count = 0;
        for (int i = 0; i < d.length; i++) {
            if(d[i] == d[max])
                count = i;
        }
        return count;
    }
    public static int minCount(int[] d, int k) {
        int min = 0;
        for (int i =1; i < d.length; i++) {
            if(d[min] > d[i])
                min =i;
        }
//        int diff = Math.abs(d[min] - k);
        int diff = (d[min]-k) > 0 ? d[min] - k : k - d[min];
        int count = 0;
        for (int i = 0; i < d.length; i++) {
            int diff2 = (d[min] - d[i]) > 0 ? d[min] - d[i] : d[i] - d[min];
            if (diff2 == diff)
                count++;
        }   
        return count;
    }
    
    
    public static int indexOf(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (s[i].equals(t))
                return i;
        }
        return -1;
    }
    
}
