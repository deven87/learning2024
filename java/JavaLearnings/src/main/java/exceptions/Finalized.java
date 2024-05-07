package exceptions;


import java.io.IOException;

public class Finalized extends A11{

    public static void main(String[] args) {



    }

    public void finalize() {

        System.out.println("called just before garbage collector is about to perform cleanup");

    }

    @Override
    void m1() throws IOException {

    }
}

abstract class A11 {

    abstract void m1() throws Exception;


}
