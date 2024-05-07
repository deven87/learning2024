package imports;

// have to import classes before using them in code which are not automatically availanle

// e.g. java.lang package all clasees are by default available so not required to import

// import are at top level 2 just after package

// implicit import import java.util.*; // all classes and interfaces inside util package will be imported, not subpackages

// explicit import import java.util.Arraylist; // explicitly specifying which class interface you want to import


// explicit one improvde readabilitiy and also save from conflicts if imported same class from 2 different packages

// if using fully qualified name, no need to import

// while resolving class name, compiler will do the same in order

// first is explicit class
// second is current working directory class
// third is implicit import

// while static import resolution, compile does in order of

// first is current directly own class, then explicity import, then at the end implicit import

// java.lang package and current directory packages classes are by default available, no need to import

// more import statement will affect compile time, but not run time, as at run time, only needed class is loaded into memory


// static import, importing a class in static way, its static variable and method can be directly access
// without writing the class name

import java.util.*;
import java.sql.*;
import java.util.ArrayList;
import static java.lang.Math.sqrt; // access only sqrt method
import static java.lang.String.*;  // access all static members of String class
public class Imports {

    public static void main(String[] args) {

        // sqrt is static method of Math class which is available in java.lang, no need to import as its present by default
        System.out.println(Math.sqrt(3));
    //    System.out.println(new Date()); // compile time error as Date is ambigous, coming from both util and sql as well
        System.out.println(new Date()); // this will print our defined date if no expilicit import is defined for the same
        // even if implicit import is defined
        System.out.println(sqrt(10)); // used directly without class name, as import is static


    }

}

class Date {

    Date() {
        System.out.println("my own class");
    }

}
