package WarmUpTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
#4: Facebook header verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify “Create a page” link href value contains text:
 Expected: “registration_form
 */
public class TC4_HeadeVerification {
    public static void main(String[] args ){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        String expectHref ="registration_form";
         String actualHref = driver.findElement(By.className("_8esh")).getAttribute("href");

         if(expectHref.contains(actualHref)){
             System.out.println("verified passed");
         }else {
             System.out.println("verified failed");
         }

    }
}
