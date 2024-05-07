package exceptions;

/*

we can create our own class extending anything from throwable or exception, or runtimeexception

if we extent chcked one, we will create checked exception, if we extend unchecked, we will crate unchecked exception



 */

public class UsreDefinedException {

    public static void main(String[] args) {
        Bank b = new Bank();
        b.withdraw(500);

        System.out.println(b.getBalance());

        b.withdraw(600); // here our user defined exception will come
    }
}


class Bank {


    double balance = 1000;

    public double getBalance() {

        return balance;
    }

    public void withdraw(double amount) {

        if (amount>balance) {
            throw new InsufficentFundException("withdrawl amount request is more than balance"); // this is my own defined exception, not available in java
        } else {

            balance = balance - amount;
        }

    }

}

class InsufficentFundException extends RuntimeException{

    InsufficentFundException(String s) {

        super(s);

    }




}