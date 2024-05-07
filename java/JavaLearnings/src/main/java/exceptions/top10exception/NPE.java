package exceptions.top10exception;

/*

exception occurs when trying to access null value in any way

performing any operation on null value gives null pointer exception


 */

public class NPE {

    public static void main(String[] args) {

        String s = null; // fine to assign null
        System.out.println(s); // will print null

      //  System.out.println(s.length()); //operating on null value // will give exception


    }
}
