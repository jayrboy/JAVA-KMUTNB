package loop;


public class Boolean {
    public static void main(String[] args) {
        int n= 20;
        
        for(int k=2;k<n;k++) {
            boolean k_is_prime = true;
            
            for(int m=2; m<k; m++) {
                if( (k%m) == 0 ) {
                    k_is_prime = false;
                    break;
                }
            }
            
            if(k_is_prime)
                System.out.println(k_is_prime + " = " + k);
        }
    }
    
}
