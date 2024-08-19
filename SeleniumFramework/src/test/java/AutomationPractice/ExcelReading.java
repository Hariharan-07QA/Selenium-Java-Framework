package AutomationPractice;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReading {

    public static void main(String[] args) throws IOException {
        File file =new File(System.getProperty("user.dir")+"/TestData.xlsx");
        FileInputStream inputStream=new FileInputStream(file);
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
       XSSFSheet sheet= workbook.getSheet("Sheet1");
       String value = sheet.getRow(1).getCell(1).getStringCellValue();
        System.out.println(value);

        int lastRowNum= sheet.getLastRowNum();
        System.out.println(lastRowNum);
        int lastCellNum=sheet.getRow(0).getLastCellNum();
        System.out.println(lastCellNum);

        for (int i = 0; i <= lastRowNum; i++) {
            for (int j = 0; j < lastCellNum; j++) {
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
            }

        }
    }
}
