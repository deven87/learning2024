package interfaces;

public interface Example1 {

    void m1();
}


 interface Example2 extends Example1 {

    // this method overridding Example1 m1
    void m1();
}


abstract class A01 implements Example1 {


    @Override
    public void m1() {

    }
}

abstract class A02 implements Example1 {


}


abstract class A03 implements Example1 {

    public abstract void m1(int i) ;

}


abstract class A04 implements Example1 {

    // abstract void m1() ; not allowed, can not assign weaker priviledge
    public abstract void m1(); // this one is valid

}

class A05 extends A04 {

    @Override
    public void m1() {

    }
}

