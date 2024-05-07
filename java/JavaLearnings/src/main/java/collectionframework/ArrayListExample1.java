package collectionframework;

import java.util.ArrayList;

public class ArrayListExample1 {

    public static void main(String[] args) {



        ArrayList<Student> list = new ArrayList<>();

        Student s = new Student(10, "devendra");

        list.add(s);

        Student s1 = new Student(10, "devendra");

        Student s3 = s;

        System.out.println(list.indexOf(s1)); // here s1.equals(s) is used, now equals is not overiding in student
        // so equals of object is used, which means compare reference, since reference are different so -1
        System.out.println(list.indexOf(s3)); // here reference are same so 0




    }

}

class Student{

    int rollNo;
    String name;

    Student(int rollNo, String name) {

        this.rollNo = rollNo;
        this.name = name;
    }

}
