package solid.singleresponsibility.violatingprogram;

public class BankService {

    // a class should have only a single resposibility to change, now here there are multiple resposbility
    // apart form deposit and withdraw, if we have to change otp process or passbook process, then also the class has to change
    // so its breaking single responsibility principle

    double balance;

    public void deposit(double amount) {

        balance = balance + amount;

    }

    public void withdraw(double amount) {

        balance = balance - amount;

    }

    public void sendOTP() {


    }

    public void printPassbook() {


    }
}
