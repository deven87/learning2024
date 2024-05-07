package exceptions;

/*

throw is used to throw exception explicitly

e..g you want to throw user defined exception or throw a system defined exception

throw keyword is required if programmer want to throw an keyword to JVM


 */

import java.io.IOException;

public class ThrowKeyword {

    public static void main(String[] args) throws Exception{
        MyException tk = new MyException();
        tk.m1();


    }
}


class MyException extends Exception {


    void m1() throws IOException{

        int balanceAmount = 100;

        int withdrawlAmount =200;

        if (withdrawlAmount>balanceAmount)

            throw new IOException("my new exception");

        // here our thrown exception object is handed over to jvm and jvm will do things further


    }

    void m2() {

        // here exception raise and handover is done automatically by JVM
        System.out.println(100);
    }



}
