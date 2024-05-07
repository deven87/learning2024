package stringstringbuilder;

/*

when we print a string, stringbuilder, stringbuffer, directly its content is get printed

because object call means .toString() and toString is overriden in these classes to return content


 */

public class StringStringBuilder {

    public static void main(String[] args) {

        String s = new String("dev");
        StringBuilder sb1 = new StringBuilder("devendra");

        TestString ts = new TestString("singh");

        TestString1 ts1 = new TestString1("singh");

        System.out.println(s+" " + sb1 + " " + ts);

        // here ts will print classname@hexadecimalreference code as s and sb1 have toString overriden but we have
        // not overriden tostring in our test class


        System.out.println(s+" " + sb1 + " " + ts1);
        // here ts1 has overriden tostring so instead of object content will be printed



    }
}

class TestString {

    String s;

    TestString(String s) {
        this.s = s;

    }
}

class TestString1 {

    String s;

    TestString1(String s) {
        this.s = s;

    }

    @Override
    public String toString() {
        return this.s;
    }
}
