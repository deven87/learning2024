package operators.instanceOfOperator;

public class InstanceOf {

    public static void main(String[] args) {


        Student s = new Student();
        Teacher t = new Teacher();

        Monitor m = new Monitor();

        System.out.println(s instanceof Student); // will be true as its of Student type

     //   System.out.println(t instanceof Student); // can not use this as instance of should have class either same or child

        // compile time error in case of using instanceOf with classes having no relation

        System.out.println(m instanceof Student); // child is always of parent type

        System.out.println(m instanceof Monitor);  // will be true as its of mnonitor type

        Object o = new String();

        System.out.println(o instanceof Object); // true

        System.out.println(o instanceof String); // true runtime object is string only

        Object o1 = new Object();
        System.out.println(o1 instanceof String); // false

    }


}


class Student {

    String studentName;


}

class Monitor extends Student {


}

class Teacher {


    String teacherName;
}