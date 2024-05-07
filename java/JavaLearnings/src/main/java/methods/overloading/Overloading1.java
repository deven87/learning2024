package methods.overloading;

/*


two or more methods in a class are called overloaded if they have same name but differet argument no or type


return type may be same or different, it does not matter

while resolving overloaded method

exact match will be first priority

child reference argument can call parent parameter method

return type can be covariant also

child one will get more priority than parent one

e.g. String and Object overloaded method, call them using null, string will be called, not object





 */

public class Overloading1 {

    public void m1() {

    }

    public void m1(int x, double x1) {

    }

    public void m1(double x, int x1) {

    }

    public int m1(int x) {
        return 0;
    }

    public static void main(String[] args) {
        Overloading1 o1 = new Overloading1();
        o1.m1();
        o1.m1(10);
        o1.m1(10,20.0);
        o1.m1(10.0,20);

    }
}
