package operators.relational;


// < > <= >=

// applicable for primitive types except boolean
// not applicable for obejct types

//

public class RelationalOperators {

    public static void main(String[] args) {

        System.out.println(10>30);   // false
        System.out.println(10>'a');  // false
        System.out.println(100>=100);  // true
        System.out.println(100>100);  // false

        System.out.println(10>10.0); // false

        System.out.println(10==10.0); //true

      //  System.out.println(false>true); // boolean not allowed for relational operators

       // System.out.println(10>20>30);  // not allowed as 10<20 is boolean value

    }
}
