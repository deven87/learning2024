package programs.searching;

public class LinearSearch {

    public static void main(String[] args) {

        // search a given number in an array

        int[] arr = {1,2,10,6,4,8};

        int number = 100;

        int i;

        for ( i = 0; i < arr.length; i++) {

            if(arr[i] == number) {

                System.out.println("found at index " + i);
                break;
            }

        }

        if (i == arr.length) {
            System.out.println("number not found");
        }


    }

}
