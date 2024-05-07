package interfaces;

// m1 and m2 are available oin nboth left and right, but only 1 time implementation is required in implementing class

public class InterfacesExamples3 implements Left, Right{

    // since method name and return types are same it is allowed
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }


    // m2 is having different return type in both interfaces, so we have to implement both in class,
    // but since both will have same name which will not be allsed
    // so it is not possible
    /*
    @Override
    public void m2() {
        return null;
    }

     */
}


interface Left {

     void m1();

    // String m2();

}

interface Right {

     void m1();
     void m2();

}


interface Left1 {
    void m1();
}
interface Right1 {
    void m1(int i);
}

abstract class ImplementingClass1 implements Left1, Right1 {

    // can not implement it here as interface also contains int m1

}

class ImplementingClass implements Left1, Right1 {



    @Override
    public void m1(int i) {

    }

    @Override
    public void m1() {

    }
}

