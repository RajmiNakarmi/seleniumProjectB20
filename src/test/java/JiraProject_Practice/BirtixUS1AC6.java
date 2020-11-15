package JiraProject_Practice;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BirtixUS1AC6 {
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


    // US#1,AC#6. User should be able to add mention by clicking on the Add mention icon and
    //   select contacts from the lists provided in dropdown.


    @Test
    public void addMention() {
        //click on message
        WebElement message = driver.findElement(By.xpath("//span[.='Message']/span"));
        message.click();
        BrowserUtils.wait(2);

        //click on add mention icon
        WebElement addMentionIcon = driver.findElement(By.xpath("//span[@title='Add mention']"));
        addMentionIcon.click();
        BrowserUtils.wait(2);

       //select employee and department dropdown for contact lists
        WebElement employeesDepartments = driver.findElement(By.xpath("//div[@class='bx-finder-box-tabs']/a[2]"));
        employeesDepartments.click();
        BrowserUtils.wait(3);

        //select contact list
        WebElement choseOne = driver.findElement(By.xpath("//div[@id='bx-lm-category-relation-129']/a[4]"));
        choseOne.click();

        //to go to different frame
       WebElement iframe = driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        driver.switchTo().frame(iframe);

        WebElement addMessage = driver.findElement(By.xpath("//span[@class='bxhtmled-metion']"));
        addMessage.sendKeys("Hello Team.. just testing");

       //to switch back to parent frame
        driver.switchTo().parentFrame();


      // click on Send Button
        WebElement clickSendButton = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        clickSendButton.click();

    }
}