package methods.methodhiding;

import java.io.IOException;

public class StaticOverridding extends StaticMethodClass{

    /*

    method hiding has all rules same as oveririding, but it is static polymorphism

    final method can not be hidden

    for method hiding both methods of parent and child should be static

    child having same static method as parent is method hiding and not overriding

    non static to static or static to not static overriding is not allowed

    in method hiding resolution is taken care by compiler, all other rules are same as overriding

    like can not assign weaker access modifier

    child can not throw checked exception if parent is not throwing it

    it is allowed

    static methods are not overriden and hence calling method from parent reference and child object will call parent method

    parent having static method and child overridding it without static is not allowed

    parent having non-static method and child overridding it with static is not allowed

     */

    public static void m1() {

        System.out.println("child m1");

    }

    public  static void m2() throws IOException {

        System.out.println("child m2");

    }

    private  static void m3() throws IOException{

        System.out.println("child m3");

    }

    public static void main(String[] args) {

        StaticOverridding so = new StaticOverridding();
        so.m1();

        StaticMethodClass so1 = new StaticOverridding();

        so1.m1(); // here parent m1 is called as its not overridding, static methods can not override

    }

}


 class StaticMethodClass {

    public static void m1() {

        System.out.println("parent m1");

    }

     public static void m2() throws IOException{

         System.out.println("parent m2");

     }

     private  static void m3() throws IOException{

         System.out.println("parent m2");

     }
}


