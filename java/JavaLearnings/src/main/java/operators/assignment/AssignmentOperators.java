package operators.assignment;

public class AssignmentOperators {


    // right associative, resolution will be done from right to left

    public static void main(String[] args) {


        // int a=b=c=10; // not allowed

        // simple
        int x = 10;

        // chain
        int x1,y,z;

        x1 = y = z = 10;

        // compound

        x+=10;  // (x = x + 10);

        x/=20; // (x = x/20)

        int a,b,c,d;
        a=b=c=d=20;

        a+=b-=c*=d/=2;

        System.out.println(a + " : " + b + " : " + c + " : " + d);



    }
}
