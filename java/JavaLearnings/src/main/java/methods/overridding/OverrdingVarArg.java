package methods.overridding;

public class OverrdingVarArg extends Parent{


    // here it is overloading as parent var arg method is coming
    // its not overriding as method argument type are not same

    // var arg can be overriden with var arg only, not with normal method, with normal method it will be called as overloading

  //  @Override // not allowed as its overloading and not overriding


    // int... is converted into int[] by compiler so it can be overriden with method having parameter as single dimension array
    public void m1(int x) {

        System.out.println("child normal");
    }


    @Override
    public void m2(int... x) {

        System.out.println("child m2 var arg");
    }

    @Override
    public void m3(int[] x) {

        System.out.println("child m3 array");
    }

    @Override
    public void m4(int... x) {

        System.out.println("child m4 array method");
    }

    public static void main(String[] args) {
        OverrdingVarArg child1 = new OverrdingVarArg();

        child1.m1(10);   // child method

        child1.m1();   // parent method


        Parent p1 = new Parent();
        p1.m1(10); // parent method


        Parent p2 = new OverrdingVarArg();

        p2.m1(10);  // parent method

        p2.m1();   // parent method


        OverrdingVarArg child3 = new OverrdingVarArg();

        child3.m2(); // child m2

        Parent p3 = new OverrdingVarArg();

        p3.m2(); // child m2 as its overriding for var arg vs var arg
        p3.m3(); // child m3 as it's overriding for var arg vs array
        p3.m3(10);

        // here reference is parent which is var arg so passing 10 is allowed but it will call child overriden method
        // as its oveririding


        OverrdingVarArg child4 = new OverrdingVarArg();

       //  child4.m3(10); // here var arg is not available as overriden by array one so passing 10 is not allowed


        child4.m4(10);

     //   p3.m4(10); // here parent method can take only array though the method called will be var arg only of child as overriden
        // but still parameter matching is done at compile time, only called method is decided at run time




    }


}

class Parent {


    public void m1(int... x) {

        System.out.println("parent m1 var arg");
    }

    public void m2(int... x) {

        System.out.println("parent m2 var arg");
    }

    public void m3(int... x) {

        System.out.println("parent m3 var arg");
    }

    public void m4(int[] x) {

        System.out.println("parent m4 array method");
    }
}
