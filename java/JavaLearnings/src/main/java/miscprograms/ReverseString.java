package miscprograms;

public class ReverseString {

    public static void main(String[] args) {


        System.out.println(reverseString("hello"));


    }

    public static String reverseString(String s) {


        String reverse = "";

        for (int i = 0; i < s.length(); i++) {

            reverse = s.charAt(i) + reverse;

        }

        return reverse;

    }
}
