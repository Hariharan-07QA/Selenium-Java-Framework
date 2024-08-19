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

public class DataProviderWithExcel {
    public static WebDriver driver;
    @DataProvider(parallel = false)
    public static Object[][] getData() throws IOException, InterruptedException {
        File file = new File(System.getProperty("user.dir") + "/TestData.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int lastRowNum = sheet.getLastRowNum();
        System.out.println(lastRowNum);
        int lastCellNum = sheet.getRow(0).getLastCellNum();
        
        System.out.println(lastCellNum);

        Object[][] a = new Object[lastRowNum][lastCellNum];

        for (int i = 1; i <= lastRowNum; i++) {
            for (int j = 0; j < lastCellNum; j++) {
                a[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return a;
    }

    @Test(dataProvider ="getData")
    public void dataProviderTest(String username,String password) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);
        driver.close();
    }

}
