package loop;

public class NestedLoop {
    public static void main(String[] args) {
        
        for(int i=0;i<3;i++) {
            for(int k=0;k<2;k++) {
                System.out.println(i + " " + k);
            }
        }
        System.out.println();
        
        for(int j=1;j<3;j++) {
            for(int x=2;x<5;x++) {
                System.out.println(j + " " + x);
            }
        }
        System.out.println();
        
        for(int t=0;t<4;t++) {
            for(int y=0;y<t;y++) {
                System.out.println(t + " " + y);
            }
        }
        
    }
    
}
