package oopss;
/*

encapsulation
wrapping up of method and data together is encapsulation


inheritance
acquiring all or few properties of an object


polymorphism
existance in more than 1 form
method overloading, static binding, compile time polymorphism
method overriding, hidding, dynamic binding, run time polymorphism


abstraction
hiding implementation details and highlight only services we are providing
provides secrurity, provides modularity, each module is independent



data hiding
outside person not having access to our data
internal data is not accessed from outside directly
we can hide data from outside by using private data
instance variable should always be kept as private so that we can have security as by default its default
we should add private






 */

public class OopsConcepts {

    // data is private mostly, can not be access from outside
    private double balance;

    public double getBalance() {

        // have some authentication here and provide balance only after that, otherwise give error
        return balance;
    }
}
