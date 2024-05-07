package exceptions;

public class PrintException {


    public static void main(String[] args) {


        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {

           e.printStackTrace(); // print exception name, description and stacktrace

          System.out.println(e.toString()); //print exception name and description


            System.out.println(e.getMessage()); //print exception description only

            System.out.println(e); // by default to string is called //

        }
    }
}
