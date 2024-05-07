package collectionframework;

/*


List can have duplicate objects

List have order preserved, first element will store at 0 index then next at 1st and so on


list has following methods

void add(index, object) return type is not boolean as in collection a object may not be added if duplicate in case of


all collection methods are available along with

add(index, object)

object get(index) // get object at an index

int indexOf(object) // get index of an object, it returns first object index


int lastIndexOf(object)


*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List l1 = new ArrayList<>();
        List l2 = new LinkedList();

        l1.add("hello");
        l1.add(1);
        l1.add(1.23);

        l2.add("hi");
        l2.add(1);
        l2.add(1.23);
        l2.add(3,"last element");

        System.out.println(l2.get(1)); // get element at index

        System.out.println(l2.indexOf(1.23));  // get index of object





    }

}
