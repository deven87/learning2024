package selenium.csv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;

public class OpenCSV {


    public void writeCSV(String fileName, String[] data) throws IOException {


        FileWriter fw = new FileWriter(fileName);

        CSVWriter csw = new CSVWriter(fw);


        String[] header = {"id", "name"};
        csw.writeNext(header);


        String[] dataArr = {"1", "dev"};

        csw.writeNext(dataArr);

        csw.close();

    }

    public void readCSV(String fileName) throws IOException, CsvValidationException {

        FileReader fr = new FileReader(fileName);

        CSVReader csr = new CSVReader(fr);
        String[] arr = null;

        //
        while(csr.readNext()!=null) {
            arr = csr.readNext();
            for (String ar : arr) {
                System.out.println(ar);
            }
        }

    }

}
