package interfaces.staticmethods;

public class StaticMethods implements B {

    // this m1 is hiding all interfaces methods
    static void m1() {
        System.out.println("Class  StaticMethods static method m1");
    }

    public static void main(String[] args) {

        m1();
        A.m1();

    }
}

interface A {

    static void m1() {
        System.out.println("Interface A static method m1");
    }

    static void m2() {
        System.out.println("Interface A static method m2");
    }
}

interface B extends A{

    static void m1() {
        System.out.println("Interface B static method m1");
    }



}

interface C {

    static void m1() {
        System.out.println("Interface C static method m1");
    }

}

class MyClass implements A, C {

    public static void main(String[] args) {
      //  m1(); // m1 is in both A and C so here in MyClass we have to define it or call via interface name
        // otherwise it will not recognize
      //  m2(); // here m2 is coming only from 1 of the interface so here static reference error will be there
        A.m1();
        C.m1();
        A.m2();


    }

}