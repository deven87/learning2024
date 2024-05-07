package operators.arithmetic;


// *%-+/
// any two operand result will be max(int, type of first operand, type of second operand)

// float and double class have positive infinity, negitive infinity and Nan

import java.sql.SQLOutput;


// arithmetic exception comes only when any intger value is divided by zero
// when float or double divide by zero it gives infnity -infinity
// only / and % can cause arithmetic exception



public class Arithmetic {

    public static void main(String args[]) {

        byte b1 = 10;
        byte b2 = 20;





       // byte b3 = b1+b2; //  result will be int so cant store in byte, have to convert or use final variable
        // so that compiler knows that it will always be below 128 in case of byte

        int c = b1+b2;


        final byte b11 = 10;
        final byte b22 = 20;

        byte c11 = b11+b22;

        System.out.println(c11);

        System.out.println('a'+'b'); // out put will be 97+98
        // char+char is int as per max(int, type of first operand, type of second operand)

        System.out.println(0.0/10); // result will be double

       // System.out.println(0/0); // divide by zero arithmetic exception

        System.out.println(0.0/0); // Nan

        System.out.println(0/0.0); // Nan

        System.out.println(-0/0.0); // Nan

        System.out.println(10/0.0); // infinity for floating point, we never get divide by zero

        System.out.println(-10/0.0); // -Infinity

        System.out.println(10.0/0);  // infinity for floating point, we never get divide by zero


        System.out.println(Float.POSITIVE_INFINITY/Float.POSITIVE_INFINITY);

    }
}
