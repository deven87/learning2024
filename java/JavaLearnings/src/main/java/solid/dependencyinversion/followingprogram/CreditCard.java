package solid.dependencyinversion.followingprogram;

public class CreditCard implements BankCard{

    public void doShopping(String amount) {

        System.out.println("Shopping via Credit card");
    }

}
