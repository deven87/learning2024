package flowcontrol.iternation.forloop;


// for loop has initializer, condition, increment or decrement
// it is allowed to not have anything but only ;

// at first initialization is done and then condition is checked, if condition is true
// body is executed and after that increment/decrement is done and then again condition is checked and body is exccuted

// and so on

// we can take any valid java statement in place of initialization section

// increament decerment also can be any valid java statement

// initialization and increment/decrement can be any valid java statement but the condition one should be boolean value only




public class ForLoop {

    public static void main(String[] args) {


        /*
        // valid infintie loop
        for (;;){
            System.out.println("hello");
        }

         */


    //    for (int i = 0, j=1;;) { } //valid



      //  for (int i = 0, int j =0;;) {} not allowed as 2 statements can not be separated by ,


        int i = 0;

        for (System.out.println("hellohi");i==0;i++) System.out.println("my for loop");
        boolean b = false;
        boolean t = true;

        for (i=3;b && t;) {

        }



    //    for(;;); // valid

     //   for (;;) System.out.println("he"); //valid

        /*

        // valid
        for (;;) {
            System.out.println("Asd");
        }

         */


      //  for (;false;) System.out.println("asd"); // invalid as body is not reachable at all due to condition being false




    }
}
