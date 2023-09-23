package dataReader;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelForumLoginDataReader {
    @DataProvider(name= "Forum Login Data from Excel")
    public Object[][] forumLoginData() throws IOException {
        FileInputStream fis1 = new FileInputStream("C:\\Users\\razia\\IdeaProjects\\Batch6Selenium\\src\\test\\ExternalData\\ForumLoginUA.xlsx");
        XSSFWorkbook book = new XSSFWorkbook(fis1); // open the Workbook
        XSSFSheet sheet = book.getSheet("Forum1"); // open the sheet
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

}
