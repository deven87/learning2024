package solid.singleresponsibility.followingprogram;

public class BankService {

   // the class will chnage only when bank service i.e. deposit/withdraw is to change
    double balance;

    public void deposit(double amount) {

        balance = balance + amount;

    }

    public void withdraw(double amount) {

        balance = balance - amount;

    }
}
