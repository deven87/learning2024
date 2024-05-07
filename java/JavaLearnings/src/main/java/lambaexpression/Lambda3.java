package lambaexpression;

import java.util.function.Predicate;

public class Lambda3 {

    public static void main(String[] args) {

        Lambda3 l3 = new Lambda3();
        System.out.println(l3.evenOdd(10));

        // if number %2 is 0 then return true, else return false
        Predicate<Integer> p = x->x%2==0; //using lambda expression using predicate
        System.out.println(p.test(10));

        System.out.println(p.test(11));

        Predicate<Integer> p1 = x->x>=10; //using lambda expression using predicate
        System.out.println(p1.test(10));

        System.out.println(p1.test(9));




    }


    public boolean evenOdd(int x) {

        if (x%2==0) return true;
        else return false;
    }
}



