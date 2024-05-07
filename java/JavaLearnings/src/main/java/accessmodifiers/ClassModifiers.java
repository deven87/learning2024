package accessmodifiers;

/*

only modifiers allowed with a class are public, default, final, abstract, strictfp
final and abstract can not come together

final, final class can not be inherited

a class can be public or default
public class is accessible outside package also
default class is accessible only from inside the package

abstract is allowed, that means you can put in abstract method as well which does not have any body

final and abstract can not come together as final can not be inherited

strictfp, means follow IEEE standard for floating points


class can not be private as there is no meaning of it

private protected static class can be there but only as nested or inner class not as main class

a final class all methods are by default final

abstract class can have concrete method as well as abstract method

abstract class object can not be created

 */

// this class is accessible only from within accessmodifiers package only, not even in subpackages inside accessmodifiers

 class ClassModifier {
}

// this class is applicable from anywhere
public class ClassModifiers{}

final class A {

  // all methods of a final class are always final
   public void m1() {

  }

}
abstract class B {


}

strictfp abstract class C {

}


