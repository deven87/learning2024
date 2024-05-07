package methods.overridding;



public class OverrdingMain extends A{

/*


 private method can not be overriden

 overriding method should have same or more access priviledge

 before 1.5 only same return type was allowed in onverriden

 but after 1.5 covariant also allowed

 child class can override method using same or child return type of parent method

 final methods can not be overrid




 it can be abstract, native, strictfp, synchrnied

 parent can be any of these and child can be non of these

no restrictions on using these modifeirs

parent can have it or child can have it


child must have same or increased scope access priviledge

if parent is throwing exception,

it is not necessary that child will throw exception, it can not throw at all

if child is throwing checked exception, it must be same or covariant of its parent

child can thrown any unchecked exception regardless of parent is throwing it or not


parent method must be non final but child can override it as final, it means further overriding is not possible

parent having sync, child not having synch is fine

parent having not sync, child  having synch is fine


parent having strictfp and child not having strictfp is valid overridding

parent having non strictfp and child  having strictfp is valid overridding

parent having native method and child  having non native method is valid overridding

parent having non native method and child  having  native method is valid overridding







 */

    public static void main(String[] args) {

        A a = new A();

        OverrdingMain m = new OverrdingMain();

        A a1 = new OverrdingMain();

        a.m1();
        a.m2();
       //  a.m3(); // m3 is private so can not be accessed from outside the class, and since m3 in current class is not overrident

        m.m1();
        m.m2();
        m.m3();

        a1.m1(); // overriden so decided at run time, to call childs overriden method
        a1.m2(); // overriden so decided at run time, to call childs overriden method
        a1.m4();
        a1.m5();





    }


    public void m3() {

        System.out.println("Child m3 method");
    }

   public void  m1() {

       System.out.println("child m1 method");


   }

    public void m2() {

        System.out.println("child m2 method");


    }

    public String m4() {

        System.out.println("Child m4 method");

        return null;

    }


    @Override
    public String m5() {

        System.out.println("Child m5 method");

        return null;

    }

}


class A {

    public void m1() {

        System.out.println("Parent m1 method");

    }

    protected void m2() {

        System.out.println("Parent m2 method");


    }

    private void m3() {

        System.out.println("Parent m3 method");
    }

    public String m4() {

        System.out.println("Parent m4 method");

        return null;

    }


    public Object m5() {

        System.out.println("Parent m5 method");

        return null;

    }


}


