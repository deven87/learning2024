package methods.overloading;

/*

compiler will first check exact match, if not found it will check implicit typecasted method

 */

public class Overloading2 {


    public void m1(double d) {
        System.out.println("double d");
    }

    public static void main(String[] args) {

        Overloading2 p2 = new Overloading2();

        // passing int but only double method is available, but since int can be implicitly converted to double, compiler
        // will call double one
        p2.m1(10);

    }

}

    class A {


        void m1(int x) {
            System.out.println("int x");
        }

        void m1(double x) {
            System.out.println("double x");
        }

        void m1(Object s) {
            System.out.println("string s");
        }



        public static void main(String[] args) {


            A a = new A();
            a.m1(10); // this time exact match is there so int one will be called

            a.m1('x'); // char can be promoted to int

            a.m1(10.0f); // promoted to double

            a.m1(10l); // promoted to double

            a.m1("asd"); // string



        }


}


class D {

    void m1(String s) {
        System.out.println("String");
    }

    void m1(Object s) {
        System.out.println("Object");
    }

    public static void main(String[] args) {

        D d= new D();

        // child one will get more priority as null is valid for String and Object both
        // in such cases child one will get more priority
        d.m1(null);
    }

}


class E {

    void m1(String s) {
        System.out.println("String");
    }

    void m1(StringBuilder s) {
        System.out.println("StringBuilder");
    }

    public static void main(String[] args) {

        E e = new E();
      //  e.m1(null); // here amibiguity error from compiler as it can call both, as no relation between String and String builder

    }

}


