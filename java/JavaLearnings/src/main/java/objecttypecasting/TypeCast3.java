package objecttypecasting;

public class TypeCast3 extends  Parent2{


    public void m1() {
        System.out.println("child m2 method");
    }

    public void m4() {
        System.out.println("child m4 method");
    }

    public static void main(String[] args) {

        TypeCast3 t = new TypeCast3();

        ((Parent2)t).m1(); // calling m1 of child using parent reference
      //  ((Parent2)t).m4(); // can not call child specific method using parent reference

        ((Parent2)t).m2(); // calling m2 of parent2 using parent reference as its not in child

        ((Parent2)t).m3(); // calling m3 of parent2 using parent reference as its there in child parent1

        ((Parent1)((Parent2)t)).m1();

        ((Parent1)((Parent2)t)).m3();

      //  ((Parent1)((Parent2)t)).m2(); // here the final reference is of Parent1 which does not contains method m2, so on
        // its reference we can not call m2






    }


}

class Parent1{

    public void m1() {
        System.out.println("parent1 m1 method");
    }

    public void m3() {
        System.out.println("parent1 m3 method");
    }


}

class Parent2 extends Parent1{

    public void m1() {
        System.out.println("parent2 m1 method");
    }

    public void m2() {
        System.out.println("parent2 m2 method");
    }


}

