package intro;

class TypeCasting {


    public static void main(java.lang.String[] args) {

        // allowed as 'a' is char which can also be denoted as 97
        byte b = 'a';

        System.out.println(b);


        char ch = 'a';

       // byte b1 = ch; not allowed as ch can be anything and can not come in byte range, so implicit not allowed


       final char ch1 = 'b';

       byte b2 = ch1;

       // allowed as ch1 will always be 98 and that fits in byte



       int x = 100;

       byte b1 = (byte)x;

       long l1 = 100;

       float f1 = l1;

       l1 = (long)f1;

       




    }

}