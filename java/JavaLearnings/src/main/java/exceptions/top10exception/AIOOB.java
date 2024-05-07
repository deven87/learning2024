package exceptions.top10exception;

public class AIOOB {

    public static void main(String[] args) {



        int[] a = new int[10];

        String[] s = new String[10];

        System.out.println(s[0]);


        System.out.println(a[0]); // by default all int array values are initialized to 0

       // System.out.println(a[10]); // no element at index 10 as it is 11th position but array size ia 10


        a[10] = 11; // trying to assign value to element of array which is out of its index

        // so exception array index out of bound occurs

        // AIOOB is unchecked exception as child of runtimeexception class

        /*


        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
	at exceptions.top10exception.AIOOB.main(AIOOB.java:12)

         */





    }
}
