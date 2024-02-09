public class TestStatic {
    public static void main(String[] args) {
        DSA_Lab01 b = new DSA_Lab01();
        int[] d={12, 6, 7, 4, 8, 34, 59, 28};
        b.print1D(d);
        
//        b.shuffle(d);
//        b.print1D(d);
        
        b.remove(d, 3); // {12, 6, 7, 8, 34, 59, 28, 0}
        b.print1D(d);
    }
    
   
}
