package methods;

public class clip1 {
    public static void main(String[] args) {
        int a=-9;
        int b=clip(a+5);
        System.out.println(b);
    }
    
    public static int clip (int a) {
       if(a < 0)
           return 0;
       if(a > 255)
           return 255;
       return a;
    }
    
}
