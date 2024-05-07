package accessmodifiers.pack2;

import accessmodifiers.pack1.Class2;

public class Class3 {


    public static void main(String[] args) {

        // here class2 is public and outside package of class3 so can be accessed via import
        Class2 class2 = new Class2();

        // Class1 c1 = new Class1(); // not allowed as class1 is outside current package and not public

    }
}
