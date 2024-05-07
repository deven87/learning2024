package exceptions;

/*

before 1.7, we had to close resources in catch block, in case exception comes

so we have to add either finally or catch

but from 1.7 we can use try with resource where resource opened in try block will automatically close


from 1.7 if we are using try with resources, programmer dont need to close the resource opened in try block
they are closed automatically, burder is not on programmer if we use try with resources

we had to write finally compulsory and have to close all resources if not using try with resource

so this increase length of code, readability is down, programer has the burden of closing the resources


try(R) {}

once control reaches end of try block, the resource is closed automatically
we are not required to close explicitly


we can use multiple resources in same try with resources by separating with ;

resources used in try with resource must be autoclosable resources., that means the class of resource
should implement java.lang.autoClosable interface

any class which is not implementing autoclosable, and used in try with resources, then it will not be autoclosed

resource defined inside try with resources are final by default so that
we can not assign any other value to it,

try with resource an come without catch or without finally

only try was not allowed without resources, but try with resources can come alone from 1.7

in trywithresource, the declaration and assignment of resource should take place inside try only


from 1.9 the resource can be declared and initialized outside try and the reference can be used in try block
but before 1.9, we must declare and initialize the resourf e in try only

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) throws IOException {


        // till 1.6
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("abc.txt");

        } finally {

            // here we are closing the file stream in finally block
            if (fis != null)
                fis.close();
        }


    }

    public void m1() throws FileNotFoundException {

        // 1.7 and above


        try (FileInputStream fis = new FileInputStream("asd.a")) {

            fis.read();

        } catch (IOException e) {
            System.out.println("catch");
        }

        // here we have to written finally to close fis, it will be autoclosed as used try with resources


    }

    // multiple resources
    public void m2() {

        try (FileInputStream fis = new FileInputStream("asd.a");
             FileOutputStream fos = new FileOutputStream("abc.txt")) {

            fis.read();
            fos.write('a');

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // multiple resources, reassinging resources
    public void m3() {

        try (FileInputStream fis = new FileInputStream("asd.a");
             FileOutputStream fos = new FileOutputStream("abc.txt")) {

            // fis = new FileInputStream("asd.a"); // not allowed ,resources defined in try are by default final so that we can not reassign them

            fis.read();
            fos.write('a');

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // using trywithresource without catch/finally
    public void m4() throws IOException {

        try (FileInputStream fis = new FileInputStream("asd.a")) {
        }


    }

}
