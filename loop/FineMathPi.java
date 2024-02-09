package loop;

public class FineMathPi {
    public static void main(String[] args) {
        double n = 22, d= 7;
        double pi = Math.PI;    // 3.141592653589793
        double diff = 100, diffN, diffD;
        
        while(diff >= 1e-6) {
            diffN = Math.abs(pi - (n+1)/d);
            diffD = Math.abs(pi -n/(d+1));
            if(diffN < diffD) {
                n = n+1;
                diff = diffN;
            }
            else {
                d=d+1;
                diff=diffD;
            }
        }
        System.out.println(n+"/"+d+ " = "+(n/d));   // 355/133.0 = 3.1415929203539825
    }
    
}
