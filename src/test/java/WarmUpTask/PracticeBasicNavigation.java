package WarmUpTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "http://www.google.com";
        driver.get(url);




        driver.findElement(By.name("q")).sendKeys("youtube"+ Keys.ENTER);

driver.navigate().back();

        driver.findElement(By.name("q")).sendKeys("FaceBook"+ Keys.ENTER);
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        driver.navigate().back();
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Gmail")).click();

        Thread.sleep(2000);
driver.findElement(By.partialLinkText("Sign in")).click();


driver.close();
    }
}
