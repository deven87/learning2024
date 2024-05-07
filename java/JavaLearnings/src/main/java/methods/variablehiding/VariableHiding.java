package methods.variablehiding;

public class VariableHiding extends Parent{

    /*


    variables are not override whether static or not

    overriding concept is only for methods and not for variables

    variable resolution is always done by compiler during compile time based on reference type

    type of variable does not matter, child class will hide the parent class variable, overriding is not applicable

    in case of instance variables, data hiding is there and not overriding

    in case of parent child having static variable

    in case parent only have static but child have not static

    in case parent has instance but child has static




     */


    int x = 200;
    static int y = 2000;

    static int z = 20000;

     Long q = 200000L;

    public static void main(String[] args) {
        VariableHiding o1 = new VariableHiding();

        Parent p1 = new Parent();

        Parent p = new VariableHiding();

        System.out.println(o1.x); // child variable

        System.out.println(p.x); // parent variable

        // this is data hiding and not overriding
        System.out.println(p1.x); // parent variable

        System.out.println(p.y); // parent only

        System.out.println(p.z); // parent only

        System.out.println(p.q); // parent  only

    }
}


class Parent {

    int x = 100;

    static int y = 1000;

    int z = 10000;

    static int q = 100000;

}
