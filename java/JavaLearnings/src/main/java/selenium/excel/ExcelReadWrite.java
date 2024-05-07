package selenium.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExcelReadWrite {

    public static void readExcel(String fileName, String sheetName) throws IOException {

        FileInputStream fis = new FileInputStream(fileName);

        // workbook
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        // create sheet
        XSSFSheet sheet = wb.getSheet(sheetName);

        Iterator<Row> rowIterator= sheet.iterator();

        while(rowIterator.hasNext()) {

            Iterator<Cell> cellIterator = rowIterator.next().iterator();

            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();

                switch (cell.getCellType()) {

                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        break;

                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                }

                }

            System.out.println();

            }

        fis.close();

        }

    public static void main(String[] args) throws IOException {


        String fullFilName = System.getProperty("user.dir") + "/excel.xlsx";

        try {
            readExcel(fullFilName, "excel");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String fullFilName1 = System.getProperty("user.dir") + "/excel1.xlsx";
        write(fullFilName1, "sheetName");

    }

    public static void write(String fileName, String sheetName) throws IOException {


        Map data = new HashMap();
        data.put(1, "Devendra");
        data.put(2, "Manish");

        Set<Integer> keys = data.keySet();


        XSSFWorkbook wb = new XSSFWorkbook();

        XSSFSheet sheet = wb.createSheet("sheetName");

        int rowNum = 0;


        for (int key : keys) {

            Object obj = data.get(key);
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(key);

            if(obj instanceof String)
            row.createCell(1).setCellValue((String)obj);

            else if(obj instanceof Integer)
                row.createCell(1).setCellValue((Integer)obj);



        }

        FileOutputStream fos = new FileOutputStream(fileName);

        wb.write(fos);

        fos.close();



    }

    public void readUsingRowNoAndColNo(String fileName, String sheetName) throws IOException {

        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(sheetName);

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();

        for (int i = 0; i<rows; i++) {


            for (int j = 0; i < cols; j++) {

               switch (sheet.getRow(i).getCell(j).getCellType()) {

                   case STRING:
                       sheet.getRow(i).getCell(j).getStringCellValue();

                   case NUMERIC:
                       System.out.println(sheet.getRow(i).getCell(j).getNumericCellValue());
                       break;

               }

            }
        }



    }

}
