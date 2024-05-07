package exceptions;

/*

when a program close abnormally it is called as exception

if we want our program to run and give proper error or keep on running in case it receive exception

it has to be handled

it can be handled by using try catch, try finally, try catch finally block


e.g. connect with db , read data and close connection

but my program terminated abruptly at reading data, so it wont close connection

now we can only have a limited connections here, resource wastage is there

to avoide we can use exception handling

you can provide alternate code which should run if an exception comes

finally can come along with try only, or with try and catch

try must be imediately followed by either catch or finally

either try with finally order, or try with catch followed by finally order

finally can not come in between

catch wont execute if no exception and try will execute fully and then statement after catch will execute

catch will execute if exception and then statement after catch will execute

when an exception is raised, an exception object is created, jvm sees who throws the exception and if that module has
handling code or not
if not it goes to caller of that functional and see the same

if the caller is main, which is called by JVM, so JVM has to handle the exception

it give the exception object to default exception handler and default exception handler does nothing but provide

name, description and stack trace of exception and ends the program abruptly



withing try block if there is no chance of raising an exception, we can not write catch block
only in case of fully checked exceptions


 */

public class ExceptionMain {

    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException npe) {

            npe.printStackTrace(); // print the exception name, description and line number with where it was found

            System.out.println(npe.toString()); // it wont print the exception line, print name and description

            System.out.println(npe.getMessage());  // only give exception description

        }


        // finally block can be used with or without try and it will run even if exception does not occurs

        try {
            System.out.println(10 / 0);
        } finally {

            System.out.println("finally block with exception");
        }

        try {
            System.out.println(10 / 3);
        } finally {

            System.out.println("finally block without exceptions");
        }

            System.out.println("hello");


        try {
            System.out.println(10 / 3);
        } catch (Exception e) {

        }
            finally {

            System.out.println("finally block without exceptions");
        }









    }


}
