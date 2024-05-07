package interfaces;
/*



 */

import java.io.IOException;

public interface InterfaceExample2 {

    void m1() throws NullPointerException;

    void m2() throws IOException;

}

class Implementing implements InterfaceExample2 {

    public static void main(String[] args) {

    }

    @Override
    public void m1()  {

    }

    @Override
    public void m2() throws IOException {

    }
}

