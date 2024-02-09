package loop;

public class Interest {
    public static void main(String[] args) {
        double b=100000;
        double r=5.0;
        int y=0;
        while(b<=1000000) {
            y++;
            b=b+(b*r/100);

        }
        System.out.print(y+" Years for ");
        System.out.print("Deposit compound "+ r +" % ");
        System.out.print(" interrest ");
        System.out.println("about 1,000,000");
    }
    
}
