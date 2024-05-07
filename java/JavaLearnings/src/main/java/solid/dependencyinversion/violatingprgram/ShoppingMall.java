package solid.dependencyinversion.violatingprgram;

public class ShoppingMall {


    // here shopping can only be done via debit card, if we have to use credit card, we had to modify the shopping mall class
    // this is because we are not implementing the dependency inversion principle
    // high level module should not depend on low level module/details, both should depend on abstraction
    private DebitCard dc;

    ShoppingMall(DebitCard debitCard) {

        dc = debitCard;
    }

    public void doPurchase(String amount) {

        dc.doShopping(amount);

    }


    public static void main(String[] args) {


        DebitCard dc = new DebitCard();
        ShoppingMall sm = new ShoppingMall(dc);

    }

}