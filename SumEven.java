public class SumEven {
    public static void main(String[] args) {
        int j = OOP_Work6.sumEven(13); // j = 42 (2+4+6+8+10+12)
        int k = OOP_Work6.sumEven(8); // k = 20 (2+4+6+8)
        int m = OOP_Work6.sumEven(77); // m = 1482 (2+4+6+8+…+74+76)
        int n = OOP_Work6.sumEven(0); // n = 0
        
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        
        int []a = {1,2};
        int [] s1 = OOP_Work6.zeroPad(5, a); // s1 = {0,0,0,1,2}; 
//        OOP_Work6.print1D(s1);
        
        int []b = {3,8,1,2};
        int [] s2 = OOP_Work6.zeroPad(7, b); // s2 = {0,0,0,3,8,1,2}
//        OOP_Work6.print1D(s2);
        
        int []c = {1,2,4,5};
        int [] s3 = OOP_Work6.zeroPad(2, c); // s3 = {1,2,4,5}
//        OOP_Work6.print1D(s3);
        
        
    }
}