package Class;

    public class BankAccount {
       
    public String id = "";
    public double balance = 0;
    
    public BankAccount(String newID, double initialBalance) {
        id = newID;
        balance = initialBalance;
    }
    public void withdraw(double amt) {
        if(amt > 0 && balance >= amt) 
        balance = balance - amt;
    }
    public void deposit(double amt) {
        if (amt > 0) balance = balance + amt;
    }
    
    public String getIID() {
        return id;
    }
    
    public double getBalance() {
        return balance;
    } 
    
    public void transfer(BankAccount a, double amt) {
        if(amt > 0 && a.balance >= amt) {
            a.balance = a.balance - amt;
            this.balance = this.balance + amt;
        }
    }
    
    @Override
       // Method สือทอดมาจาก object ถ้าซ้ำ Override จะแทนที่ (ข้างในเป็นของเราเอง)
    public String toString() {
        return "("+ this.getIID() + ":" + this.getBalance() +  ")";
    }

   
}
