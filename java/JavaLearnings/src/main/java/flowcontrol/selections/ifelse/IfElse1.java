package flowcontrol.selections.ifelse;


// if else always require boolean value
// anything can comes in between () in if which results into a boolean value
// 0 and 1 are not true false in java
// if only 1 statement no need to add {}, in that case the statement can be anything but not declaration as it can not be used outside





public class IfElse1 {

    public static void main(String[] args) {

        int x = 0;

        // not allowed as int
  /*      if(x) {

        }


   */

    // value
        if (x == 0) {

        }

        boolean b = false;

        // means if true, then execute
        if(b) {

        } else {
            // execute in case if is not executed

        }


        // make b as trye and then check
        if(b=true) {

        }

        int i,j;
        i = j = 20;
        if(b=(i==j)){

        }



        if(b)

            System.out.println(b);

        /*


        if(b)
            int x1 =10; // not allowed to declare if having only a single statement and not having {}


         */

        if(b); // allowed but it wont do anything

        
        if(b) {
            
        } else if (b==false) {
            
        } else if (b==true) {
            
        }

        if(b) {

        } else if (b==false) {

        } else if (b==true) {

        } else {

        }

    }
}
