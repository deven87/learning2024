package cloning;

public class ShallowCloning {


    // when new object is not created and only a copy is created, no new memory is allocated
    // object class has shallow cloning by default.
    // less expensive and fast as no new memory, no new object created
    // separate copy is created for complete object, whether it is reference variable or not

    // when an object create reference variable then only new reference will be created pointing to same object
    int x=10;
    public static void main(String[] args) {


        ShallowCloning s1 = new ShallowCloning();

        System.out.println(s1.x);

        // here both s2 and s1 points to same object
        // no new object is created, so only reference is copied, hence shallow cloning
        ShallowCloning s2 = s1;

        s2.x = 15;

        // this will print x as s1 and s2 points to same object, shallow cloning
        System.out.println(s1.x);




    }
}
