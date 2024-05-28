package lambaexpression;

/*


if you want to use method of an interface,
 you will have to create a class just to implement the method and then only you can use that method

create a class just for the same of method
 implementation is not mandatory as their are other options as well

1. e.g. annonymous class can be used, instead of creating
 a class, you can create annonymous class and implement method

2. if the interface is functional interface, i.e. having
only 1 abstract method, then you can use lambda expression as well

lambda expression is basically an annonymous method which
can be used for implementing methof of an functional interface.

lambda expression is a shorter way for implementation.

just like a method parameter, you can use the whole method as a parameter


annonymous class can be used for any interface method
implementation but lambda can be used for only functional interface method implementation

in lambda expression can we can write any code which is valid as per java

lambda expression can access class variable, instance variable and
can access final local variable or effective final local variable declared outside lambda block



 */



/*
Lambda expressions in Java are a concise way to express anonymous functions.
 They were introduced in Java 8 and provide a way to implement functional
  interface';'Here are the main rules and characteristics of lambda expressions in Java:

Syntax: Lambda expressions have a compact syntax represented by parameters -> expression or (parameters) -> { statements; }.
Functional Interfaces: Lambda expressions are used to implement functional interfaces, which have a single abstract method.
Type Inference: The compiler can infer the types of parameters in a lambda expression from the context in which the lambda is used. This makes the lambda expression more concise.
Parameter List: Lambda expressions can take zero or more parameters. If a lambda expression takes no parameters, you still need to provide empty parentheses (). For multiple parameters, use comma-separated list inside parentheses.
Arrow (->) Operator: The arrow operator separates the parameter list from the body of the lambda expression. It is used to denote the transition from parameters to body.
Body: The body of a lambda expression can be a single expression or a block of code enclosed in curly braces. If the body is a single expression, it implicitly returns the value of that expression. If the body is a block of code, you need to use a return statement explicitly if the return type is non-void.
Access to Variables: Lambda expressions can access local variables, instance variables, static variables, and parameters from the enclosing scope. However, these variables must be effectively final or final.
Exception Handling: Lambda expressions can throw checked exceptions, but they don't require explicit throws clauses. Instead, you need to handle the exceptions within the lambda expression body.
Method References: Lambda expressions can often be replaced with method references, which provide a shorthand syntax for calling a method.
No New Scope: Lambda expressions don't introduce a new scope. They can access variables from the enclosing scope, but they can't declare new variables or redefine existing ones.
No Direct Use of this and super: Inside a lambda expression, you can't use this and super keywords directly to refer to the enclosing instance or superclass. Instead, you can access them as you normally would in the enclosing context.
Lambda expressions provide a powerful and concise way to write code, especially when working with collections, streams, and functional programming paradigms in Java. Understanding these rules and characteristics is essential for effectively using lambda expressions in your Java code.
 */



public class Lamda4 {


    static String name = "asd";

    public static void main(String[] args) {

name = "asdasdas";

        // annonymous class creations

        MyInterface myInterface = new MyInterface() {
            @Override
            public void myInterfaceMethod() {

                System.out.println("annonymous class implementation of  interface method");
            }
        };

        // lambda expression as interface is functional

        myInterface.myInterfaceMethod();


        MyInterface myInterface1 = () ->  System.out.println("Lambda implementation of  interface method");


        myInterface1.myInterfaceMethod();


        // annonymous class creation for implementing normal interface method, can not use lambda as interface is not functional

        MyInterface1 myInterface11 = new MyInterface1() {
            @Override
            public void myInterface1Method1() {

                System.out.println(name);
                System.out.println("annonymous class implementation of  interface1 method1");


            }

            @Override
            public void myInterface1Method2() {

                System.out.println("annonymous class implementation of  interface1 method2");


            }
        };



        myInterface11.myInterface1Method1();

        myInterface11.myInterface1Method2();


    }
}


interface MyInterface{

    void myInterfaceMethod();

}


interface MyInterface1{

    void myInterface1Method1();

    void myInterface1Method2();


}
