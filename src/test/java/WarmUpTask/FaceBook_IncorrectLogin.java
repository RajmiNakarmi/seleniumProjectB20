package WarmUpTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_IncorrectLogin {
    /*
     1.Open Chrome browser
    2.Go to https://www.facebook.com
    3.Enter incorrect username
    4.Enter incorrect password
    5.Verify title changed to:
    Expected: “Log into Facebook | Facebook”•
    Create new classfor each task.•There are some tipsin the 2ndpagefor whoever needs it.
    •Please try to solve yourself first before moving to the tips.
     */


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.id("email")).sendKeys("rajmi@hotmail.com"+ Keys.ENTER);

       // driver.findElement(By.name("password")).click();
        driver.findElement(By.id("pass")).sendKeys("hellohello"+ Keys.ENTER);

String actualTile = driver.getTitle();
String expectedTitle = "Log into Facebook | Facebook";

if(actualTile.equals(expectedTitle)){
    System.out.println("Title Verification Passed");

}else{
    System.out.println("Title Verification failed");
}


    }
}