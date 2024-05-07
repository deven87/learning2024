package interview_htmls;
import interfaces.*;

class MyMainClass extends MyProtectedMethod {


    public static void main(String[] args) {

        // static protected method, accessible via parent class name
        // not accessible if parent is not inherited
        MyProtectedMethod.myMethod();


        MyProtectedMethod m = new MyProtectedMethod();

        MyMainClass m1 = new MyMainClass();
        m.myMethod(); // static protected method can be accessed via parent class object though not recommended
        m1.myMethod(); // static protected method can be accessed via child class object though not recommended

        //  m.myMethodNormal(); // protected normal method can not be access via parent class object, can be accessed only via child object
        m1.myMethodNormal(); // accessing parent normal method via child object


    }
}

    class FurtherChild extends MyMainClass {

        public static void main(String[] args) {

            MyMainClass m1 = new MyMainClass();
            m1.myMethod(); // static protected method can be accessed via child's child class object though not recommended

            // here m1 is parent of this class but child of main parent
          //  m1.myMethodNormal(); // protected member can only be accessed via current child class and not by parent child
            FurtherChild fc  = new FurtherChild();
            fc.myMethodNormal();


        }
    }


