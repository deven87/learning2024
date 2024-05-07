package methods.overloading;

/*

method overloading

it is always taken care by compiler so resolution is done by reference.
reference variable one will be called.
method overloading is not resolved at run time and not by run time object

hence it is also called as

static polymorphism
early binding
method overloading
compile time polymorphism


 */

public class Overloading4 {


    void m1(Overloading5 ov5) {
        System.out.println("Overloading5");
    }

    void m1(Overloading7 ov6) {
        System.out.println("Overloading6");
    }
    public static void main(String[] args) {

        Overloading7 o6 = new Overloading7();

        Overloading5 o5 = new Overloading5();

        Overloading7 o7 = new Overloading5();

        Overloading4 o4 = new Overloading4();

        o4.m1(o5); // child reference
        o4.m1(o6); // parent reference
        o4.m1(o7); // parent reference

    }

}

class Overloading5 extends Overloading7 {


}

class Overloading6 {

}
