package oopss.inheritance.multiple;

/*




inheriting from more than 1 class is called multiple inheritance, it is not allowed in java due to ambiguity problem


you are inherting class B into C, now every class already inherit Object, so is it multiple inheritance

no, its not

of our class extend any other class, then Object is not inherited directly, its inherited from multilevel and not multiple






 */

// multiple inheritnace via class is not possible
// only extent one of the class, as if both class extend were allowed there will be ambiguity on calling m1 and B using child object
public class MultipleInheritance extends A{


}

class A {

    public void m1(){}
    int x=10;
}
class B {

    public void m1(){}
    int x=10;
}


// multiple inheritance via interface is possible
interface A1 {

    default void m1(){};
    default void m2(){};
    int x =10;

    static void x1() {

    }


}

interface B1 {

    default void m1(){};
    int x =20;

    static void x1() {

    }

}

class C implements A1,B1 {

    // same multiple inheritance is possible in case of interface, lets use default method as they are by default available in parent
    // now C is having A1s and B1s m1 so it must override it, otherwise compile time error
    @Override
    public void m1() {
        A1.super.m1();

        C c = new C();
        A1 a = new C();
        B1 b = new C();
        c.m2();
        System.out.println(A1.x);
        System.out.println(B1.x);
        System.out.println(a.x);
        System.out.println(b.x);
       // System.out.println(c.x); // not allowed as x is inherited from both A1 and B1 so ambigous, have to call via parent reference
        // or have to call via parent interface name
        // but in case of static method, it can be only called via parent interface name only
       //  c.x1(); // can not resolve X1 as static method are not inherited
       //  a.x1(); // static method can not be called using parent reference, only via parent interface name
        //  b.x1(); // static method can not be called using parent reference, only via parent interface name

        A1.x1();
        B1.x1();
    }
}


// cyclic inheritance not allowed
/*
class Z extends Z {

}

 */


// cyclic inheritance not allowed
/*

class Z1 extends Z2 {

}

class Z2 extends Z1 {

}

 */

