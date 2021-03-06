package TestNGAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGLogin {
    public static WebDriver driver;

    @BeforeClass
    public static void Launch_Chrom(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }

    @AfterClass
    public static void close_Chrome(){
        driver.close();
    }

    @Test (description = "Email and Pass Valid")
    public static void TC_Longin_001(){

        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("hassan@gmail.com");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("1234567");

        WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();

        String Expected_Title="My Account";
        String Actual_title=driver.getTitle();

        if (Expected_Title.equals(Actual_title)) {

            System.out.println("Account Successfully Login. Test Case Passed.");
        }

        else {
            System.out.println("Test Case Failed");
        }

        WebElement Logout=driver.findElement(By.linkText("Logout"));
        Logout.click();

        WebElement LoginPage=driver.findElement(By.linkText("Login"));
        LoginPage.click();
    }

    @Test (description = "Email and Pass Invalid")

    public static void TC_Longin_002(){

        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("test@test.com");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("/123456789");

        WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();

        String Expected_Title="Account Login";
        String Actual_title=driver.getTitle();

        if (Expected_Title.equals(Actual_title)) {

            System.out.println("Test Case Failed");
        }

        else {
            System.out.println("Test Case Passed.");
        }

    }

    @Test(description = "Email valid but Password Invalid")

    public static void TC_Longin_003(){

        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("hassan@gmail.com");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("*123456789");

        WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();

        String Expected_Title="Account Login";
        String Actual_title=driver.getTitle();

        if (Expected_Title.equals(Actual_title)) {

            System.out.println("Test Case Failed");
        }

        else {
            System.out.println("Test Case Passed");
        }
    }

    @Test(description = "Email Invalid and Password Valid")

    public static void TC_Longin_004(){

        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("test@test.com");

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("1234567");

        WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();

        String Expected_Title="Account Login";
        String Actual_title=driver.getTitle();

        if (Expected_Title.equals(Actual_title)) {

            System.out.println("Test Case Failed.");
        }

        else {
            System.out.println("Test Case Passed");
        }
    }
}
