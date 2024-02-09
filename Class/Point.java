package Class;
//สร้าง class Point

public class Point {
    // สร้าง object

    private double x;    // ค่าเริ่มต้นในจาวา = 0.0
    private double y;

    // constructor 1    :   ตัวสร้างจุดให้มีพิกัดที่ (0, 0)
    public Point() {
        x = 0.0;
        y = 0.0;
    }
    // constructor 2    :   ตัวสร้างจุดให้มีพิกัดที่ (x, y)

    public Point(double x1, double y1) {
        x = x1;
        y = y1;
    }
    // constructor 3    :   ตัวสร้างสำเนาให้มีพิกัดเหมือนกับจุด p

    public Point(Point p) {
        x = p.x;
        y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    // Method สือทอดมาจาก object ถ้าซ้ำ Override จะแทนที่ (ข้างในเป็นของเราเอง)
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public boolean equals(Point p) {
        // method ตรวจสอบ x && y มีค่าเท่ากันจริงหรือไม่
        return this.x == p.x && this.y == p.y;
    }

    public double distanceTo(Point p) {
        double dx = Math.pow(this.x - p.x, 2);
        double dy = Math.pow(this.y - p.y, 2);
        return Math.sqrt(dx + dy);
    }

    public int getQuadrant() {
        int q;
        if (x == 0 && y == 0) {
            q = 0;    //  p(0, 4)
        } else if (x == 0) {
            q = 6;    // on y axis
        } else if (y == 0) {
            q = 5;    // on x axis
        } else if (x > 0 && y > 0) {
            q = 1;
        } else if (x < 0 && y > 0) {
            q = 2;
        } else if (x < 0 && y < 0) {
            q = 3;
        } else {
            q = 4;
        }
        return q;
    }

    public String getQuadrantString() {
        String s = "";
        int q = getQuadrant();
        switch (q) {
            case 0:
                s = "origin " + toString();
                break;
            case 1:
                s = "Quadrant 1 " + toString();
                break;
            case 2:
                s = "Quadrant 2 " + toString();
                break;
            case 3:
                s = "Quadrant 3 " + toString();
                break;
            case 4:
                s = "Quadrant 4 " + toString();
                break;
            case 5:
                s = "on X Axis (" + toString();
                break;
            case 6:
                s = "on Y Axis (" + toString();
            default:
                s = "";
        }
        return s;
    }

    private String[] arr = new String[10];

    public String toSting() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + "." + arr[i]);
        } 
        return null;
   }

    public int o() {
        return arr.length;

    }

    public void add(String x) {
        for (int i = arr.length-1; i >0; i--) {
            arr[i] = x;
        }
    }

    public int get() {
        int p = 100;
        for (int i = 0; i < arr.length; i++) {
            p += 10;
        }
        return p;
    }
}
