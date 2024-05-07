package solid.dependencyinversion.followingprogram;

public class DebitCard implements BankCard{

    public void doShopping(String amount) {

        System.out.println("Shopping via debit card");
    }


}
