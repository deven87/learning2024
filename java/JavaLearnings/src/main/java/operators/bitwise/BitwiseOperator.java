package operators.bitwise;



// &  |  ^ ~ are bitwise operators applicable for boolean as well as integral, ~ is applicable for integral only

// & | ! are bitwise as well as logical operators

// && ||  are logical operators only applicate for boolean operands and are also called short circuit

// positive no are represented directly in binary form
// negitive no are represented using 2's complement

// MSB will determine sign if 0 then +ve if 1 then -ve

// & if both are true then true, && same, but will false if first one is false, will not even compare second
// | if any one is true, || same, but will true if first one is true, will not even check second
// ! is unary oeprator and will reverse the value, applicable for boolean only

// ~ applicable for integral values only and will be represented in 2s complment if negitive number


public class BitwiseOperator {

    public static void main(String[] args) {

            int x = 10;
            boolean y = false;

            if(x==10 && y) {

                System.out.println("1");

            }
            else if(x==10 && !y) {

                System.out.println("2");

            }


            // & will give 1 only when both values are 1
        System.out.println(4&5);

            // will give one when any value is 1
        System.out.println(4|5);

        // xor, 1 only when both are different
        System.out.println(4^5);

        // && will not execute second part if first one is false, result will be false

        if(!(x==11 && (x/0>5))) {

            System.out.println("&& not goes into second comparison if first one is false");
        }


        // || will not execute second part if first one is true, result will be true


        if((x==10 || (x/0>5))) {

            System.out.println("|| not goes into second comparison if first one is true");
        }




    }
}
