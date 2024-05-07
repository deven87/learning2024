package accessmodifiers;


// in java all these below are access modifiers only and not specifiers

// private, protected, default, public access modifiers
// other modifiers are static, final, strictfp, synchronized, abstract

// private memerbs are accessible only from inside the class, like it can be accessed by same class methods
// protected members are accessible by anyone inside package, but only via inheritance and in subclass only outside package and that also by using current child class reference only
// default , members are accessible only inside package
// public are accessible from anywhere

public class Modifiers extends A1 implements A2{
    public static void main(String[] args) {

    }
}

// first implements and then extends not allowed
/*
class Modifeiers1 implements A2 extends A2 {

}

 */

class A1{

}

interface A2{}

