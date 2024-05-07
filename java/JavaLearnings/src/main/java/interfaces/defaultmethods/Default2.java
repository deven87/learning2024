package interfaces.defaultmethods;

public class Default2 implements P1, P2{

    public static void main(String[] args) {

        Default2 d = new Default2();
       d.m1();

    }

    @Override
    public void m1() {
        // since m1 is default and coming from both P1 and P2 in our class
        // we have to override it, we can create our own implementation
        // or we can call any of the parent interface method
        P2.super.m1();
        P1.super.m1();
    }
}


interface P1 {

    default void m1() {
        System.out.println("p1 m1 method");
    }
}

interface P2 {

    default void m1() {
        System.out.println("p2 m1 method");
    }
}