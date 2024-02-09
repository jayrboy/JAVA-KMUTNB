package Inheritance2;

public class TestAnimal4 {
    public static void main(String[] args) {
        Animal s = new Animal();
        s.sleep();
        s = new Monkey();
        s.sleep();
        s = new Fish();         
        s.sleep();
    }
}
