package methods.overloading;

/*

in case of normal vs var rg, normal will get priority

var args will always have least priority
 */

public class OverloadingWithVarArgs {

    void m1(int i) {
        System.out.println("normal arg");
    }

    void m1(int... i) {

        System.out.println("var arg");
    }

    public static void main(String[] args) {

        OverloadingWithVarArgs v1 = new OverloadingWithVarArgs();
        v1.m1(10); // normal one will be called because that has more priority over var arg
        // var arg method will  when no other method is getting called

        v1.m1(10, 11); // only var arg is called

    }

}
