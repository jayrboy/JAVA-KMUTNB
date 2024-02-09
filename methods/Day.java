package methods;

public class Day {
    public static void main(String[] args) {
        System.out.println(dayOfWeek(24,01,2023));  //DCK bulied 22/02/2022
    }
    
    public static String dayOfWeek (int d, int m, int y) {
        if (m < 3) {
            m = m + 12;
            y = y-1;
        }
        int c = y / 100, k = y % 100;
        int w = (d+26*(m+1)/10+k+k/4+c/4-2*c) % 7;
        String t;
        switch ( w ) {
            case 0: t = "Saturday";
            break;
            case 1: t = "Sunday";
            break;
            case 2: t = "Monday : Object Oriented Programming";
            break;
            case 3: t = "Tuesday : Data Structures and Argorithms";
            break;
            case 4: t = "Wednesday : Microcontroller System, Linux System";
            break;
            case 5: t = "Thursday : Mathmatrix and Vector";
            break;
            case 6: t = "Friday : PHP Web Back-End Application";
            break;
            default: t = "???";
            break;
        }
        return t;
    }
}
