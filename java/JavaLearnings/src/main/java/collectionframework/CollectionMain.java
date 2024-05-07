package collectionframework;

/*


collection of similar type of data

int x = 10;
we are using x here to hold 1 int value, if we have 2 values, 2 variables are required

if we have 100 values, we are not going to create 100 variable, we are going to use array

to hold group of values in a single variable using index, use array, single variable name can be used to hold multiple values

but arrays have limitation

like they can be accessed only from start to end or end to start

you can not insert into array or delete from array

array are internally implemented, have language support, and are fast

you can not have different type of data in array, e.g. int array will have all int values only, array are homogenous collection

to overcome these things, collection come into place

collection are hetrogeneous group of objects


Collections are not fixed in size, you can change it after declaration, you can delete or add elements any time
you can have homogenous as well as hetrogenous elements
a long list of method support is available

Collection is an interface, Collections is a class having various utility methods for collection

e.g. Collections.sort() to sort elements of an collection like array list

here sort is a static method

so Collections is a class having various utility method



                                    Collection

      List        I                            Set         I                              Queue   I
      duplicate allowed                       duplicate not allowed
      insertion order is preserved            insertion order is not preserved
      the order in which we add data
      they are stored in same order

      List I is implemented in              HashSet ->  LHS
      AL     C                              SortedSet I-> NevigableSet I -> TreeSet class      PQ
                                                                                            BlockingQueue ->LBQ, -> LBQ
      LL C
      Vector  C ->  Stack C




to represent objects as key value pair, we need to use map

                                    Map I

            HashMap C -> LHM         SortedMap I -> NevigableMap I -> TreeMap        Dictionary AC -> Hshtable -> Properties

duplicate keys are not allowed, value can be duplicate




 */

public class CollectionMain {


}
