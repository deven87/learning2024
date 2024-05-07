package flowcontrol.selections.switc;

// switch have multiple cases, all cases from true case will keep on executing unless break is used

// default will be used in case no case is matched

// default can be written anywhere at top or bottom

// only byte, short, int, char are allowed in switch

// boolean is not allowed as it will have only 2 cases true or false
// long is not allowed as range is too much
// float doubles are not allowed as there will be infinite cases between 2 numbers
// enums are allowed from 1.5
// Byte Short Integer Character are allowed
// strings are allowed from 1.7
// default can come at any place but will be executed only when no other case is matched, it also should have break at end to exit
// switch with only case, switch with only default, switch with no value inside is allowed
// any statement inside switch must be into case or in default
// duplicate case not allowed
// case must have only constants
// default case can come only once, can come anywhere, if not have break, it will also have fall free
// default will execute only when no other case is matched

public class SwitchExample {

    public static void main(String[] args) {

        Days d = Days.FRIDAY;

        switch (d) {

            case MONDAY:
                System.out.println("Monday");

                break;

            default:

                System.out.println("No Sunday No Monday");
                break;

            case SUNDAY:
                System.out.println("Sunday");
                break;

        }


        String s = new String("SUNDAY");

        switch (s) {

            case "MONDAY":
                System.out.println("Monday");

                break;

            default:

                System.out.println("No Sunday No Monday");
                break;

            case "SUNDAY":
                System.out.println("Sunday");
                break;
        }

        switch(s) {

            default:
                System.out.println("hello");
                break;

        }

        switch (s) {

        }

        switch (s) {

           // System.out.println();  // not allowed outside case or default

        }

       // switch (s) // switch must have {} unlike if, loop


        int x=20;
        final int y = 30;

        switch (++x) {

            case 1:
            case 2:
         //   case 1: // duplicate case not allowed
         //   case x: // only constant allowed in case
            case y:

            case 10+20+30:

        }

        byte b1 = 20;

        switch (b1) {
            case 1:
           // case 1000: // not allowed as value is beyond byte range

        }

        switch (y) {

        }

        switch (10) {

            case 'a':

        }

        char ch = 'a';

        switch (ch) {


            case 'b':
                System.out.println();
                break;
            case 97:
                System.out.println("97");
                break;

        }

        String s11 = "ten";

        switch (s11) {


            case "asd": dsk :{}

            case "10":

        }
    }
}

enum Days{

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        }
