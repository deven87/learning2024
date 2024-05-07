package accessmodifiers.protectedmember1;

/*

both classes below are inheritig object class by default
object class has protected method clone
so any class can call protected method using its object but only from inside it



 */
public class ProtectedMemberExample {



    public static void main(String[] args) throws CloneNotSupportedException {



        ProtectedMemberExample pm = new ProtectedMemberExample();
        ProtectedMemberExample pm1 = (ProtectedMemberExample)pm.clone();

        Dog dog = new Dog();
      //  Dog dog1 = dog.clone(); // compile time error as clone is protected in object so can be accessed via current child class object only

        // here dog can not call clone because protected can be accessed only via current child class reference


    }
}

class Dog{}
