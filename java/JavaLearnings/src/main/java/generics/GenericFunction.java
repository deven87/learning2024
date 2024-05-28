package generics;

import java.util.ArrayList;

/*

generics are used to make things type safe

e.g. Object reference can hold any other object, which is not type safe, hence generics are used

generics only work with reference type and not with primitive

you can parameterise by passing generic type and then can pass any value type, so in a way it is reusable


 */

public class GenericFunction {


    public <T> void printData(T value) {

        System.out.println(value);
    }

    public static void main(String[] args) {

        GenericFunction gf = new GenericFunction();

        gf.printData(10);

        gf.printData("hello");

        gf.printData(true);

        ArrayList al = new ArrayList();

        al.add(10);
        al.add("hello");

     //   String data = (String)al.get(0); // run time exception as can not cast from integer to string

        // but this is solved by generics

        ArrayList<String> al1 = new ArrayList();

       // al1.add(10); // now only string will be added
        al1.add("hello");

           String data = (String)al1.get(0);

           // since we know all data are only String, external type cast is also not needed
        // above you can see String is redundant


       // ArrayList<int> al2 = new ArrayList(); // not allowed


        GenericClass gc = new GenericClass(10);

        GenericClass gc1 = new GenericClass("asdsd");

        GenericClass<Integer> gc2 = new GenericClass(10);

        GenericClass<String> gc3 = new GenericClass("asdsd");


    }
}

class GenericClass<T> {


    T value;
    GenericClass(T value) {

        this.value = value;

        System.out.println(this.value);

    }


}
