package operators.conditional;


// can have 3 operand

// (first operand)? second operand: third operand

// first operand is a condition, if true it will result into second operand
// if false it will result into third operand

// it can be nested

public class Ternary {

    public static void main(String[] args) {

        int y = 20;

        int x = y==20?y:10;

        System.out.println(x);


        int z = y==10?y:(10<5?100:1000);

        System.out.println(z);

    }
}
