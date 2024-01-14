package concurrentprogrmming;

public class BankAccount {
    private double balance;

    public synchronized void deposit(double amount){
        double newBalmce = balance + amount;
        balance = newBalmce;
    }

    public synchronized void withDraw(double amount) throws Exception{
        double newBalance = balance - amount;
        if (newBalance < 0 ){
            throw  new Exception("Insufficient Funds!");
        }

        balance = newBalance;
    }

    public synchronized double getBalance(){
        return balance;
    }
}
