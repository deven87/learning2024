package miscprograms;

public class Factoria {


    public static void main(String[] args) {

        System.out.println(factorialCalculator(3));

    }


    public static int factorialCalculator(int number) {

        int factorial = number;

        for (int i = 1; i < number; i++) {

            factorial = i * factorial;
            number = number-1;
            System.out.println(number);

        }

        return factorial;

    }
}
