package constructors;

/*

this and super can be used as first statement inside constructor to provide code reusability


 */

public class OverloadingWithThis {


    OverloadingWithThis() {

        this("hello");
        System.out.println("no arg const");


    }

    OverloadingWithThis(int x) {

        this();
        System.out.println("int arg const");

    }

    OverloadingWithThis(String x) {


        System.out.println("string arg const");

    }

    OverloadingWithThis(int x, String y) {

        System.out.println("2 arg const");

    }

    public static void main(String[] args) {

        OverloadingWithThis oc = new OverloadingWithThis(10);

    }
}
