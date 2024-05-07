package methods.overloading;

public class OverloadingCovariant {


    public static void main(String[] args) {

        OverloadingCovariant oc = new OverloadingCovariant();

        oc.m1(null); // both object and String m1 are matching as overloaded, but since they are covariant
        // child will be given preference


    }

    public void m1(String s) {

        System.out.println("string method");
    }

    public void m1(Object s) {

        System.out.println("object method");
    }


}


class OverloadingNonCovariant {


    public static void main(String[] args) {
        OverloadingNonCovariant onc = new OverloadingNonCovariant();

      //  onc.m1(null); // now here its amibgous as Stirng and String builder are not covariant so

        // both methods call is applicable, hence compil time error for ambiguity

    }

    public void m1(String s) {

        System.out.println("string method");
    }

    public void m1(StringBuilder s) {

        System.out.println("StringBuilder method");
    }




}
