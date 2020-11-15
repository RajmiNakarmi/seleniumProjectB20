package WarmUpTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_ZeroBank {
/*

 */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");


        String actualHREF= driver.findElement(By.className("brand")).getAttribute("/index.html");

        String expectedHREF = "index.html";

        if (actualHREF.equals(expectedHREF)){
            System.out.println("verified passed");
        }else{
            System.out.println(" verified failed");
        }
    }
}

