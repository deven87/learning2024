package collectionframework;

/*

Arraylist:

null can be inserted
insertion order is preserved
hetro genus as well as homegenous using support of generics
default initial capacity is 10
when element goes out of index, capacity is increased by


once array list reaches it max capacity, a new array list is created with capacity as

(current capactiy * 3/2) + 1

old reference now points to this new reference, all elements are copied and
old object is eligible for garbage collection


 remove method will always remove first occurance

 remove(index) will always work on index, only when we pass object it will remove the object


 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {



    public static void main(String[] args) {


        ArrayList al = new ArrayList(); // default initial capacity is 10

        List l = new ArrayList();  // default initial capacity is 10

        List l1 = new ArrayList(30);  // initial capacity 30



        ArrayList al1 = new ArrayList(l1); // can pass colelction also in arraylist

        al1.add(1);
        al1.add("hello");
        al1.add(1);
        al1.add(null);

        System.out.println(al1);

        // passing object will remove it and return true if removed,
        // passing primitive will be considered as index
        al1.remove(null);
        System.out.println(al1);

        al1.add(1,"hi"); // here at all elements from index 1 will move 1 index further
        // and at index 1 hi will be added

        System.out.println(al1);


        ArrayList<Integer> al3 = new ArrayList<Integer>();  // in 1.5

        ArrayList<Integer> al2 = new ArrayList<>(); // from 1.7, as you have specified type in left,
        // it is not mandatory to specify type in right

        // or you can removed it completely from right side

        ArrayList<Integer> al4 = new ArrayList();  // generic is a compile time concept so you can remove
        // diamond operator from right side completely, its fine

        // al2.add("asd"); // only given type will be allowed so its type safe

        ArrayList al5 = new ArrayList<>();

        ArrayList al6 = new ArrayList<Integer>(); // tbis integer has no meaning here

        al6.add("Asd");

        System.out.println(al6);



        ArrayList<A> al7 = new ArrayList<>();

        al7.add(new D()); // since D is child of A, it can be added






    }


}

interface A{}

interface B extends A{}


class D implements A, B {

}