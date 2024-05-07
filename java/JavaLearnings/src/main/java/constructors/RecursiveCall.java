package constructors;
/*
public class RecursiveCall {

    RecursiveCall() {

        this(10);
    }

    RecursiveCall(int x) {

        this();
    }
}


in this we are calling recursive constructor, which compiler can identfy and will cause compile time error

similar situation in case of method will cause run time exception stackoverflow
 */


import java.io.IOException;

class MethodCheck {

        void m1() throws NullPointerException {


        }

    void m2() throws IOException {


    }

    public static void main(String[] args) throws Exception {

        MethodCheck m = new MethodCheck();

        m.m1();
      //  m.m2(); // for checked exception you have to specify in the caller method, that it can throw exception
        // it can have same or its parent

        m.m2();

    }



}