package constructors;

/*

constructions can be overloaded just like methods



 */

public class ConstructorOverloading {


   protected ConstructorOverloading() {

        System.out.println("no arg cons");

    }

    private ConstructorOverloading(int x) {
        System.out.println("1 arg cons");

    }

    public ConstructorOverloading(int x, int y) {

        System.out.println("2 arg cons with int and int");

    }

    public  ConstructorOverloading(String x, int y) {

        System.out.println("2 arg cons with string and int");

    }

    ConstructorOverloading(int... x) {

        System.out.println("var arg cons");

    }

    public static void main(String[] args) {

        ConstructorOverloading co = new ConstructorOverloading();

        ConstructorOverloading co1 = new ConstructorOverloading(1);

        ConstructorOverloading co2 = new ConstructorOverloading(1, 2);

        ConstructorOverloading co3 = new ConstructorOverloading("hello", 2);

        ConstructorOverloading co4 = new ConstructorOverloading(1,2,3,4,5);



    }


}
