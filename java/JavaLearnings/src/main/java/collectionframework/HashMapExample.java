package collectionframework;

/*


hasmap use array and linkedlist as internal data structure and hashing technique

hashmap has faster insertion and retrieval rate

but uses high memory

initial capacity is 16 and  load factor is -.75

map takes key value pair as value

key and value both are objects only

keys can not be duplicate, values can be duplicate

map is separate and not child of Collection interfaces

each keyvalue pair is known as entry

so map is a collection of entry objects


isEmpty()

size()



 */

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        HashMap map = new HashMap();

        HashMap map1 = new HashMap(100); // initial capacity

        HashMap ma = new HashMap(100, 0.90F); // initial capacity and load factor

     //   HashMap map2 = new HashMap(al); // not allowed, no constructor taking collection object in hashmap



        HashMap<Integer, String> map3 = new HashMap();

        HashMap<Integer, String> map4 = new HashMap<>();

        HashMap<Integer, String> map5 = new HashMap<Integer, String>();

        // providing type on right side and providing diamond operator is not mandatory


        map5.put(1,"devendra");

        map5.put(2,"manish");

        map5.put(3,"devendra");

        map5.put(3,"deven"); // this will replace earlier value for key 3 with new value

        System.out.println(map5); // {1=devendra, 2=manish}


        System.out.println( map5.isEmpty());

        System.out.println( map5.size());

        map5.remove(3); // remove object for key 3

        System.out.println(map5);

        map5.clear(); // empty the map

        System.out.println(map5);

        map5.put(1,"devendra");

        map5.put(2,"manish");

        Set set = map5.entrySet(); // get a set equallant of map

        Iterator itr = set.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());
        }

        System.out.println(map5.get(1));

        System.out.println(map5.containsKey(1));

        System.out.println(map5.containsValue("deven"));

       for (Map.Entry m : map5.entrySet()) {

           System.out.println(m.getKey());

           System.out.println(m.getValue());

       }

       HashMap<Integer, String> map7 = new HashMap<>(map5);

       for (int key:map5.keySet()) {

           System.out.println(key);
           System.out.println(map5.get(key));
       }



    }

}
