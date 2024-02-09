package Interface;
// class รถเข็น
public class Cart {
    Priceable[] items = new Priceable[2];
    
    public int sumPrice() {
        int sum;
        sum = items[0].getPrice() + items[1].getPrice() ;
        return sum;
    }
}
