package interviewpoints.interfaceinterviewpoints;
/*

static methods in interfaces:

can have definition/implementation inside interface, are by deault public

static methods are available in interfaces from 1.8
static methods are not availabel by default in implementing classes
it has to be made avaialble using Interface name and dot operator
so there is no case of ambiguity, multiple interfaces can have same name signature static method and can be implemented
simulteneously by a class without any issue, as they are not available by default in the implementing class or interface

static methods are used as a general utitility

static methods can also be accessed withouting imlementing the interface


 */

/*
default methods:

default methods are availabel from 1.8
default methods have implementation inside interface and are by defauolt public

default keywork can only be used inside an interface only

default methods are used where we need to provide backward compatibility for interfaces, e.g. interface has 10 methods
implemetned by 100 classes, now suppost we need to add 1 more method in interface, we have to modify all classes,

so here role of default methods comes they are by default available in all implementing classes

no need to override, override is mandatory in case default methods of same name and signature are implemented in 2 or more interfaces

and a class is simulteneously implementing them, must override to avoid ambuiguity



 */

/*

interface variables

interface variables are by default public static and final this is because a lot of class can imp0lement it
and it can be changed by any class if not final

you can not have instance variable, instance block, static block inside interface

interface variables must be initialized at the time of declaration

interface also have by default abstract

 */

/*

interfaces are service requirement specification

interface can be default, public, by default they are abstract

interface hava final static public variables which are initialized at time of declaration

interface have all methods by default public and abstract, which are automatically avaialble in implementing class

implementing class must override them

extending an interface having same method means its overridden

implementing abstract class having same method means its overrridden

interface can have default methods which are also public by default

interface can have static methods which are also public by default

default methods are by default available in implementing class so no need to override, unles you have 2 or more interface having same method

then it becomes must to override in implementing class

static methods are not available in implementing class by own and have to be called using interface name

so no concept of ambiguity or duplicate is there in static methods

instance block, instance variables, static block are not allowed inside interface

default methods of interfaces are to provide backward compatitibility by adding them into interface
as they wont have to be implemented in each implementing class, they will be availabel by default

static methods in interfaces act as utility methods and are availabel without even implementing the interface


 */



public class Interview {


}

interface AA {


    default void a(){

    }
}

