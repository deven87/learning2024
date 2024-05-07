package objecttypecasting;

public class Example {


    public static void main(String[] args) {


        Base2 b = new Derived4();

        Object o = (Base2) b;

     //   Derived3 d = (Derived3) b; // run time exception

       // Object o1 = (Base1)b; // b is of type Base 2, converting it to Base1, Base 1 and Base 2 has not relation, compile time error

       // Base1 b1 = (Derived3)b; assigning Dervid3 to Base1 which have no relation with each other, Base1 should be same or parent of Derived 3

        Base2 b2 = (Derived4)b; // here Base2 is parent of Drived4, so assignment is valid, b actual object is Base2 which is parent of Dervid4
        // so conversion is valid, all compiler and jvm rules are passing

       // Base2 b3 = (Derived3)b; // here b reference of Base 2 and Drived 3 is child of base 2 so rule 1 passed
        // b3 is of Base 2 which is again parent of Derived 3, so rule 2 passed
        // but jbm rule, b real time object should be same as derived 3 or its parent is not passed
        // run time error


    }



}


class Base1{}

class Base2{}

class Derived1 extends Base1{}

class Derived2 extends Base1{}

class Derived3 extends Base2{}

class Derived4 extends Base2{}






