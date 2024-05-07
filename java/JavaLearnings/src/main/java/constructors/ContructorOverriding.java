package constructors;

/*

constructors are not inherited, the parent class constructors are called from child class constructor

since no inheritance hance no overriding concept
 */

public class ContructorOverriding extends Parent10{



    // since compier will replace each constructor with having super() as first line,
    // this will call parent default or no arg constructors
    // parent also must have no constructor at all so that compiler will create default
    // or if parent have any parameterized constr, then we must have to give it no arg const as well
    ContructorOverriding(int x) {

        // super(); // compiler will add this line
        System.out.println("child const");


    }

    public static void main(String[] args) {

      //  ContructorOverriding co = new ContructorOverriding(); // not allowed as child does not contain
        // no arg cons, but parent contains it, but since inheritance is not applicable for constructor
        // parent no arg cons is not applicable in child class

        ContructorOverriding co = new ContructorOverriding(10);

    }


}

class Parent10 {

    // parent not having any const, so compiler will create default const, which can be called from parent


}
