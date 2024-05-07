package collectionframework;

/*


linkedlist is internally a double linked list in java

each node has address to next and previous element

so if an insertion/deletion is made in between only two nodes address need to be changed and not all

so when insertion and delettion are done a lot of time, linkedlist is the best choice

elements are not stored in consecutive memory location

first node does not have a previous address and last node does not have next address

lest insert element at first index
only the 0 index next address to be changed and exiting first index previous address to be changed

but when retrieving, it will lets say tell in 1 sec on first node

but for second node it has to go to first node and then get next node address

like this

so retriving element operation if need to be done multiple times, then using linkedlist is worst choice


linked list support only sequential access but not random access like arraylist


linkedlist has specific method

addfirst, addlast, getfirst, getlast, removefirst, removelast




 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListMain
{

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        // here inserting new element or removing element is best as only two node address are to be changed

        list.add(1,10);

        list.remove(2);


        // retriving element in linked list is costly operation as elements are access sequentialy and not random access

        list.get(2); // costly operation

        // only for linked list method

        list.addFirst(10);

        list.addLast(20);

        list.getFirst();

        list.getLast();

        list.removeFirst();

        list.removeLast();

        ArrayList l = new ArrayList();
        l.add(10);

        LinkedList list1 = new LinkedList(l);

        System.out.println(list1.size());

        list1.get(1);

        list1.set(1, "asd"); // replace



    }
}
