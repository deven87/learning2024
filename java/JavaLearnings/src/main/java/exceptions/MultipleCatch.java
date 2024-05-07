package exceptions;

import java.io.IOException;

/*


multiple catch block can be there having different exception to be handled

if using a parent exception, have to be used at bottom

can not use parent catch first and then child catch as it will always be handled by parent so no use of child after parent

exception raised statement must be in try only for it to be handled by customized way
otherwise it will be abnormal termination


for same exception only one catch block is allowed

parent exception catch should always come below child

try-finally, try-catch-finally, try-catch, try-catch-catch all are valid

try only, finally only, catch only not allowed

try catch finally try catch not allowed

try-finally-catch not allowed, order should be try-catch-finally try-catch or try-finally

catch or finally must come imediately after try catch





 */

public class MultipleCatch {

    public static void main(String[] args) {

        MultipleCatch mc = new MultipleCatch();
        mc.m1();

    }

    public void m1() {


        try{

            System.out.println("1");

            System.out.println(10/0);
            System.out.println("2");


        } catch (Exception e) {

            System.out.println("3");

        } catch (Throwable e) {

            System.out.println("4");

        } finally {

            System.out.println("5");
        }
        System.out.println("6");


    }
}
