package operators.incrementdecrement;


/*

pre increment or decrement, value of variable is uppdated and then it is used
in post increment or decrement, valuye of variabe is used first and then uppdated

pore and post



 */

public class IncDec {

    public static void main(String[] args) {

        byte b=127;

        // here b++ = (byte) (b+1) hence no compile time error
        b+=1;
        //or

        // here b++ = (byte) (b+1) hence no compile time error
        b++;
        System.out.println(b);

        int x = 10;

    }
}
