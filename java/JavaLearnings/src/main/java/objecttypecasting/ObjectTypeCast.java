package objecttypecasting;

public class ObjectTypeCast {


    /*


    A b = (C) d;

    we are converting d type into C type

    we are assigning the C type to A type reference

    d reference should be same type of C or must have any relation

    b is reference variable of type A, A can be class or interface

    d can be direct object or reference type

    compiler will check

    1. d reference type should be same as C or must have a relation with C

    2. C type should be same as A type or A;s child


   JVM will check:

   run time object of d is same as C or can be parent of C

   in object type casting, new object is not created, only another reference is created for existing object






     */


    public static void main(String[] args) {

        // creating Object type object and assign to string


        Object o4 = new StringBuffer("asd");

        StringBuffer sb4 = (StringBuffer)o4;

        // above is valid as o4 is of type object which is parent of StringBuffer
        // StringBuffer converted type is same as StringBuffer assigned type
        // o4 actual object is StringBuffer which is also same as converted type
        // hence valid typecasting


        Object o = new String("hello");

     //   StringBuffer sb = (StringBuffer) o;  // rule 1 and 2 are passed by compiler

        // but o is String at run time so run time exception for casting

      //  StringBuffer sb1 = (String) o; here right side is fine but left side is StringBuilder which is not parent of or same as left side which is string
        // so rule 2 of compiler is violated

        // but rule 3 by jvm is voilated here, so exception will come

        // because o is actuall a String type object so it can only be typecast to String or any of its child

        // StringBuffer and String are not related hence this fails


      //  StringBuffer sb1 =  (StringBuffer) s; // compile time check fails as there is no relation between StringBuffer and String
        // there must be some relation


        String string = new String("hello");

        Object o10 = (Object)string;

        System.out.println(o10==string); // will return trye as o10 is not a new object, its just another reference variable pointting to same string object


        Integer i = new Integer(10);

        Number n = i;

        Object o11 = n;

        System.out.println(i==n);  // true// only 1 object is created
        System.out.println(n==o11);// true// only 1 object is created

        Object o12 = new Object();









    }
}
