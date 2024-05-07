package exceptions.top10exception;

/*

noclassdeffounderror

    parent is error so unchecked



 */

public class NCDFE {

    public static void main(String[] args) {


        A11 a11 = new A11();

      //  System.out.println(0/0); //AE

        System.out.println(10.0/0);  // infinity

        System.out.println(10.0/0.0);  // infinity

        System.out.println(10/0.0);  // infinity

        System.out.println(0.0/0.0); //Nan

        System.out.println(0/0.0);   //Nan

        System.out.println(0.0/0);   //Nan

        System.out.println(-0.0/0.0); //Nan

        System.out.println(0/-0.0);   //Nan

        System.out.println(-0.0/0);   //Nan


        System.out.println(-10.0/0);  // -infinity

        System.out.println(10.0/-0.0);  // -infinity

        System.out.println(10/-0.0);  // -infinity


    }
}

class A11{

}
