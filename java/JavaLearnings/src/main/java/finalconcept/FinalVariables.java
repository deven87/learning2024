package finalconcept;
/*

final local variable must be initialized at the time on declaring

final instance variables must be initialized at time of declaring or inside  constructor or inside instance blocks

final instance variable, JVM does not provide default values, so we have to initialize

final static variable can be initialized at time of declaration or inside static block,

final instance or static variable must be initialized even if not using it

local final variable can be not initizalied if not used.

local variable can be final only and can not have any other modifier

 */

public class FinalVariables {


    final int x;

    final static int y;

    FinalVariables(int z) {
        System.out.println("const");
           x =20; // can be initialized inside constructor block
        System.out.println(x);

    }

    static {

        y = 40;
    }

    FinalVariables() {
        System.out.println("const");
        x =20; // can be initialized inside constructor block

    }

    {
     //   x =30; // can be initialized inside instance block
        System.out.println("instance block");

    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {


        FinalVariables fv2 = new FinalVariables(10);
        System.out.println("main");
        final int x;
        // valid as we need to initialize local variable only when we are using, even when its final

        int y;
        x = 20;
       // x =30; // variable is final so reinitialize is not allowed

        FinalVariables fv = new FinalVariables();
        fv.m1(10,20);

    }

    // here formal parameter can be final as they are just local variables
    public void m1(final int x, int y) {

    //    x = 200; // not allowed as x is final and its value is passed from actual argument
        y=50;
        System.out.println(x+y);
    }
}
