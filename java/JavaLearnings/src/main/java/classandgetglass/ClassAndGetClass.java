package classandgetglass;

/*



 */


import java.lang.reflect.Method;

public class ClassAndGetClass {


    public static void main(String[] args) {

        // class is a static variable is present inside every class
        // it can be used directly on class name to get various things, like name of class, its methods, its variables

        // getClass() method is present in object class and is available in every class from inheritance, its not static
        // so can be applied on object

        ClassAndGetClass obj = new ClassAndGetClass();

        Method[] m = ClassAndGetClass.class.getDeclaredMethods();

        for (Method m1 : m) System.out.println(m1.getName());


        Method[] m2 = ClassAndGetClass.class.getMethods();

        for (Method m3 : m2) System.out.println(m3.getName());

        Method[] m3 = obj.getClass().getMethods();

        for (Method m4 : m3) System.out.println(m4.getName());


    }
}
