package interfaces.defaultmethods;

public class Default1 implements A111{

    public static void main(String[] args) {
        Default1 d = new Default1();
        A111 a = new Default1();
        d.m1();

        a.m1();

        A111.m2(); // static methods of interface can be called only via interface name
    }
}

interface A111 {
    default void m1() {
        System.out.println("A111 default" +
                " method m1");
    }

    static void m2() {
        System.out.println("static method m2 of A111");
    }
}
