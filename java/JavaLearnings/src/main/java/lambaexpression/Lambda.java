package lambaexpression;

/*

a lot of programming language now uses lamba expression

LISP is the first program used it

like annonymous arrays, annonymous inner class, we have annonymous method know as lamba expression

a fuction not having name, modifier and return type is known as lambda expression

lamba expression can be implemented for functional interface and no need to create a class just to implement that interface

directly using interface reference you can invoke lamba expression





 */

public class Lambda {


    // remove the name, return type, modifier
    // body contains 1 line so remove curly braces
  //    () -> System.out.println("hello"); // this is a lambda expression

    // calling it is also different


    public void m2(int a, int b) {
        System.out.println(a+b);
    }

    // remove name, return type and access mnodifier


  //  (int a, int b) -> System.out.println(a+b);

    // we are not needed to specify type also

 //   (a,b) -> System.out.println(a+b);


    public int squareIt(int x) {

        return x*x;
    }

 //   (x) -> return x*x; //valid


   // only 1 parameter so () are optional

 //  x -> return x*x; //valid

    // return is also optional in lamba, righting something means you are returning value
  //  x->x*x;  valid





    public static void main(String[] args) {
        Lambda l = new Lambda();


        // here i want to class my interface method

        I i = new ImplementingI();
        i.squareIt(10);
        i.squareIt(20);

        // now with concept of lamda expression, we are not needed to create class ImplementingI just to implement interface

        // reference variable is used to hold function instead of object
        I i1 = x -> x*x; // here we are not using implementing class at all, directly using lamba expression

        i1.squareIt(10);


    }
}


// function has only a single abstract method, also know as functional interface came in 1.8
// this functional interface can be implemented without creating a class

interface I {

    int squareIt(int x) ;

}

class ImplementingI implements I {


    @Override
    public int squareIt(int x) {

        return x*x;
    }
}