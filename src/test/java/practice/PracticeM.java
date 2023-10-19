package practice;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PracticeM {
    public PracticeM() throws IOException {
    }

    public static void excelDoc() throws IOException {
        FileInputStream excel = new FileInputStream("C:\\Users\\razia\\IdeaProjects\\Batch6Selenium\\src\\test\\ExternalData\\Book1.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(excel);
        XSSFSheet sheet = book.getSheet("info");

        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println(rowCount);
        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println(columnCount);
    }


    public static void main(String[] args) throws IOException {
        excelDoc();
    }
}
