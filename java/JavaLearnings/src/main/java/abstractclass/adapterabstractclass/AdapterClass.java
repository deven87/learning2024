package abstractclass.adapterabstractclass;

/*
lets say we need to implement an interface having a lot of methods but we need only 1-2 method
we still have to implement all methods right?
so instead of implementing interface directly, create a dummuy class which implements all method with dummy
now extends that class and override method you want in your way, no need to implement all methods
here the class implmenting all method as dummy , is not require to create object and has dummy implementation
so that can be created as abstract, such classes are called adapter classes

below example has class B as adapter class

java has a lot of interfaces which has adapter classes, so instead of implmenting interfaces, we extends their adapter class
// hence we save code for dummy implemnetation as it is provided via adapter class

 */

public class AdapterClass extends B{

    // here instead of implementing interface directly, we are implementing it through extending abstract class B
    // hence we dont need to implement all methods actualy here, we will override only required method.
    void m1() {
        System.out.println("my own implementation");
    }

    public static void main(String[] args) {

    }
}

interface A {

    void m1();
    void m2();
    void m3();
    void m4();
    void m5();
}

// here B is not implementing any method in real, only dummy implementation, so can be created as abstract
abstract class B {
    void m1() {

    }
    void m2() {

    }
    void m3() {

    }
    void m4() {

    }
    void m5() {

    }
}
