package WarmUpTask;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBookVerification {
    /*
    TC #1: Facebook title verification1.Open Chrome browser
    2.Go to https://www.facebook.com
    3.Verify title: Expected: “Facebook -Log In or Sign Up”TC
    #2: Facebook incorrect login title verification

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.faceBook.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed");
        }else{
            System.out.println("Title verification Failed");
        }

    }

    public static class JiraTask {

        public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = WebDriverFactory.getDriver("Chrome");

            driver.get("https://qa2.vytrack.com/user/login");

            Actions action = new Actions(driver);

            Thread.sleep(2000);

            driver.findElement(By.id("prependedInput")).sendKeys("user179");
            driver.findElement(By.name("_password")).sendKeys("UserUser123"+ Keys.ENTER);
        }
    }
}
