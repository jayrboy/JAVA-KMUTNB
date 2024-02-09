package Array1D;

public class SumArray1D {
    public static void main(String[] args) {
        int[] data = {35, 78, 9, 47}; 
        
        int sum = 0;    //หาผลรวม   169
        for(int i=0; i<data.length; i++) {
            sum+=data[i];
            System.out.println("data[" + i + "] = " + data[i]);
        }
        System.out.println("Sum Array1D = " + sum);
        
        System.out.println();
        
        int product=1;  //หาผลคูณ 1154790
        for(int i=0; i<data.length; i++) {
            product = product * data[i];
            System.out.println("data[" + i + "] = " + data[i]);
        }
        System.out.println("Product Array1D = " + product);
        
        
        
    }
}
