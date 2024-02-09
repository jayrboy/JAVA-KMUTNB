package Inheritance2;

public class TestColor {
    public static void main(String[] args) {
        Color color;
        for (Color c : Color.values()) {
            System.out.println(c);
        }
        color = Color.Red;
        System.out.println(color);
    }
}
