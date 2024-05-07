package intro;

public class AnnonymousArrays {

    public static void main(java.lang.String[] args) {

        // annonymous array, size must not be there, initilization must be there
        int[] x = new int[]{1,2,3};

        int[] x1 = {1,2,3};


        System.out.println(x[1]);
        System.out.println(x1[1]);

        x1[1] = 'a';

        float[] x22 = new float[]{1,2,3};

       // x22[0] = 10.0; double can not be assigned to float array

       x22[0] = 10.0f;

       x22[1] = 10;

       


        

    }
    
}
