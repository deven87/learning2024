package collectionframework;

/*

same has hashmap, but it preserve the insertion order


it internally uses double linked list type structure





 */

import java.util.*;

public class LinkedHashMapExample {

    public static void main(String[] args) {



        LinkedHashMap<Integer, String> map = new LinkedHashMap();

        map.put(3, "devendra");

        map.put(1, "deven");

        System.out.println(map);


    }

}
