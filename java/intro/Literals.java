package intro;

public class Literals {


    public static void main(java.lang.String args[]) {


       // int x = 0123238;

        int x1 = 012377;

        int x2 = 0b101010;

       // int x3 = 0b1010102;

        int x4 = 0x123def;

      //  int x5 = 0X123deg;


      int a = 10;

      int b = 010;

      int c = 0x10;

      int d = 0b10;

      // not valid as by default float constant is double
     // float f1 = 123.123;

      float f2 = 123.123f;

      double d1 = 123.1223;

      double d2 = 123.123d;

      double d3 = 123212;

      float f4 = 123123;

    

      System.out.println(a+b+c+d);



      double d10  = 123.123;
      double d11 = 07898.123;
      double d12 = 07777;
      // double d13  = 078777; invalid as no decimal point
      //, so its an octal integral but octal should not have more than 7

      double d14 = 0x123;

      double d15 = 0xface;

      // not valid as floating literal can not be in hexadecimal or binary
      // double d16 = 0x123.123;
      // double d16 = 0b1010.1010;

     //   can not assign double value to float
     // int x = 10.0;

      int x = 111_111_111;

      int xx = 111____11___1_111;


      // not allowed
     // double d111  = 123_.123;

        // not allowed
      //  double d111  = _123.123;


      System.out.println(x);



      long l = 123;

      long l1 = 1231231231231231231l;

      int xx1 = 'a';





    }
    
}
