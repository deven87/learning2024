package intro;

public class VariablesTypes {

    int x =10;
    static int y = 20;
    float f;
    char c;
    String s;
    VariablesTypes() {

       // static int y = 20; // static variable can be declared only directly inside class and not anywhere else
       


    }



    public static void main(java.lang.String[] args) {

        // static method can access static variable directly or via class name or via object name
        System.out.println(y);

        System.out.println(VariablesTypes.y);

        // static method can not access non static variable directly

      //  System.out.println(x); // not allowed

      VariablesTypes vt = new VariablesTypes();

      vt.myMethod();

      // static method can access static variable via class or object name and non static variable via 
      // object only

      System.out.println(vt.x); 

      // not a receommneded way of accessing static variable
      System.out.println(vt.y); 

      System.out.println(vt.c); 
      System.out.println(vt.f); 
      System.out.println(vt.x); 

      System.out.println(vt.s); 


      VariablesTypes vt1 = null;

      // System.out.println(vt1.x); since vt1 is null accessing it will given RTE

      System.out.println(vt1.y); // since vt1 is null but y does not required vt1 at all
      // as its a static variable so it is accessible

    


    }

    public void myMethod() {

        // non static methods can access non static variable directly or static variable directly or via class name and .

        System.out.println(x);
        System.out.println(y);
        System.out.println(VariablesTypes.y);

    }


    
}
