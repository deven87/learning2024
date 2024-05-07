package interfaces.statics;


/*

from 1.8 inside interface, we can have static methods
these are general utilities method which are not related to object

static methods and variables can not be overridden , they are hiding

static method of interface can be always called using only interface name

static methods of interface are not available to implementing classes directly, so can be called only via using interface names

static methods are available even when the interface is not implemented, using interface name


from 1.9 we can have private static methods as well in interface


two interfaces can have same name signature static method and same can be there in implementing class
as they are not available by default, only available via interface.


 */

public class StaticInterface1 implements O1, O2{

    static void m1() {
        System.out.println("StaticInterface1 m1 method");
    }
    public static void main(String[] args) {

        StaticInterface1 si = new StaticInterface1();
        // si.m1(); // can not call static method of interface in any way apart from using that interface name

        O1.m1(); // valid
        O1.m2();
        O2.m2();

        O1 si1 = new StaticInterface1();
        O2 si2 = new StaticInterface1();


    }
}

interface O1 {

    static void m1() {
        System.out.println("O1 m1 method");
    }

    static void m2() {
        System.out.println("O1 m2 method");
    }
}

interface O2 extends O1{

    // m2 of O1 is not available here as its static
    static void m2() {
        System.out.println("O2 m2 method");
    }

}

class B {
    public static void main(String[] args) {

        O2.m2(); // here B is not implementing O2 but m2 is still avaialble
    }
}



// A,F,