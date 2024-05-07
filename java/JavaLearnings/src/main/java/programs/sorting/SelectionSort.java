package programs.sorting;

public class SelectionSort {

    public static void main(String[] args) {


        // divide array into two, sorted and unsorted

        // think of first element as smallest, traverse through all element comparing with this first elemtn
        // if found any element smallert replace it with current smallest element
        // at last of first iteration we will have smallest element placed at first
        // now we need to start second iteration from second element


        int[] arr = {1, 10, 9, 6};

        for (int i =0; i < arr.length - 1; i++) {

            int index = i;

            for (int j = i+1; j < arr.length; j++) {

                if(arr[index] > arr[j]) {

                    index = j;
                }



            }

            int smallestNumber = arr[index];
            arr[index] = arr[i];

            arr[i] = smallestNumber;

        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }

    }


}
