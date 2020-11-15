package WarmUpTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_zeroBankLoginTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.id("user_login")).sendKeys("rajminakarmi26@gamil.com"+ Keys.ENTER);
driver.findElement(By.id("user_password")).sendKeys("KHOYESTO"+Keys.ENTER);

String actualTitle =driver.getTitle();
String expectedTitle = "Zero – Account Summary";

if(actualTitle.equals(expectedTitle)){
    System.out.println("verification Passed!");
}else{
    System.out.println("verification Failed!");
}

    }
}
