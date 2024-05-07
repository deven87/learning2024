package accessmodifiers;

// abstract can not come with final, sync, private, strictfp, static as they all are about implementation
// but abstract says not to implement

// abstract can come with private or with default.



public abstract class AbstractModifier {


    public static void main(String[] args) {

        // abstract class object can not be created
        // AbstractModifier abs = new AbstractModifier() ;

    }

     public abstract  void m1 ();

    public void m2 () {

        System.out.println("normal method in abstract class");


    }
}

class ImplementAbstract extends AbstractModifier {

    // you have to implement all abstract methods in inheriting class or have to declare itself as abstract
    @Override
    public void m1() {

    }
}

abstract class Abstract2 extends AbstractModifier {

    // fine to not implement any abstraact method of AbstractModifier
}


