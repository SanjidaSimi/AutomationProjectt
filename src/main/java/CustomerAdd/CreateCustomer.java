package CustomerAdd;

import ConfigLogin.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateCustomer extends Login {

    public static void CreateCustomer() {

        WebElement NewCustomer = driver.findElement(By.cssSelector("body > div:nth-child(3) > div > ul > li:nth-child(2) > a"));
        NewCustomer.click();

        // Customer Name

        WebElement CustomerName=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        CustomerName.clear();
        CustomerName.sendKeys("simi");

        // Gender:

        WebElement Gender=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        // Date Of Birth:

        WebElement DOB=driver.findElement(By.cssSelector("#dob"));
        DOB.clear();
        DOB.sendKeys("21/11/1995");

        // Address:

        WebElement address=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        address.clear();
        address.sendKeys("arrappur,jhenaidah");


        // City:

        WebElement city=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        city.clear();
        city.sendKeys("jhenaidah");

        //State:

        WebElement state=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        state.clear();
        state.sendKeys("arrappur");

        // Pin:

        WebElement pin=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(10) > td:nth-child(2) > input[type=text]"));
        pin.clear();
        pin.sendKeys("12345678");

        // Telephone Number:

        WebElement phoneNumber=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(11) > td:nth-child(2) > input[type=text]"));
        phoneNumber.clear();
        phoneNumber.sendKeys("01643280095");

        // E-mail:

        WebElement email=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(12) > td:nth-child(2) > input[type=text]"));
        email.clear();
        email.sendKeys("sunjida.rupsha.cse@gmail.com");

        // Submit:

        WebElement submitBtn=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        submitBtn.click();


        // Verification

        String Expected_URL="http://demo.guru99.com/V1/html/insrtCustomer.php";
        String Actual_URL=driver.getCurrentUrl();

        if (Expected_URL.equals(Actual_URL)) {

            System.out.println("Account Submit Successfully . Test Case Passed.");
        }

        else {
            System.out.println("Test Case Failed");
        }




    }
}
