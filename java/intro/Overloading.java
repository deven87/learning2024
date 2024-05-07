package intro;

public class Overloading {

    // two methods having different no of argumnts or different types of arguments, main method can also be overloaded


    public void m1(int x) {


        System.out.println("int single arg");

    }

    public void m1(float x) {

        System.out.println("float single arg");

    }

    public void m1(String x) {
        System.out.println("String single arg");


    }

    public void m1(String x, String y) {

        System.out.println("String two arg");


    }

    public void m1(int x, int y) {

        System.out.println("int single arg");
    }

    public static void main(java.lang.String[] args) {


        System.out.println("my main String");

    }


    // main overloading

    public static void main(Object[] args) {


        System.out.println("my main object");



    }





    
}
