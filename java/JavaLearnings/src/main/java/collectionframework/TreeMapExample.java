package collectionframework;


/*


sorted map, sorting is done based on key

homogeneous elements allowed only



 */

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "devendra");
        map.put(1, "devendra");

        // it will store by sorting of keys
        System.out.println(map);


        for (int key : map.keySet()) {

            System.out.println("key is " + key);
            System.out.println("value is " + map.get(key));

        }


    }
}
