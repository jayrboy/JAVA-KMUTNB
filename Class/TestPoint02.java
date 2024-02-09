package Class;

public class TestPoint02 {
    public static void main(String[] args) {
        Point[] p = new Point[5];
        for (int j=0; j <5; j++) {
            p[j]=createRandomPoint();
            System.out.println("(" + p[j].x + "," + p[j].y + ")");
        }
        System.out.println("--------------------------");
        System.out.println("(" + p[1].x + "," + p[1].y + ")");
        
        
    }
    public static Point createRandomPoint() {
        Point point = new Point();
        point.x = (int) (Math.random() * 11-5);
        point.y = (int) (Math.random() * 11-5);
        return point;
    }
    
 
    
}
