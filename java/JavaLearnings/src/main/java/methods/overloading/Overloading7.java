package methods.overloading;

public class Overloading7 {

    public static void main(String[] args) {

        Overloading7 o7 = new Overloading7();
        o7.sum('a');






    }

    public void sum(short s) {

        System.out.println("shor method");
    }

    public void sum(int s) {

        System.out.println("int method");
    }


}
