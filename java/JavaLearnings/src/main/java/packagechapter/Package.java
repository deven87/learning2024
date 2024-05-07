package packagechapter;

/*

// package is for namespace, to group together related classes, interfaces, enums
// packages are reverse order internet domain
// e.g. com.icicic, as it will be unique


// if package structure is not available, you can create it using
// javac -d . javafile.java

// using -d tje package folders will be created in current directly .

// java -cp path of .class fullyqualified .class file name

e.g.

you create a folder dev and inside that you added a pragram with package pack1.pack2

now you will compile it inside dev using
javac -d . myclass.java
this will create folder pack1 and inside that pack2 and place myclass.class there
now you can do
java pack1.pack2.myclass

if you create package

javac -d mypack myclass.java

you have to provide cp class path, where you .class files are

java -cp mypack pack1.pack2.myclass

if a class has package, full qualified name must be used to execute

only 1 package statement can be there atmost
package must be at top in a java source file

an empty file is valid java source file
a file containing only package statement or import is also valid






 */

public class Package {

    public static void main(String[] args) {

        System.out.println("my package program");

    }
}
