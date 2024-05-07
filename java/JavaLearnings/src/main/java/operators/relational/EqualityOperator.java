package operators.relational;


// == !=
// applicable everywhere for primitive for boolean as well as for objects

// equals() is defined in Object class and is overloaded in many inheriting classes
// equals always means comparing reference

// == always means compare reference/address
// == returns true if both the reference variables points to same object

// == can be used only when operands are having same type or child parent type

// equals method inside object class is for reference compare only which is overridden by String class to compare value
// but StringBuilder class does not override it, so for String builder, equals method is comparing reference only

// hashcode method in String will return same int hascode if content is same

// equals always give false in case comparison is done on different types
public class EqualityOperator {

    public static void main(String[] args) {

        System.out.println(false==false); //true

        System.out.println('a'==97.0); // true // as a will be converted to 97 and then 97 will converted to 97.0
        Student1 s11 = new Student1();
        Student1 s22 = new Student1();
        Student1 s3 = s11;   // s3 is new reference which points to same object as s11 so both points to same object

        System.out.println(s11==s22);  // false
        System.out.println(s11!=s22); // true
        System.out.println(s3==s22);  // false
        System.out.println(s3==s11);  // true  // returns true as s3 and s11 points to same object


        String s111 = "hello";
        String s222 = "hi";



        System.out.println(s111.equals(s222)); // false compare value

        String s333 = "hello";

        System.out.println(s111.equals(s333)); // true compare value

        System.out.println(s111 == s333); // true due to SCP, as we are not creating new object here
        // s333 will have new object if SCP does not have any object with same value as it is

      //  System.out.println(s111 == s22); // not allowed as eith both operand should be same type or child parent


        String z1 = new String("hello");
        String z2 = new String("hello");

        System.out.println(z1==z2);  // both are different object as we used new operator, so false
        System.out.println(z1.equals(z2)); // comparing value so it will be true


        String z3 = z1; // not creating new object, it will point to z1 object

        System.out.println(z3==z1);// true

        System.out.println(z3.equals(z3));// true


        StringBuilder z11 = new StringBuilder("hello");
        StringBuilder z22 = new StringBuilder("hello");

        System.out.println(z11==z22);  // both are different object as we used new operator, so false
        System.out.println(z11.equals(z22)); // Stringbuilder does not overrides equals method of Object, hence it does compare
        // reference only // false


        String x1 = new String("hello");
        String x2 = new String("hello");

        System.out.println(x1==x2); // false // reference compare
        System.out.println(x1.equals(x2)); // true // content compare

        System.out.println(x1.hashCode());
        System.out.println(x2.hashCode());
        System.out.println(x1.hashCode()==x2.hashCode()); // since content is same it will be true


        StringBuilder x11 = new StringBuilder("hello");
        StringBuilder x22 = new StringBuilder("hello");

        System.out.println(x11==x22); // false // reference compare
        System.out.println(x11.equals(x22)); // false // reference compare only

        System.out.println(x11.hashCode());
        System.out.println(x22.hashCode());
        System.out.println(x11.hashCode()==x22.hashCode()); // false, hashcode is also not overridded in SB and comes
        // directly from object, which compare reference, so it will be false as reference is not same

        System.out.println(x11.equals(x1)); // equals here is for address comparison but since both x11 and x1 are not same type, it will be false
        System.out.println(x1.equals(x11)); // equals here is for content compare which is same, but ince both x11 and x1 are not same type, it will be false


  //      System.out.println(x1 == x11)); // == not allowed for different type of operand
  //      System.out.println(x11 == x1)); // == not allowed for different type of operand

    }
}

class Student1 {

}
