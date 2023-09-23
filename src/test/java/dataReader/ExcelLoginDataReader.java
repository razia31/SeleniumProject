package dataReader;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelLoginDataReader {
    // I will write some code... to connect my class with external file
@DataProvider (name= "Login Data from Excel")
    public Object[][] loginData() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\razia\\IdeaProjects\\Batch6Selenium\\src\\test\\ExternalData\\LoginDataUA.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(fis); // open the Workbook
        XSSFSheet sheet = book.getSheet("Sheet1"); // open the sheet
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println(rowCount);

        int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println(columnCount);
        Object[][] data = new Object[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            XSSFRow row = sheet.getRow(i);

            for (int j = 0; j < columnCount; j++) {

                data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();

            }
        }
return data;
    }

    //    public static void main(String[] args) throws IOException {
//        loginData();
//    public static void main(String[] args) throws IOException {
//        ExcelLoginDataReader obj = new ExcelLoginDataReader();
//        obj.loginData();

    }



