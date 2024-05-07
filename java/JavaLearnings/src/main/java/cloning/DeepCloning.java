package cloning;

// when copying object, is creating new object completely, then deep copy is being done
public class DeepCloning {

    public static void main(String[] args) {

        // all primitive types has deep copy

        int x = 10;

        int y = x;

        y = 50;

        System.out.println(x);

        boolean b = false;
        boolean b1 = b;
        b1 = true;
        System.out.println(b);


        String s1 = new String("hello");
        String s2 = new String("hi");

        s2 = s1;

        s2 = "hellohi";

        // here updating s2 does not impact s1, s1 still holds the same old value "hello"
        System.out.println(s1);






    }
}
