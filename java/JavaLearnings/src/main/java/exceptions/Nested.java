package exceptions;

/*

in nested try catch, if inner catch handles the exception, outer  catch will never execute, but if exception

is not handled in inner catch then it will be handled by outer catch

finally will be executed for all try catch whether exception is handled or not

in case of nested catch, both inner and outer catch can catch same exception as both catch belongs to different try block


try-catch-finally is one block, hence {} are mandatory even if one statement is there in try or catch or finally

you have to write {} in try, catch and finally



 */

import java.io.IOException;

public class Nested {

    public static void main(String[] args) {


        try {

            System.out.println("1");

            try {


                System.out.println("2");

                System.out.println(10 / 0);

                System.out.println("3");

            } catch (NullPointerException e) {

                System.out.println("4");


            } finally {
                System.out.println("inner finally");
            }

            System.out.println("5");

        } catch (Exception e) {

            System.out.println("6");


        } finally {

            System.out.println("outer finally");
        }
    }

    public void m1() {

        try {

            try {

            } catch (Exception e) {

            }

        } catch (Exception e) {

        }


    }

}
