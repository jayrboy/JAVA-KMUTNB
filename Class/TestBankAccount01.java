package Class;


public class TestBankAccount01 {
    public static void main(String[] args) {
        BankAccount bal = new BankAccount("020-292", 0.0);
        System.out.println(bal);
        
        bal.deposit(777);
        System.out.println(bal);
        
        bal.withdraw(177);
        System.out.println(bal.toString());
        
        String s = bal.toString();
        System.out.println(s);
        
        bal.withdraw(100);
        System.out.println(bal);
        
        bal.deposit(100);
        System.out.println("("+bal.getIID() + "," + bal.getBalance()+")");
    }
    
}
