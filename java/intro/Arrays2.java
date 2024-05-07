package intro;

public class Arrays2 {

    public static void main(java.lang.String[] args) {

        // 2d array is an array of array

        int[][] x = new int[2][];

        x[0] = new int[3];
        x[1] = new int[2];

        int[][][] x1 = new int[2][][];

        x1[0] = new int[2][];
        x1[1] = new int[3][];
        x1[0][0] = new int[3];
        x1[0][0][0] = 1;

        // dimension for base is mandatory but then it should be provided from left to right, you can not provide dimension
        // to last without providing for second last
       // int[][][]x2 = new int[3][][2]; not allowed


       int[] x1111 = new int[3];
       
       System.out.println(x1111);




       int[][] z = new int[3][];

       System.out.println(z); // will print the object z


       System.out.println(z[0]); // since no array of array size is defined, so first array will have null in each value

       // this will print null


      // System.out.println(z[0][0]); // trying to get value of null, any operation of null is nullpointerexception


     int[] x10 = new int[2];

     // x10[-2] = 30; exception array index out of bound

    

     int[] a10 = {1,2,3,4};

     int[][] a11 = {{1,2,3,4}, {1,2}};

     int[] b11 ;

     // b11 = {1,2,3}; not allowed, this type of initialization is only allowed in single line as above


     int[] x01 = new int[2];

     System.out.println(x01[0]);

     double[] x001 = new double[2];

     System.out.println(x001[0]);






    }
    
}
