package loop;

import java.util.Scanner;

public class BreakFor {
    public static void main(String[] args) {
        int n = 20;
        for(int k=2,m; k<n; k++){
            for(m=2; m<k+1;m++){
                if(k%m == 0)
                    break;
            }
            if(m==k)
                System.out.println(k);
        }
    }
    
}
