package operators.incrementdecrement;

public class Example {

    public static void main(String[] args) {

        int i = 0;

        i += i++ +  ++i + i++ + ++i;

        System.out.println(i);  // i = i + (i++ +  ++i + i++ + ++i) // now evaluate left to right and then do assignment


        int x = 10;
        x = x++;  //now perform increment x = 11 now assign old x value to x which is 10
        x = x++; //now perform increment x = 11 now assign old x value to x which is 10
        x = x++; //now perform increment x = 11 now assign old x value to x which is 10
        x = x++; //now perform increment x = 11 now assign old x value to x which is 10
        System.out.println(x);

        int x1 = 10;

        // here post increment means consider old value for assignment and then increase/decrease the value
        int y = x1++; // increment x but assign old value of x to y

        System.out.println(x1 +  " : " + y);


        int x2 = 10;
        int y2 = 10;

        y2 = x2++;   // x2 is 10, keep this for assignment so y2 = 10 update x2 now as 11
        y2 = x2++;  // x2 is 11, keep this for assignment, y2= 11, x2 increment is 12
        y2 = x2++; // x2 is 12, assign 12 to y2, now assign incremented value to x2 which is 13 now
        y2 = x2++; // x2 is 13, assigh 13 to y2, now assign incremented value to x2 itself which will be 14

        System.out.println(y2+" : " + x2);



    }
}


