package methods.overloading;

public class Overloading3 {

    void m1(float i, int j){
        System.out.println("float int");
    }


    void m1(int j, float i){
        System.out.println("int float");
    }

    public static void main(String[] args) {


        Overloading3 p3 = new Overloading3();

        p3.m1(10.0f, 10); // float int one will be called
        p3.m1(10, 10f); // int float one will be called
     // p3.m1(10, 10); // ambiguity compiler error as both can be called by implicit promotion










    }
}
