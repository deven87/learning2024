package oopss.inheritance;
/*

using child object and child reference you can call all parent and childs method

using parent reference and parent object, you can only call parents method

using parent reference and childs object, you can call any method which is defined only in parent

using parent reference and childs object, you can call any method which is defined in both child and parent
and childs copy will be called as run time object is of child only
but since reference is parent so the method must be there in parent

same is not with variables

parent and child having same variable, parent object will called parent variable and child object will called child variable

but parent reference and child object will still call parent variable

 */

public class Inheritance1 extends Parent{

    int x = 20;

    void m2() {
        System.out.println("Inheritance1 class m2 method");
    }

    void m1(){
        System.out.println("Inheritance1 class m1 method");
    }

    public static void main(String[] args) {
        Inheritance1 ih1 = new Inheritance1();
        ih1.m1(); // calling parents method from child reference
        ih1.m2(); // calling childs method from childs reference
        System.out.println(ih1.x); // childs x

        Parent p = new Parent();
        p.m1(); // calling parent method from parent
        // p.m2() // can not call m2 from parent as its in child and not in parent
        System.out.println(p.x); // parents x

        Parent p1 = new Inheritance1();

        p1.m1(); // now method will be called of child but it must be there in parent
        System.out.println(p1.x); // parents x

        // p1.m2(); // can not call m2 using parent reference as its not in parent

        p1.m3();  // can call m3 on parent as its in parent only

        // parent class object will call all parent methods
        // child will call all parents methods and all childs methods
        // parent reference and child object, can call all child methods but they must be defined in parent


    }
}


class Parent {


    int x =10;
    void m1(){
        System.out.println("A class m1 method");
    }

    void m3(){
        System.out.println("A class m3 method");
    }
}