package sout;

import java.io.PrintStream;

public class SOUT {

    public static void main(String[] args) {



        // name is a static variable of type String inside Test class so any method which can be called on String can be called on name

        Test.name.length();

        Test.test.print(new Test1());


        // similary out is a static variable of System class of type printStream, so we can call any method on it which can be called on a PrintStream object


        // System.out provide object of printstream which is at start initialized with null but later gets ready to take inout
        // and print to output stream set, like console
        System.out.println("hello");
        /*

        System is class
        out is static variable of System class which returns object of printStream type
        println is method of printstream and basically will print anything passed to the out put stream which is screen by default
         */


    }
}

class Test {

    static String name = "hello";
    static Test1 test;

}

class Test1 {

    public void print(Test1 test1) {
        System.out.println(test1);
    }

}



