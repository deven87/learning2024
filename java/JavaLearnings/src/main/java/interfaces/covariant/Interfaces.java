package interfaces.covariant;

public class Interfaces {
}

interface A {

    public Object m1() ;
}

class AImplements implements A {


    // Here String is a child of Object, so instead of Object, we can take its child
    // return types can be covariant, but there must be a relation, we should inly take child
    @Override
    public String m1() {
        return new String();
    }
}


interface B {

    String m1();

}

interface C {

    Object m1();

}

class BCImplements implements B, C {

    // both String m1() and Object m1() method are overridden by just 1 method below having return type as String
    // because we can take covariant type also as return instead of same
    @Override
    public String m1() {
        return null;
    }
}
