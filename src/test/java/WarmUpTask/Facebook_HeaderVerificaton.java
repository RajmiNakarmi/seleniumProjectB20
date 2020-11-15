package WarmUpTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_HeaderVerificaton {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");

        String actualHeader = driver.findElement(By.tagName("h2")).getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header Verification PASSED!");
        } else {
            System.out.println("Header Verification Failed!");
        }
    }
    }

