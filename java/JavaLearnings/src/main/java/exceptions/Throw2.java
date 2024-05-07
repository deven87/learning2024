package exceptions;

public class Throw2 {


    static ArithmeticException ae;

    public static void main(String[] args) {

        // here exception thrown is nullpointer as ae is null and you are throwing it
        throw ae;
    }

}

class A {

    static ArithmeticException ae = new ArithmeticException();

    public static void main(String[] args) {
        // here exception thrown is ArithmeticException
        throw ae;
    }

}

class B{

    public static void main(String[] args) {

        System.out.println(10/0);
        System.out.println("hello");
    }
}

class C{

    public static void main(String[] args) {

        throw new ArithmeticException("division by zero");
       // System.out.println("hello"); // here it will never execute as we are throwing exception explicitly so compiler will give error

    }
}

class D {

    public static void main(String[] args) {
        m1();
    }

   static  void m1() {

        m2();
   }

   static void m2() {

        throw new NullPointerException("my exception");

   }
}