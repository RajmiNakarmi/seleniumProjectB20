package WarmUpTask;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
/*
TC #1: Zero Bank title verification1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify title
Expected: “Zero -Log in”
 */
public class TC1ZeroBankVerfication {
    public static void main(String[] args) {
       // WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedTile ="Zero - Log in";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTile)){
            System.out.println("verified");
        }else{
            System.out.println("not verified");
        }



    }
}
