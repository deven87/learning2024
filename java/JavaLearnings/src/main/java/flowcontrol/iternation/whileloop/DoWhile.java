package flowcontrol.iternation.whileloop;

// do while will execute once even when condition is not matching as first do block is executed and then condition is checked


// do can not come without while

// should end with ;

// curly braces are optional, without curly only one statement is allowed and that can not be declaration


public class DoWhile {

    public static void main(String[] args) {

        int x = 10;

        do{

            System.out.println("do block");
            x++;
        }while(x==10);


        /*
        do System.out.println("do block");
        while(true);

         */

        /*
        do {} while(true);  //valid

         */

     //    do while(true); // not allowed as there must be a stement or curly braces between do and while


        // here after do, ; is a valid statement so it is allowed

        /*
        do; while(true); // valid

         */

        /*

// legal
        do while(true) System.out.println("hello");
        while(false);

         */


        int ax = 10;
        int bx = 20;

        do {
            System.out.println("hello");
        } while(ax<bx);
        System.out.println("hello");



        final int ax1 = 10;
        int bx1 = 20;

        do {
            System.out.println("hello");
        } while(ax<bx);
        System.out.println("hello");

        final int ax11 = 10;
        final int bx11 = 20;

        /*

// not allowed as last statement will become unreachable
        do {
            System.out.println("hello");
        } while(ax11<bx11);
        System.out.println("hello");


         */


    }
}
