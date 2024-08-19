package AutomationPractice;

import org.testng.annotations.*;

public class TestNGAnnotations {
@BeforeSuite
public void beforeSuite()
{
    System.out.println("I am in Before Suite");
}
@AfterSuite
public void afterSuite()
{
    System.out.println("I am in After Suite");
}
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("I am in before Test");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("I am in after Test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am in before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am in after class");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("I am in Before Method");
    }
    @Test
    public void Test1(){
        System.out.println("I am in Test 1");
    }
    @Test
    public void Test2()
    {
        System.out.println("I am in Test 2");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("I am in After Method");
    }
}
