package JiraProject_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BitrixUS1AC5 {

    WebDriver driver;

    @BeforeTest
    public void setMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/stream/");


        WebElement userName = driver.findElement(By.xpath("//input[@class='login-inp']"));
        userName.sendKeys("helpdesk29@cybertekschool.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }
    /*
    5. User should be able to create a quote by clicking on the Comma icon.
     */
    @Test
    public void clickMessage() throws InterruptedException {
        WebElement message = driver.findElement(By.xpath("//span[.='Message']/span"));
        message.click();
        //  WebElement addMentionIcon = driver.findElement(By.xpath("//div[@class='feed-add-post-form-but-wrap']/span[5]"));
        WebElement commaIcon = driver.findElement(By.xpath("//span[@title='Quote text']"));
        commaIcon.click();

       WebElement iframe = driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        driver.switchTo().frame(iframe);

        WebElement typeQuota = driver.findElement(By.className("bxhtmled-quote"));
        typeQuota.sendKeys("Love Ever Hurt Never");
      //  BrowserUtils.wait(5);


    }

}
