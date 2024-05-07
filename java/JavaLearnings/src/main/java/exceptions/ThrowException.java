package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowException {


    public static void main(String[] args) throws Exception{
        System.out.println("main");
        ThrowException te = new ThrowException();

        te.m1(); // since m1 throws checked exception either it has to be handled by try catch or by declaring throw in method

        // caller method has to throw same or parent exception if checked
        // in case of unchecked nothing needs to be done


    }

    // here m1 method can throw exception so we have to tell it in declaration
    public void m1() throws IOException {

        System.out.println("m1");
    }

    public void read() throws Exception{

        FileInputStream fis = new FileInputStream(""); // this can throw filenot found exception

        // so either have to handle using try catch or have to declar in method declaration
    }


    void m5() {

    }


}
