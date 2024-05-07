package exceptions;

/* from 1.7 version, you can use a single catch having multiple exceptions inside


if handling code inside catch is same, we can use multicatch to avoid writing duplicate code again and again in 
multiple catch blocks

used exception in a single catch must not be related with each other, as if they are related only 1 is enough



 */

import java.io.IOException;

public class MultiCatchBlock {

    public static void main(String[] args) {


        try {

           // System.out.println(10/0);

           String s = null;

            System.out.println(s.contains("a"));

        }
        
        catch (ArithmeticException | NullPointerException e1) {

            System.out.println("handled");

        }
        catch(Exception e1) {

        }


        /*

        catch (ArithmeticException | RuntimeException e1) {

        }

        catch (RuntimeException | Exception e1) {

        }

         */

    }
}
