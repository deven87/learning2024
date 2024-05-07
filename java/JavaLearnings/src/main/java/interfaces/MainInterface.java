package interfaces;
/*

interfaces can be public or default and nothing else
requirement specification or set of services expected is interface
any service requirement specification is interface

interface vs abstract class

interface can not have concrete methods

all variables are by default public static and final
have to be initialized variable at time of declaration
all methods are by default public and abstract

default method can be there which can contain implementation

static method can be there which contains implementation

static methods of interface are also public by default.

default methods of interface are also public by default.

interface can not contains constructor, instance block, static block

interface can not contain instance variable, it can contains only public static final variables.

while overriding any method, you can not assign weaker privilege
static method of interface can be called via interface reference only

a class can implement any no of interface
an interface can extends any no of interfaces

an interface can not extends/implements a class and can not implements an interface


from java 1.8 onwards default and static methods are allowed inside interfacce


variables are static because we are not creating object of interface, variables are final because

as its static all implmenting class could change value which is not good, so its final

two interfaces having same name method but different return type, can not be implemented simultenously


while overridding a method, return type must be same was applicable till 1.4

from 1.5 covariant are also allowed


in oveririding the overridding method should be of same or high access, can not assign weaker prividege to overriding method

in overridding method, the method can throw any checked exception, but can only through same or higher level of unche ked exception

interface having same variable name overrides/hides the parents variable

but if 2 or more interfaces having same variables are implemented then if the class also has same variable it will hid interface onces

interface variables should be called using interface name.


 */

public interface  MainInterface {

}

 interface Interfaces1 {





    // constructor not allowed in interface
    /*
     Interfaces1() {

     }

     */
     int x=10;

     void m1();

     void m4();

      static void m2() {

     }

      default void m3() {

     }

     // {} // instance block not allowed in interface

     // static {} // static block not allowed in interface


     // concrete method not allowed

     /*
  void m5() {

     }

      */

     static void m7() {

     }

 }

 class A implements Interfaces1 {

     int x = 20;
     public static void main(String[] args) {
          A a = new A();
         Interfaces1 inf = new A();


         System.out.println(a.x); // calling class variable

         System.out.println(inf.x); // calling interface variable as variables are not override

         a.m1();
         a.m3();
         a.m4();
       //  a.m2(); calling static method of interface which is not defined in class

         inf.m1();
         inf.m3();
         inf.m4();
       //  inf.m2();  // static method of interface, can not call using interface reference or implementing class reference
        // A.m2(); static method of interface can not be invoked using implementing class name
         Interfaces1.m2(); // static method of interface can be invoked only via interface names
      //   inf.m6(); // interface reference can not be used to call methods available only in class
         a.m6(); // calling class method via class



     }


     void m6() {
         System.out.println("my class method");
     }
     @Override
     public void m1() {

         System.out.println("interface abstract method m1 overridden in implementing class");


     }

     @Override
     public void m4() {

         System.out.println("interface abstract method m4 overridden in implementing class");


     }

     // this m2 hides the static m2 in interface
     // static methods can not be overridden it is called data hiding
     void m2() {

         System.out.println("interface static method hidded in implementing class");

     }

     // default method can be overridden
     public void m3() {

         System.out.println("interface default method overridden in implementing class");

     }
 }

 interface AA1 {

    void m1();

 }


interface AA3 {

    void m2();
}

interface AA2 extends AA1, AA3 {

    void m3();

    // m1 overrides AA1 method
    void m1();
}

class AA4 implements AA2 {

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m1() {

    }
}