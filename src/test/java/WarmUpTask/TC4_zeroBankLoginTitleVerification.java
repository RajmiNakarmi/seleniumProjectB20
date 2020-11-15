package WarmUpTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_zeroBankLoginTitleVerification {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.id("user_login")).sendKeys("userName");
        driver.findElement(By.id("user_password")).sendKeys("password"+ Keys.ENTER);
       driver.findElement(By.linkText("Account Activity")).click();

       String actualTitle = driver.getTitle();
       String expectedTitle = "Zero –Account Activity";

       if(actualTitle.equals(expectedTitle)){
           System.out.println("verification title passed");
       }else{
           System.out.println("verification title failed");
       }

       driver.findElement(By.linkText("Transfer Funds")).click();
        String actualFund = driver.getTitle();
        String expectedFund = "Zero –Transfer Funds";

        if(actualFund.equals(expectedFund)){
            System.out.println("verification title passed");

        }else{
            System.out.println("verification title failed");
        }

        driver.findElement(By.linkText("Pay Bills")).click();
        String actualPay = driver.getTitle();
        String expectedPay = "Zero –Transfer Bills";

        if(actualPay.equals(expectedPay)){
            System.out.println("verification title passed");

        }else{
            System.out.println("verification title failed");
        }

        driver.findElement(By.linkText("My Money Map")).click();
        String actualMap = driver.getTitle();
        String expectedMap = "Zero –My Money Map";

        if(actualMap.equals(expectedMap)){
            System.out.println("verification title passed");

        }else{
            System.out.println("verification title failed");
        }

        driver.findElement(By.linkText("Online Statements")).click();
        String actualLink = driver.getTitle();
        String expectedLink = "Zero –My Money Map";

        if(actualLink.equals(expectedLink)){
            System.out.println("verification title passed");

        }else{
            System.out.println("verification title failed");
        }
    }
}
