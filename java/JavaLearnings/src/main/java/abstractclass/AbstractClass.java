package abstractclass;

/*

A class that have o or more abstract methods, which can not be initialized and having keyword abstract is abstract class

partially implemented class is abstract class

abstract class can not be final

abstract method can not be final, synchronized, static, strictfp

abstract class can be strictfp

abstract class can be public or default

abstract method can be public or default or protected but can not be private

a class which is not abstract can not have any abstract method but a class
which is abstract, can have 0 or more abstract methods

 */

// public abstract class
public abstract class AbstractClass {

    public static void main(String[] args) {

        // reference of abstract class can be created but not object
        AbstractClass ac = new NoAbstractClass4();

        // can create object of any subclass of abstract class and assign abstract class reference to it

    }


}


// default abstract class
abstract class AbstractClass1 extends AbstractClass{


}


// default abstract class
abstract class AbstractClass2 {

    // abstract class having normal public and default method
    public void m1() {

    }

    void m2() {

    }

    // abstract class having abstract public and default method


    abstract public void m3();

    abstract protected void m5();

    abstract  void m4();

    // abstract method can not be private

    //private abstract  void m6();

}

// abstract class can extentds another normal or extend class

abstract  class AbstractClass3 extends AbstractClass1 {

}

class NoAbstractClass4 extends AbstractClass3 {

}

/*

class or method can not be both abstract and final
abstract final class A {

}

 */

abstract class B {

    // you can not have static and abstract together
   // static abstract public void m2();

    // you can not have synchronied and abstract together
  //  synchronized abstract public void m3();



}

// class level you can have abstract and strictfp
abstract  strictfp class C {

    // you can not have strictfp and abstract together in a method

    // strictfp abstract public void m3();

}



