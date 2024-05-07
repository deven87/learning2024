package exceptions;

/*

checked exception are the ones for which compiler checks and give error if not handled

so handling can be by using try catch or using throw keyword

checked exception are those for which compiler will tell you to handle if not handled

unchecked exception are those for which compile does not give any error whether handled or not





 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedAndUnChecked {

    public static void main(String[] args) {
        CheckedAndUnChecked c = new CheckedAndUnChecked();

        c.m1();


    }

    // throwing unchecked exception, compiler not giving any error
    void m1() {

        throw new NullPointerException();
    }

    // throwing checked exception, so compiler is giving error, thats why we have added throws
    void m2() throws Exception{

        throw new IOException();
    }

    void m3() throws FileNotFoundException {

        // now there is no exception thrown in below line, but compiler give error that
        // this code may throw exception for filenot found, so you have to handle it
        // again checked exception

        // this is not throwing exception, but compiler says it might throw exception, so you have to handle it
        FileInputStream fis  = new FileInputStream("abc.txt");

        // it is not throwing any exception, but compiler says that it may throw exception so have to handle
       // Thread.sleep(1000); //again this will give compile time error as the code might throw exception
        // so have to be handled , again checked exception

    }
}
