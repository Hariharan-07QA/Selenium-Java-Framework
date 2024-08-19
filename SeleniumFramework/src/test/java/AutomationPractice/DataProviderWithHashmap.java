package AutomationPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataProviderWithHashmap  {
    public static WebDriver driver;

    @DataProvider(parallel = true)
    public static Object[][] getData() throws IOException, InterruptedException {
        File file = new File(System.getProperty("user.dir") + "/TestData.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int lastRowNum= sheet.getLastRowNum();
        int lastCellNum=sheet.getRow(0).getLastCellNum();
        Object[][]a = new Object[lastRowNum][1];
        Map<String,String > map;
        for (int i = 1; i < lastRowNum; i++) {
            map=new HashMap<>();
            for (int j = 0; j < lastCellNum; j++) {
               String key = sheet.getRow(0).getCell(j).getStringCellValue();
               String value=sheet.getRow(i).getCell(j).getStringCellValue();
               map.put(key,value);
            }
            a[i-1][0]=map;
        }
        return a;

    }

    @Test(dataProvider = "getData")
    public void dataProviderTest(Map<String,String>data) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(data.get("username"));
        driver.findElement(By.name("password")).sendKeys(data.get("password"));
        Thread.sleep(2000);
        driver.close();
    }
}
