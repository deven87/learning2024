package constructors;

import java.io.IOException;

/*

exception behaves in similar way with constructor as with methods

since parent constructor are called via child class,

parent can throw any unchecked exception, but if parent throw checked exception, child constructor calling that parent constructor
must throw same or its parent exception

child constructor can throw any exception, no way related to parent

but exception thrown by parent constructor must be handled by called by calling child constructor as a general rule of exception
handlgin

 */

public class ConstructorWithException extends MyParent{


    // parent is throwing unchecked exception
    ConstructorWithException() {


    }

    // parent is throwing unchecked exception, child can throw any exception
    ConstructorWithException(int x) throws IOException {


    }

    // parent super call is throwing checked exception so we must have same or parent throw
    ConstructorWithException(int x, int y) throws IOException {

        super(x);


    }

    // parent is throwing checked exception and child is throwing parent of that exceptions
    ConstructorWithException(int x, String y) throws Exception {

        super(x, y);


    }

    public static void main(String[] args) {
        ConstructorWithException c = new ConstructorWithException();
    }
}

class MyParent {


    MyParent() throws NullPointerException{

    }

    MyParent(int x) throws IOException{

    }


    MyParent(int x, String y) throws IOException{

    }



}
