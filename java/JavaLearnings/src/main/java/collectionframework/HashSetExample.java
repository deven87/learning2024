package collectionframework;

/*
implementing set interface

elements are not stored in preserved order, thy are stored based on hashcode

underlying data structure is hashtable

duplicates are not allowed

insertion order is not preserved


FillRatio/Load Factor:

0.75 that means if hashset is filled 75%, a new hashset object is created with bigger capacity

in arraylist new object is created when old one is completelty full and a new insertion comes.

in HashSet, new one will be created when its 75% full

 */

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet set1 = new HashSet();

        // initial capacity is 16

        HashSet set2 = new HashSet(100);
        // with 100 capacity and defailt load factor 75%


        HashSet set3 = new HashSet(100, 0.99F);
        // create hashset object with capacity as 100 and load factor as 99%
        // means new object will be created when old one is 99% filled

        ArrayList al = new ArrayList();
        al.add(10);

        HashSet set4 = new HashSet(al);

        set4.add(20);


        System.out.println(set4.add(20)); // duplicates not allowed, so return false

        set4.add(30);

        set4.add("hello");

        set4.add(true);

        set4.add(null);

        set4.add(20); // now 20 is already there in set, so duplicates are not allowed
        // so it will return false and will not add element again


        // since insertion order is not preserved, output will not give elements in order

        System.out.println(set4);


    }




}
