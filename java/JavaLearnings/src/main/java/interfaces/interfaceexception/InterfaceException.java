package interfaces.interfaceexception;

/*



                                object
                                throwable
             Exception                                                              error


   RuntimeException       InteruptedException      IOException
   Arithmetic
   Nullpointer

   All classes including and inside RuntimeException and error are checked
   rest are uncheked
   means compiler will check for only RTE and all its subclasses exception


if child is throwing any checked exception, parent must throw same or its parent if it is throwing, otherwise it can not throw any

if parent is throwing checked exception or unchecked, you can have same method without throwing any exception

no restriction on unchecked exception


child can throw any unchecked exception or not throw at all

if child is throwing checked exception, parent must throw same or its parent exception

parent throwing any exception, child can not throw any whether checked or unchecked



 */
import java.io.IOException;

public class InterfaceException {

}


interface A {

    void m1() throws IOException;
}

interface B {

    void m1() throws Exception;
}

class ABImplements implements A, B{

    // here the overridden method is not throwing any exception, allowed
    // as parent is throwing unchecked exceptions, so it is allowed that child does not throw any
    @Override
    public void m1() {

    }
}


interface A1 {

    void m11() throws IOException;

    void m22() throws NullPointerException;

    void m33() throws ArithmeticException;
}

interface B1 {

    void m11() throws Exception;
}

class ABImplements1 implements A1, B1{

    // here m11 method throwing InterfaceException which is not thrown by a
    @Override
    public void m11(){

    }

    public void m22(){}

    public void m33() throws NullPointerException {

    }
}


interface AA1 {

    void m1() throws NullPointerException;

    void m2() throws ArithmeticException;

    void m3() throws IOException;

    void m4() throws InterruptedException;

    void m5() throws Exception;

    void m6() throws NullPointerException;
}


interface BB1 {

    void m5() throws IOException;

}

class AA1BB1Implements implements AA1, BB1 {


    //NullPointerException unchecked exception throws at parent so here it can throw any uncheked or not throws at all
    @Override
    public void m1() throws NullPointerException {

    }

    // throws ArithmeticException unchecked exception at parent, so here it can throw any unchecked
    @Override
    public void m2() throws NullPointerException {

    }

    // throws IOException checked exception at parent interface, here throws same
    @Override
    public void m3() throws IOException {

    }

    // throws checked exception in parent interface, here not throwing any
    @Override
    public void m4() {

    }

    // throws Exception and IOException in both parent interface, so here can throw IOException or child, or not throw at all
    @Override
    public void m5() throws IOException {

    }


    // throwing Unchecked exception in parent interface, here it can throw any unchecked exception, or can not throw at all
    public void m6() {

    }
}


