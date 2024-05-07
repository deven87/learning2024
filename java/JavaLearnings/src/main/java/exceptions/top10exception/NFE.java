package exceptions.top10exception;

/*

numberformatexception is child of runtime exception hence unchecked


 */

public class NFE {

    public static void main(String[] args) {


        Integer i = Integer.valueOf(10); // primitive to wrapper object

        Integer i1 = Integer.valueOf("10"); // primitive to wrapper object

        int i2 = i1.intValue(); // wrapper object to primitive

        int i3 = Integer.parseInt("10"); // string to any primitive

        // all above are valid


        // here string ten is not parsable into number hence numberformatexception

        int i4 = Integer.parseInt("ten"); // string to any primitive



    }
}
