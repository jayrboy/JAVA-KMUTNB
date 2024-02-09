package Inheritance;

public class Point3D extends Point2D {
    public int z;
    public Point3D(int x1, int y1, int z1) {
            super(x1, y1);
            z = z1;   //error
    }
    
}
