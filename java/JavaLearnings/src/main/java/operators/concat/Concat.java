package operators.concat;


// only overloaded operator is +

// only overloaded for String and nothing else

// if both arguments are numbers, then + is addition
// if at least one argument is String, then it will concatenation operator.

public class Concat {

    public static void main(String[] args) {

        String s1 = "a";
        String s2 = "b";

        System.out.println(s1+s2);

        int i = 10;
        int j = 20;

        System.out.println(i+j);

        Student s11 = new Student();
        Student s22 = new Student();

       // System.out.println(s11+s22); // not allowed, only overloaded for String

        //ab
        //30

        System.out.println(i+s1); // 10a
        System.out.println(s1+i); // a10

        System.out.println(i+j+s1+s2); // 30ab

        System.out.println(i+(j+s1)+s2); // 1020ab

        System.out.println(i+s1+j+s2); //10a20b

        System.out.println(s1+i+j+s2); //a1020b

    }
}

class Student {}
