package stringstringbuilder;

/*


String are immutable, you can not modify it, always a new object will be created




 */

import sout.SOUT;

public class StringClass {

    public static void main(String[] args) {

        String s = "hello"; // new object in SCP
        s = "hi";  // again a new object is created

        s.concat("software"); // again new object is created, but we are not storing it in refernce so lost

        System.out.println(s);

        StringBuilder sb = new StringBuilder("hi");  // again a new object is created

        sb.append("dev");

        System.out.println(sb); // StringBuilder is mutable, so change is made in existing object


        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2)); // equals method of object is overriden in string to compare content

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");

        System.out.println(sb1==sb2);

        System.out.println(sb1.equals(sb2)); // equals method of object is not overriden, so reference compare

      //  System.out.println(s1==sb1); // == can be used only when there is a relation, otherwise compile time error

        System.out.println(s1.equals(sb1)); // if two objects are not related, it will always be false

        System.out.println(sb1.equals(s1)); // if two objects are not related, it will always be false


        String ss = new String(); // emppty string object crated in heap area

        String ss1 = new String("sd"); // create object with string literal in heap area

        String ss2 = new String(new StringBuilder("hello")); // create string object using stringbuilder

        char[] ch = {'a', 'b', 'c'};

        String ss3 = new String(ch); // create string using char array

        System.out.println(ss3);

        byte[] b = {97,98,99,100};

        System.out.println(new String(b)); // abcd, char valye will store in string


        System.out.println(ss3.charAt(0));
        System.out.println(ss3.toLowerCase());
        System.out.println(ss3.toUpperCase());
        System.out.println(ss3.concat("asd"));
        System.out.println(ss3.length());
        System.out.println(ss3.contains("asds"));
        System.out.println(ss3.indexOf('a'));
        System.out.println(ss3.lastIndexOf('a'));
        System.out.println(ss3.indexOf("asdasd"));
        System.out.println(ss3.indexOf("asd", 2)); // find index of string asd starting from index2, including index2

        System.out.println(ss3.replace("asd", "dsa")); // first occurance will be replaced
        System.out.println(ss3.replaceAll("asd", "ASd")); // all occurance will remove

        System.out.println(ss3.substring(2));// get substringr from 2 including 2

        System.out.println(ss3.substring(0, 2)); // get substring from 2, including 2 to 5, not including 5

        System.out.println(ss3.trim()); // remove blank spaces from start and end only

        String ss4 = new String("01ab");
        System.out.println(ss4);

        System.out.println(ss4.replaceFirst("[0-9]", "")); // replace only first occruance
        ss4 = ss4.concat("01234");

        System.out.println(ss4.replaceAll("[0-9]", ""));

        System.out.println(ss4.replaceAll("[^0-9]", "")); // replace everything with giv en value except 0-9


        String sss1 = new String("devendra"); // new keyword, so object is created in heap and content
        // object copy is created in SCP

        String sss2 = new String("devendra"); // new keyword, so object is created in heap,
        // in SCP the same content object is already created above

        String sss3 = "devendra"; // object will be created in SCP, but it is already created above so sss3 will point to same object

        String sss4 = "devendra"; // object will be created in SCp, but it is already create so sss4 points to sam eobject

        System.out.println(sss1==sss2); // different object so false
        System.out.println(sss3==sss4); // same objects so true

        System.out.println(sss3.startsWith("a"));

        System.out.println(sss4.endsWith("a"));

        String s10 = "    ";

        System.out.println("blank");
        System.out.println(s10.trim().length());




        String s22 = new String("dev");

        String s11 = "dev";

        System.out.println(s11==s22);



    }
}
