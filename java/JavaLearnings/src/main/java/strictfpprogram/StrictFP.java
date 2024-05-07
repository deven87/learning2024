package strictfpprogram;

/*

can be used with a class or a method, but not with variable

floating points out put may be different in case of different machines, so to make it same everywhere
we can use strictfp

a class as strictfp means any variable in the class will follow strict fp rules IEEE754

a method as strictfp means any variable inside that method will foloow strict fp rules IEEE754

strct fp always applicable for concrets methods only

so with abstract as method, strictfp along with abstract with method is not allowed

but strictfp with abstract is allowed for classes

 */

public class StrictFP {

    // this method is strict fp so all floating calculations with follow IEEE754 standard
    public strictfp static void main(String[] args) {


        // here main is strict fp so will follow the IEEE754 rules
        System.out.println(10.0/3);

    }
}


strictfp abstract class A {

    static strictfp public void main(String[] args) {


        // here class is strict fp so concrete method will follow the IEEE754 rules
        System.out.println(10.0/3);

    }

    // abstract method so strictfp is not applicable here
    abstract void m1();

  //  abstract strictfp void m1(); not allowed as strictfp is applibale only for concrete method, while abstract means method will not be concrete

    // concrete method, so strictfp is applicable here
    void m2() {
        System.out.println(10.0/3);
    }

}



