package collectionframework;

/*
implementing set interface

when duplicates are not allowed but inserttiopn order is preserved, use linkedhasset

underlying data structure is hashtable + linked list

duplicates are not allowed

insertion order is  preserved


FillRatio/Load Factor:

0.75 that means if hashset is filled 75%, a new hashset object is created with bigger capacity

in arraylist new object is created when old one is completelty full and a new insertion comes.

in HashSet, new one will be created when its 75% full

 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();

        LinkedHashSet lhs1 = new LinkedHashSet(100);

        LinkedHashSet lhs2 = new LinkedHashSet(100, 0.98F);

        LinkedHashSet lhs3 = new LinkedHashSet(lhs);

        HashSet lhs4 = new LinkedHashSet();

        Set lhs6 = new LinkedHashSet();

        lhs.add(10);

        System.out.println(lhs.add(10));

        System.out.println(lhs.add(20));

        lhs.add("ten");

        // insertion order is preserved
        // duplicates are not alloweds
        System.out.println(lhs);



    }




}
