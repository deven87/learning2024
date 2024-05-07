package constructors;



    /*

    constructor main objective is to initialize object

    normally all instance and static variables are initialled by default with value 0, 0.0, null, false

    what if we want to initialize them with some value,
     we can pass value during object creation and when object is created,
      constuctor are called and initialized the variables


    first object is creating using new and then initialization is done using constructor


    Student s = new Student("myname", rollNumber);

    s reference will point to new student object having null and 0

    now the constructor will call and replce the value null and 0 with the passed value

    constructor will be executed just after creating the object

    isntance block is executed first and then constructor is executed

    constructor is used to perform initialization, any activity
    you want to perform other than initialization for every object creation
    we need to add it into instance block


    if you have any parameterized constructor, then you must explicitly define no arg const if creating object with same

    if you dont have any parameterized constructor, then compiler creates a default constructor for you


** constructor can be public protected private default, no other modifier is allowed with constructor

** name of constructor must be same as class name

** return type is not applicable for constructor, it will be a normal method if return type is used


** in case of any chance of recursive constuctor invocation, we will get compile time error instead of getting stack overflow




** if calling a constructor throwing checked exception, we are required to throws same or parent in child constructor as well

** for unchecked there is no rule




     */

public class ConstructorMain {


    static int counter;

    {
        counter++;
    }
    ConstructorMain() {

        System.out.println("my constructor");
    }

    {

        System.out.println("my instance block");
    }


    public static void main(String[] args) {
        ConstructorMain c1 = new ConstructorMain();

        ConstructorMain c2 = new ConstructorMain();

        System.out.println("total objects created are " + counter);

    }

}
