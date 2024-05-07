package collectionframework;

/*


our insertion order is not applicable, data will be stored in some sorted order, by default it will
store in natural sorting order
since this is sorted, so hetrogeneous elements are not allowed

data is stored according to some sorted order

it is implemented by treeset

e.g. store students according to roll numbers


since sortedset is a sorted one, we can get firtst and last elements directly

we can get greate than or less than or in between by passing a value

first()
last()
headset(object o) will give all object less than given object
tailset(Object o) will give all object more than or equal to given object
subset(Object o1, Object 02) greate than equal to 01 and less than  o2

comparator()
give sorting order, for numbers it will be ascending
for strings it will be alphanumeric order
sorted set are homogeneous

default natural sorting order

ascending for number
alphabetic order for string

null can be added but only once as duplicates are not allowed

object should be homogenous and comparable as well, means it should implement comparable interface

 */

import java.util.*;

public class SortedSetExample {

    public static void main(String[] args) {

        // sorted set

        SortedSet sortedSet = new TreeSet();

        // in normal set we can say that this is first element, this is second element

        // in sorted set they will be added in sorted order only


        sortedSet.add(10);

        sortedSet.add(5);

        sortedSet.add(15);

    //    System.out.println( sortedSet.add("ten")); // will give exception as sorted set can not have hetrogeneous elements


        sortedSet.add(4);

        sortedSet.add(20);

        // duplicate not allowed
        System.out.println(  sortedSet.add(20));


        // data will be stored any printed in sorted order as we used sorted sets
        System.out.println(sortedSet);


        System.out.println(sortedSet.first()); // first element // 4

        System.out.println(sortedSet.last()); // last element  // 20


        System.out.println(sortedSet.headSet(10)); // elements less than 10, fetch from set // 4,5

        System.out.println(sortedSet.tailSet(10)); // elements greater than equal to 10 // 10, 15, 20

        System.out.println(sortedSet.subSet(10,20)); // greater than equal to 10 less than 20 // 10, 15


        System.out.println(sortedSet.comparator());

        Comparator c = null;


        List l = new LinkedList();

        TreeSet set1 = new TreeSet();


        TreeSet set2 = new TreeSet(l);

        TreeSet set3 = new TreeSet(c); // passing comparator for customized sorting order

        set3.add("a");  //97

        set3.add("A");  // 65

        set3.add("B");  // 66

      //  set3.add(4); // since we are adding string, integer is not allowed, run time exception, class cast

        // A B a, a will come at end as sorted order is numberic
        System.out.println(set3);


        TreeSet set6 = new TreeSet();

       // set6.add(null); // null pointer exception even when treeset is empty or not


        TreeSet set7 = new TreeSet();

        set7.add(new StringBuffer("asdasd"));

        set7.add(new StringBuffer("asdasds"));

        System.out.println(set7);

        TreeSet set8 = new TreeSet();

        set8.add(new StringBuilder("asdasd"));

        set8.add(new StringBuilder("asdasds"));

        System.out.println(set8);


    }
}
