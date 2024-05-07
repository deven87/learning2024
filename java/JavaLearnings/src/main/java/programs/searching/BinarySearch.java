package programs.searching;

public class BinarySearch {

    public static void main(String[] args) {

        // array must be sorted
        int arr[] = {1,2,5,10,17};
        int number = 100;

        int low = 0;
        int high = arr.length-1;

        while(low<=high) {

           int mid = (low+high)/2;

           if(arr[mid] == number) {
               System.out.println("found"); break;
           }

           if(arr[mid]<number) {

               low = mid + 1;
           }

           if(arr[mid] >number) {

               high = mid - 1;
           }

        }

        if(low>high) {

            System.out.println("not found");
        }


    }
}
