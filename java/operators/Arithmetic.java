
public class PrePostIncDec {



    // this is main method overloading
    public static void main(java.lang.String args) {

        int x =10;
        int y = ++x;


        System.out.println("x" + x);
        System.out.println(y);

        char ch = 'a';

        System.out.println(++ch);

        // 98





        byte b1= 10;
        byte b2 = 20;

        //  byte b3 = b1+b2;// compile time error as b1+b2 is max(int type of b1, type of b2 ) which is int
        // here compiler is not sure what value b1 and b2 will have at run time so it might give exception, hence it ask for conversion at compile time

        // valid will be

        byte b3 = (byte) (b1+b2);

        // or

        // here compile knows that the result will always be byte so it wont give error

        final byte b11= 10;
        final byte b22 = 20;

        byte b33 = b11+b22;


        char ch1 = 'a';
        char ch2 = 'b';

        int s11 = ch1 + ch2;






    }

}