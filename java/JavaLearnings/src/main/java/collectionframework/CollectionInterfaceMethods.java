package collectionframework;


/*


few methods are defined inside collection interface which are applicable thrugh out the hierarchy


add(Object o) to add an object to any collection

add(Collection c) to add a complete colelction to any collection

contains() contains a object or a collection

isEmpty

remove(object ) to remove a object

remove(collection) to remove a collection

toArray()
change collection to array


size to get size of collection

 */

import java.util.ArrayList;
import java.util.List;

public class CollectionInterfaceMethods {

    public static void main(String[] args) {

        List l = new ArrayList<>();
        l.add("asd");
        l.add(1);

        List l1 = new ArrayList<>();

        l1.addAll(l);

        System.out.println(l1.contains(1));

        System.out.println(l1.contains(l));

        // check if collection is empty or not
        System.out.println(l1.isEmpty());

        // get collection size
        System.out.println(l1.size());


        // convert collection to object array
        Object[] arr = l1.toArray();

        for (Object o : arr) {
            System.out.println(o);
        }

        // remove object from given index
        l1.remove(0);



        // convert collection to object array
        Object[] arr1 = l1.toArray();

        for (Object o : arr1) {
            System.out.println(o);
        }



    }


}
