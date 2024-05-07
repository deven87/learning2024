package selenium.serialization;

import java.io.*;

public class Serialize implements Serializable {


    int id = 10;
    String name = "Devendra";
    transient String password = "hello";


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Serialize s = new Serialize();

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(s);

        // serialization

        s = null;

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream os1 = new ObjectInputStream(fis);
        s = (Serialize) os1.readObject();

        // now transient variables are not serialized, during deserialization, they are assigned with default values.
        // static data members are also not saved during serialization,
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.password);

    }


}
