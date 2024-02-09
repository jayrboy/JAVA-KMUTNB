package Class2;

public class Test {
    //  MAIN
    public static void main(String[] args) {
//        int j = firstindexOf("abcrbraradaf","aaabra");
//        System.out.println(j);

        String E = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String e = "abcdefghijklmnopqrstuvwxyz";
        String s = "";
        
        System.out.println(E);
        System.out.println(e);
        System.out.println(s);
        
        for (int i = 0; i < s.length(); i++) {
//            if(indexOf(E, s[i]) >= 0)
//                s = s +E[i];
//            else
//                s = s + s[i];
            if(indexOf(E, s) >= 0)
                s = s +E;
            else
                s = s + s;
            
        }
    }
    
    // Methods
    public static int firstindexOf(String s, String t) {
        return s.toLowerCase().indexOf(t.toLowerCase());
    }
    
    public static int zeroPad(int d, int k) {
        int z = d;
        int c = 0;
        
        String s = "";
        while(z > 0) {
            s = z% 10 + s;
            z = z /10;
            c++;
        }
        if (c >= k)
            return d;
        int i = k-c;
        while(i > 0) {
            s = "0" + s;
            i--;
        }
        return Integer.parseInt(s);
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
            if (s.equals(t))
                return i;
        }
        return -1;
    }
    
    
}
