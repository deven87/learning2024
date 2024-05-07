package wrapperclass;

/*

auto boxing
to convert primitive into object so that operations on primitive can be performance which can be done on object only

auto unboxing
to covert object to primitive

to provide several utilities methods for primitives


wrapper classes
byte    Byte
short   Short
char    Character
int     Integer
float   Float
double  Double
boolean  Boolean

all these wrapper classes are final and inherit Number class


       // all wrapper classes can take string values except for character

        // float can take double value as well

        in all wrapper classes equals method is overridden for content compare


     character wrapper class has only 1 constructor to pass char value only

     boolean can have true/false/ string true case insensitive, any other string will be false

  valueOf method is used to create wrapper object from primitive


  wrapper methods are

  valueOf() to convert primitive into particular wrapper object each wrapper class has valueOf method

  xxxValue() to convert object into primitive

  each wrapper class has
  intValue, byteValue, shortValue, longValue, doubleValue , floatValue

  parseXXX() to get primitive from string


each wrapper class has parseXXX() method where xxx is type to convert any string into primitive type

each wrapper class has valueOf() method to convert primitive to object

each wrapper class has method xxxValue() to convert object to primitive

each wrapper class contains toString() method to convert primitive to string


 */

public class WrapperClass {

    public static void main(String[] args) {


        // parseInt is method available in wrapper class to convert string to primitive

        int x = Integer.parseInt("10");


        System.out.println(x);

        // here primitive class method to String is coverting int primitive to string
        String x1111 = Integer.toString(10);



        int x11 = Integer.MAX_VALUE;

        System.out.println(x11);


        Integer i = new Integer(19); // here 19 int primitive is converted into object Integer

        Integer i1 = new Integer("10"); // string can be passed but must be able to convert into integer

        Double d = new Double(10);

        Double d1 = new Double("10.5");

        Float f = new Float(10.4); // only case where double value is acceptable

        // Integer i10 = new Integer(10L); // not allowed

        System.out.println(d);

        Character ch = new Character('a');
      //  Character ch1 = new Character("a"); // not allowed

        Boolean b = new Boolean(true);

        Boolean b1 = new Boolean("true"); // allowed


        Boolean b11 = new Boolean("yes"); // any value apart from true or "true" is false

        System.out.println(b11);


        Boolean b11111 = new Boolean("True"); // true // any other value is false


        Integer i11 = Integer.valueOf(10);

        Integer i12 = Integer.valueOf("10");




        int i13 = i11.intValue();


        Byte b111 = Byte.valueOf("10");

        Long l = b111.longValue();

        boolean b100 = Boolean.parseBoolean("true");





    }
}
