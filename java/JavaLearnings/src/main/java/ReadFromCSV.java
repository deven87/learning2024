
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class ReadFromCSV {

    public static void main() throws IOException, CsvException {


        File file = new File(System.getProperty("user.dir") + "fourtenurls.csv");


        FileReader reader = new FileReader(file);


        CSVReader csvReader =
                new CSVReaderBuilder(reader).withSkipLines(1).build();

        String[] urls;


        List allData = csvReader.readAll();

        int listSize = allData.size();

        String[] urlsArray = new String[listSize];


        for (int i = 0; i < listSize; i++) {


            urlsArray[i] =  (String) allData.get(i);

        }


        for (int i = 0; i < urlsArray.length; i++) {

            System.out.println(urlsArray[i]);
        }

    }



}

