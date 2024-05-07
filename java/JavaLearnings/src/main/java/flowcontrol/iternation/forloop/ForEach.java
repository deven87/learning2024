package flowcontrol.iternation.forloop;


// came with java 1.5
// can be used only with array and collections
// can be used only for traversing in forward order

import java.util.ArrayList;
import java.util.List;

public class ForEach {


    // used to retrieve colelction and array elements

    public static void main(String[] args) {

        int[] a = {1,2,3};

        for (int a1: a) {

            System.out.println(a1);
        }

        int[][][] b1 = {{{1,2,3,4}, {4,5,6}}, {{7,8,9}, {10,11,12}}};


        for (int [][]x : b1)
        {
            for (int x1[]:x)
            {
                for (int x2:x1)
                    System.out.println(x2);
            }
        }
    }
}
