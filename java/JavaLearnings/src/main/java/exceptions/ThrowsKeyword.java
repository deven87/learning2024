package exceptions;

/*

instead of handling the exception using try catch, if you want the caller to handle it

you can use throws exception type to delicate the responsibility to the caller

throws can come with method or constructor

 fully checked exception class, can not be used in catch, unless that exception is actually thrown

 partially and unchecked catch can be there, compiler will not give any error


 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {


        FileInputStream fis = new FileInputStream("");
        ThrowsKeyword tk = new ThrowsKeyword();
        tk.m1(); // we are calling m1 so main is responsible to handle exception
        // throws by m1, but if we dont want it also to handle we can use throws for this as well



    }


    void m1() throws InterruptedException {

        Thread.sleep(1000);
    }


}

class A1{

    A1() throws IOException {

    }

    public void m1() throws Exception{

    }

    public static void main(String[] args) throws Exception {
        A1 a = new A1();
        a.m1();

        try{
            System.out.println("as");
        } catch (Exception e) {

        }


    }

}
