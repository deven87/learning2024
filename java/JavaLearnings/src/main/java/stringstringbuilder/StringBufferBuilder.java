package stringstringbuilder;

/*

StringBuffer is threadsafe , all methods are synchronized, so method can only be executed by 1 thread at a time

StringBuilder is not thread safe

Using these instead of String if content keep on changing, as String will create new object everytime

but above will modify the same object

if content is fixed, go with string, if not go with builder, buffer

StringBuffer and StringBuilder has capacity as well

while string has only length




 */

public class StringBufferBuilder {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(); // create with initial capacity as 16

        // when it reaches its max capacity a new stringbuffer is created, data is copied and old one
        // is eligible for garble
        // new capacity = (old capacity + 1) * 2

        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer(100); // create with 100 capacity

        System.out.println(sb1.capacity());

        StringBuilder sb2 = new StringBuilder(); // 16 default capacity

        System.out.println(sb2.capacity());


        StringBuilder ss1 = new StringBuilder("abc"); // capacity is 16+ length of string = 19


        StringBuffer sbb1 = new StringBuffer("abc"); // capacity is 16+ length of string = 19

        System.out.println(ss1.capacity());
        System.out.println(sbb1.capacity());

        sbb1.setCharAt(1,'c'); // not available in String

        System.out.println(sbb1);

        // using append you can append any int, char, float, boolean, any value in stringbuilder/buffer

        sbb1.append(3.12); // adding double value // append will always add at last

        System.out.println(sbb1);

        sbb1.insert(3, 123); // insert value at any indexs // insert will add at our given index

        System.out.println(sbb1);

        sbb1.delete(0,1);

        sbb1.deleteCharAt(0);

        System.out.println(sbb1);
        sbb1.setLength(10);

        System.out.println(sbb1.length());

        sbb1.append("asdasdasadasd");
        

    }
}
