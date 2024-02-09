package loop;

public class NestedLoop3 {
    public static void main(String[] args) {
        for (int z= 1;z<=15;z++) {
            for (int y =1; y<=z;y++) {
                for (int x= 1; x<= y;x++) {
                    if (Math.pow(z, 2) == (Math.pow(x, 2)+Math.pow(y, 2))) {
                        System.out.println(x + "^2" + " + " + y + "^2" + " = " + z + "^2" );
                        
                    }
                }
            }
        }
    }
    
}
