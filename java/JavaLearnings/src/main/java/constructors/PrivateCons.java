package constructors;


public class PrivateCons {

    private PrivateCons() {

        System.out.println("private const");
    }

    protected PrivateCons(int x) {

        System.out.println("private const");
    }

    public static void main(String[] args) {

    }
}


class parent {

    public static void main(String[] args) {

      // PrivateCons pc = new PrivateCons(); // not allowed as no arg const is private

        PrivateCons pc1 = new PrivateCons(11); // allowed as const is private
    }



}
