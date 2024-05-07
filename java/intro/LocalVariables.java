package intro;

public class LocalVariables {


    public static void main(java.lang.String[] args) {


        // block1 where x is intialized in every case, so its allowed 

        int x;

        if(args.length>0) {

            x=10;
        }
        else{

            x=20;
        }

        System.out.println(x);


        // block2

        int i;
        int j=10;

        if(j<5) {

            j++;
        }
        else {
            i=11;
        }

        // since j can be changed at run time and it is not necessary that else block will execute
        // i is not allowed without initialization
      //  System.out.println(i); // not allowed




    }
    
}
