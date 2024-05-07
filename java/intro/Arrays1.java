package intro;

public class Arrays1 {

    public static void main(java.lang.String[] args) {



        System.out.println(args.length);

    int[] x;
    int x1[];

    int x2 [];

    int []x3;

    // all are valid declaration but
    // int[] x is receommended as it shows that its an integer array and variable name is clearly separated from type

    //  

    // not allowedm [] can only come before first variable only;

  //  int[] []x111,[]y111;

  int[] []a, b, c;

  a = new int[3][];


  b = new int[3][3];

  c = new int[3][3];


  int[] a1[], b1[][], c1[];

  a1 = new int[3][];


  b1 = new int[3][][];

  c1 = new int[3][];

  // not allowed without giving size

 // int[] a11 = new int[];

 // size 0 is allowed, no element
 int[] a111 = new int[0];

 System.out.println(a111.length);


 // long not allowed as integer values are enough 
 // int[] a1111 = new int[12l];

 // float double not allowed as size would be always a whole number and not a floating point

 // valid for compiler but will give memory exception as you are creating 2147483647 variable each of 4 byte
 //int[] a1111 = new int[2147483647];

 //System.out.println(a1111.length);


 System.out.println(Integer.MAX_VALUE);



    
}

}
