package accessmodifiers.protectedmembers;

/*

protected members can be accessed via parent or child reference with in same package

outside the package, they can not be accessed via parent reference, only via child reference


 */
public class ProtectedClass {

    protected void m1(){
        System.out.println("parent class protected methods");
    }

    private void m2() {
        System.out.println("parent class private method");
    }

    public void m3() {
        System.out.println("parent class public method");
    }

     void m4() {
        System.out.println("parent class default method");
    }


}

class ProtectedClassExtent1 extends ProtectedClass {

    public static void main(String[] args) {

        ProtectedClass pc = new ProtectedClass();
        ProtectedClassExtent1 pc1 = new ProtectedClassExtent1();

        // public defailt and protected members are accessible outside class within same package by parent as well as child refernece
        pc.m1();
        pc.m3();
        pc.m4();
     //   pc.m2(); private member can not be accessed outside class

        pc1.m1();
       // pc1.m2(); private member can not be accessed outside class
        pc.m3();
        pc.m4();


    }


}