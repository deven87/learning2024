package intro;

public class CallByValue {


    public static void main(java.lang.String[] args) {

        Demo d = new Demo();
        d.x = 100;
        d.y = 200;

        CallByValue c = new CallByValue();

        // passing here d object
        c.methodCallObject(d);


        System.out.println(d.x);

        System.out.println(d.y);


    }

    // here d1 is created by referring to same object as passed.
    public void methodCallObject(Demo d1) {

        d1.x = 300;
        d1.y = 400;
    }


    
}


class Demo {

    int x;
    int y;
}