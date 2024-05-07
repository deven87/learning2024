package solid.dependencyinversion.followingprogram;

public class ShoppingMall {

    // here instead of using low level module debit card and credit card directly we have implemented an interface and using that interface in both debit card and credit card, and in shoppingmall
    // so debitcard, creditcard and shopping mall all depends on abstraction
    BankCard bankCard;

    ShoppingMall(BankCard bankCard) {

        this.bankCard = bankCard;
    }

    public void doPurchase(String amount) {

        bankCard.doShopping(amount);

    }


    public static void main(String[] args) {


        BankCard bankCard1 = new DebitCard();
        ShoppingMall sm1 = new ShoppingMall(bankCard1);

        sm1.doPurchase("100");

        // or

        BankCard bankCard2 = new CreditCard();
        ShoppingMall sm2 = new ShoppingMall(bankCard2);

        sm2.doPurchase("1000");

    }

}