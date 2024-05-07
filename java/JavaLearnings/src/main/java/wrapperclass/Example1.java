package wrapperclass;

public class Example1 {

    public void m1(Long l) {

        System.out.println("long");
    }

    public void m1(Object l) {

        System.out.println("obj");
    }
    public static void main(String[] args) {

        Example1 ex = new Example1();

        int x =20;

      //  ex.m1(x); // int converted to integer as object then Integer can not be converted into Long as no relation
        ex.m1(x); // here int converted to Integer and Integer converted to Object as parent so allowed


        // autoboxing and then widening is allowed

        // widening and then autoboxing is not allowed

       // Long l = 10; // not allowed

        Long l = 10L;

        Double d = 10.20;
       //  Double d1 = 10;  // not allowed

        Object o = 20;

        Byte b100 = 10;
        Byte b101 = 20;

        Integer i100 =  b100 + b101; // objects are converted into primitive
        // automatically for performing arithmetic operation

     //    String s = (String) (b100 + b101); // not allowed as int can not be converted to string


        String s = Integer.toString (b100 + b101); // allowed




    }
}


