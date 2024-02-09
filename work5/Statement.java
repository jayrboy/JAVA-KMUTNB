package work5;

public class Statement {
    public static void main(String[] args) {
        double []values = new double[10];
        values[values.length-1] = 5.5;

       double sum =  values[0] + values[1];
        System.out.println("The Sum of the first two element " + sum);
        
        for(int i=0; i<values.length;i++) {
            sum+=values[i];
            System.out.println("Value  "+ i + " = "+ values[i]);
        }
        System.out.println("Sum of statement in the array = " + sum);
        
        
        
    }
    
}
