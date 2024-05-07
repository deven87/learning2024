package interfaces.defaultmethods;

/*

from 1.7 static methods were allowed

from 1.8 default methods were allowed

when multiple interfaces have same default methods with name and signature
then it is mandatory for the implementing class to override that otherwise compile time error
 overridding is not necessary if above condition is not true

 default method also known as defender method

 default method is by default available to child class


 default methods were needed because of following scenario:

 lets say interface have 10 methods and around 100 classes implements that interface

 now if even we have to add 1 more method to interface, we have to update all classes which are implementing the interface
 so instead of adding it as normal method, we can add it as default, and it will be automatically avaiable in all implementing classes


default method provides backward compatibility

default method will override just like normal method without using keyword default

default keyword is allowed only inside interface

object class methods can not be overridden as default methods in interface, as they are avaialble to every class


just like multiple inheritance, ambiguity problem can come in case of deafult methods also if two or more interfaces
have same signature method
so we can solve it my overriding the method in implementing class

by default default method is availabel in implementing class, no need to override
 */

public class DefaultMethods implements B{

    public static void main(String[] args) {
        DefaultMethods dm = new DefaultMethods();

        dm.m1();



    }
}

interface A {
    default void m1() {
        System.out.println("default m1 of A");
    }

    default void m2() {
        System.out.println("default m2 of A");
    }
}

interface B extends A {
    default void m1() {
        System.out.println("default m1 of B");
    }

}

interface C  {
    default void m1() {
        System.out.println("default m1 of C");
    }

}

class MyClass1 implements A,C {


    // must  override default method as both A and C contains same name and signature default method
    public void m1() {

    }

    public static void main(String[] args) {


    }

}


