package interfaces.interfacevariables;

public class InterfaceVariables implements B,A{

    public static void main(String[] args) {
      //  System.out.println(x); // implementing both B and A, both have x variable so ambious
        // need to call usign interface name
        System.out.println(A.x);
        System.out.println(B.x);
    }
}


interface A extends A1{

    int x = 200;
}

interface A1 {

    int x = 2000;
}

interface B extends A{

    // here x is hiding A's variable xs
    int x = 20;
    int y = 100;

}

class C implements B {
    public static void main(String[] args) {

        // here x is B's x as we have implemented B
        System.out.println(x);
    }
}

class C1 implements A {
    public static void main(String[] args) {

        // here x is A's x as we have implemented A
        System.out.println(x);
    }
}


