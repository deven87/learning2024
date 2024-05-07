package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {

    public static void main(String[] args) throws IOException {


        // create

        File file = new File("hello.txt");

        // return true if file does not exists and created successfully
        // return false if file already exists
        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        writer.write("test");

        // write will work only when you will close it
        writer.close();

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {

            System.out.println(scanner.nextLine());
        }

        FileReader reader = new FileReader(file);
        int i;

        while( (i = reader.read())!=-1) {

            System.out.println((char)i);

        }


        // return true if file gets deleted successfully
        file.delete();

    }



}
