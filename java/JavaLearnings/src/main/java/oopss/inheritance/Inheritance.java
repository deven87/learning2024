package oopss.inheritance;

/*


inheritacne is IS-A relationship

example car is a vehicle
tiger is a animal

we can use extends keyword to use inheritance

code reusabilily is the biggest advantage

extending existing functionality is inheritance



 */

import java.lang.reflect.Method;

public class Inheritance extends B{

    public static void main(String[] args) {
       Method[] m  = Inheritance.class.getDeclaredMethods();

       for (Method m1:m) System.out.println(m1.getName());





    }
}

class A {

    int x =10;
    void m1() {
        System.out.println("A class m1 method");
    }
}

class B extends A{
    int x =10;
    void m2() {
        System.out.println("B class m2 method");
    }
}
