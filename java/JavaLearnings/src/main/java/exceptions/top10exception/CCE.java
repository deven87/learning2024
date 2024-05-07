package exceptions.top10exception;

/*

ClassCastException is child of runtimeexception which is



 */

public class CCE {

    public static void main(String[] args) {

        Object o = new Object();


     //   String s1 = (String)o; // since o is run time Object which is not same


        Object s = new String("asd");

        StringBuffer s1 = (StringBuffer)s; // s run time object should be same as stringbuffer or should be child of stringbuffer

        // so it will throw CCE

    }

}
