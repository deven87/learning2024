package exceptions.top10exception;

/*

Illegal state exception

 */

public class ISE {

    public static void main(String[] args) {

        Thread t= new Thread();
        t.start();

        t.start(); // t is already started but we are calling it again, this is called at not a valid state, so illegal state

    }
}
