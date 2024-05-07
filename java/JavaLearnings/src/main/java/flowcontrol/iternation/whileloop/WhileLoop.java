package flowcontrol.iternation.whileloop;

// can have only boolean value inside
// will not execute even once if condition is false
public class WhileLoop {

    public static void main(String[] args) {

        int x = 10;

        while(x<=10) {

            System.out.println("while loop");
            x++;

        }

        /*
        while (x<=10)
            System.out.println(x);


         */

        /*
        while(x<=10)
            int z=20; // initialized not allowed as if not having curly braces


         */

     //   while(true); // infinite loop with no output

    //    while(true) System.out.println("hello"); infinite while loop with 1 statement so curly braces are not required


        /*

        // not allowed by compiler as sout is unreachable as loop is always false
        while(false)
            System.out.println("hello");


         */

        int a = 10, b =20;

        // always false but unreachable error is not there, as compiler does not know what value a and b will have at run time

        while(a>b) {
            System.out.println("hellohi");
        }

        final int a1 = 10, b1 = 20;

        /*

        // now there will be unreachable code error by compiler as values are constant and wont change
        while(a1>b1) {
            System.out.println("hellohi");
        }


         */


    }
}
