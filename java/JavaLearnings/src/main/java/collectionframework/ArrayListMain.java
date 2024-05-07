package collectionframework;

/*

arraylist is basically object of array in java with a default capactiy of 10 or of any capactiy if given


underlying data structure is resizable array or growable array

duplicates are allowed, insertion order is preserved
hetrogenous objects are allowed

default initial capacity is 10

next will be (cc*3/2)+1


all collection class has toString overriden to provide

[first element, second element, third element ....]

all collections implement  serializable and cloneable

ArrayList and vector only are the two which implements RandomAccess to access any element,


Arraylist is the best choice when frequenet operation is retreiving data, as it implements random access interface


Arraylist is worst choice in case an element need to be added in between

like at first place an element is to be added, so second place element wil shift to 3rd, 3rd one will shift to 4th

so arraylist is worst choice when there are multiple insertion/deletion operation

linkedlist is best choice when there are multiple insertion/deletion

linkedlist is worst choice when there is retrieval operation


 */

import java.io.Serializable;
import java.util.*;

public class ArrayListMain {

    public static void main(String[] args) {


        List list = new LinkedList();
        list.add(1);

        ArrayList li = new ArrayList();

        ArrayList li1 = new ArrayList(20);

        ArrayList li2 = new ArrayList(list);


        li2.add(10);

        System.out.printf("li2 capacity" + li2.size());

        System.out.printf("li capacity" + li.size());

        System.out.println(li2);

        System.out.println(li2.get(1));

        System.out.println( li2 instanceof Serializable);
        System.out.println( li2 instanceof Cloneable);

        System.out.println( li2 instanceof RandomAccess);



        ArrayList al = new ArrayList(1000);

        for (int i = 0 ; i<1000; i++) {

            al.add(i, i);
        }

        Iterator itr = al.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());
        }

        // array list has 1000 elements, retreiving any of the element is very quick and will take same time

        // e.g.

        al.get(0);
        al.get(999);

        // both above operation takes same time

        // so arraylist is best when multiple retrival operation are there


        al.remove(2);

        al.add(3, 10);

        // here above two oepration cause a lot of shifting
        // so arraylist is worst when multiple operation inloved for insertion or deletion


    }
}
