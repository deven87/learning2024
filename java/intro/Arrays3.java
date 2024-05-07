package intro;

public class Arrays3 {


    String name;

    public static void main(String[] args) {

        Arrays3[] array = new Arrays3[3];



        array[0] = new Arrays3();
        array[1] = new B();
     
     //   array[2] = new A(); not allowed as array type is Array3 so only Array3 or its child can be assigned to the declared type



     Number[] numbersArray = new Number[10];
     numbersArray[0] = 1;

     numbersArray[1] = 12.12;

     numbersArray[2] = 12.12f;

     numbersArray[3] = 12l;

     // numbersArray[4] = 'a'; not allowed

     numbersArray[4] = new Integer(10);


    // numbersArray[5] = new String("as");

    // here number class is superclass of byte, short, int, long, float, double so any value we can give

    // but can not give string or char as number is not parent class for string or char


    // array of interface

    Runnable[] rn = new Runnable[10];

    



    


    }



    
}

class A {

    String aName;
}

class B extends Arrays3 {

    String bName;
}
