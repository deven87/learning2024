package exceptions;

public class ThrowOwnException {

    public static void main(String[] args) {

     //   throw new ThrowOwnException(); // can not throw any class as it is not implementing throwable
    }
}

// our created exception are checked exception as we have extended throwable

class Test extends Throwable {

    public static void main(String[] args) throws Test {

        throw new Test();

    }
}

// our created exception is unchecked as we have used Runtimeexception which is unchecked
class Test1 extends RuntimeException {

    public static void main(String[] args) {

        throw new Test1();

    }
}

