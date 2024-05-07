package objecttypecasting;

public class TypeCast2 extends  Parent{


    public void m2() {
        System.out.println("child m2 method");
    }

    public static void main(String[] args) {

        TypeCast2 t = new TypeCast2();


        ((Parent)t).m1(); // child class can be converted to parent, though redundant
        // here m1 is of parent so using parent reference, we can call m1

       //  ((Parent)t).m2();

        // here m2 is not in parent, so using parent reference we can not call m2

    }


}

class Parent{

    public void m1() {
        System.out.println("parent m1 method");
    }


}

