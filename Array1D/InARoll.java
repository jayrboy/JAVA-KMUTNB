package Array1D;

public class InARoll {
    public static void main(String[] args) {
        int[] data = {35, 78, 9, 47, 99, 1, 23, 23, 74};
        
        for(int j=0; j<data.length; j++ ) {
            for(int k = j+1; k<data.length; k++) {
                int t = data[j];
                data[j] = data[k];
                data[k] = t;
            }
        
        }
        
        
    }
    
}
