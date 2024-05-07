package programs.sorting;

public class BubbleSort {

    // sort the largest element to right most


    public static void main(String[] args) {

        int[] arr = {1,10,2,5};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

            for (int i = 0; i < arr.length; i++) {

                System.out.println(arr[i]);

            }




    }



}
