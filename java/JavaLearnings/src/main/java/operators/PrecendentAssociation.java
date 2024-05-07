package operators;


// assignment has the least precedence and has right to left association

// unary operator, applicable only on 1 operand
// binary operator, applicable on 2 operand
// ternary operator, applicable on 3 operand

// !, ^, ~

// first preference is unary, then binary, then ternary


/*
1 ()
2  x++ x--
3  ++x, --x, ~, !
4 new, typecasting
5 *, /, %
6 >>, >>>, <<
7 <, <=, >, >=, instanceOf
8 ==, !=
9 &
10 ^
11 |

12 &&
13 ||
14 ?:
15 =, +=, -=, ...  right to left
16


// only operator precedence is there and not operand precedence, so operands will be resolved from left to r






 */


public class PrecendentAssociation {

    public static void main(String[] args) {

        System.out.println(10+3*4/2);

        System.out.println(10+3/4*2);

        System.out.println(~1);

        System.out.println(m1(1)+m1(2)*m1(3)/m1(4)*m1(5)+m1(6));

        // only operators have precedence and not the operand

        // 1+2*3/4*5+6
        // 1+6/5*5+6
        // 1+1*5+6
        // 1+5+6
        // 12



    }

    public static int m1(int x) {
        return x;
    }
}
