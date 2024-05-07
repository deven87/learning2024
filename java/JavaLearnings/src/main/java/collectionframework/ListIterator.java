package collectionframework;

import java.util.ArrayList;
import java.util.List;

/*

ListIterator interface is child interface of iterator and used to traverse to any list type

e.g arraylist, linkedlist, stack, vector

it is one of the cursor of collections

its curser always point to previous and next element, not to current element

ListIterator is a bidirectional iterator and has next and previous methods

iterator has only forward traversing and can be used for any collection, iterator can not give index of element

while listiterator can be used only for list and has both forward and backward traverse facility

listiterator give index of next/previous element



 */

public class ListIterator {


    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(1);
        list.add("1");
        list.add(true);
        list.add(new Object());
        list.add(null);
        list.add("1");

        java.util.ListIterator li =  list.listIterator();

        System.out.println("size" + list.size());

        while(li.hasNext()) {

            System.out.println(li.next());
            System.out.println(li.nextIndex());
        }

        while(li.hasPrevious()) {

            System.out.println(li.previous());
            System.out.println(li.previousIndex());

        }

    }
}
