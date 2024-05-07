package staticconcept;
/*

static can be used for a variable, method (not for local variable)
for static variable only a single copy of the variable will be created, static is assocaited with class and not with object

static can also be used for inner classes, not for top level class

just one copy will be shared by each and every object

static can also be used for blocks, static blocks are executed before main method and at the time of class loading

static methods are inherited, same way as normal methods

static method can be overloaded, same way as normal methods

static method can not be overirriden, the concept is method hiding for them

 */

public class StaticConcept {

    static int x;
    int y;

    // main is a static method, means it will be called by JVM without needing of its class object
    public static void main(String[] args) {

        StaticConcept sc1 = new StaticConcept();

        sc1.x = 100;
        sc1.y = 200;
        StaticConcept sc2 = new StaticConcept();

        // x is single for all object so it will be 100, y is instance variable and different for each object so default value 0 will be printed

        System.out.println(sc2.x + " : " + sc2.y);


    }
}

class Child extends StaticConcept {

  //  @Override // can not use override as method is static, static method can not be overridden, they are hidded
    public static void main(String[] args) {

    }


}




