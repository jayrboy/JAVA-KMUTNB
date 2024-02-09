package Class;

import java.util.Scanner;

public class TestPoint05 {
    public static void main(String[] args) {
        //0 = origin (0,0)
        //1 = Quadrant 1 (x,y)
        //2 = Quadrant 2 (-x,y)
        //3 = Quadrant 3 (-x,-y)
        //4 = Quadrant 4 (x,-y)
        //5 = on X Axis (x,0) or (-x,0)
        //6 = on y Axis (0,y) or (0,-y)
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter x y : ");
        double x = kb.nextDouble();
        double y = kb.nextDouble();
        Point p = new Point(x,y);
        System.out.println("Quadrant : " + p.getQuadrant());
        System.out.println(p.getQuadrantString());
        
    }
    
}
