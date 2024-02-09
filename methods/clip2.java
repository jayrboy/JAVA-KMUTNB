package methods;

public class clip2 {
    public static void main(String[] args) {
        int a=300;
        int b=clip(a);
        System.out.println(b);
    }
    
    public static int clip (int a) {
       a = Math.max(a, 0);
       a = Math.min(a, 255);
       return a;
    }
    
}
