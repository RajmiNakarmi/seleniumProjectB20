package WarmUpTask;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6) a. “Home” linkb. “Forgot password” headerc. “E-mail” textd. E-mail input boxe. “Retrieve password” buttonf. “Powered by Cybertek School” text
4. Verify all WebElements are displayed.
Better if you do with both XPATHand CSSselector for practice purposes
 */
public class P1_Xpath_CSS_Practices {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get(" http://practice.cybertekschool.com/forgot_password");

        WebElement userName = driver.findElement(By.cssSelector("//input[@name='email']"));
                userName.sendKeys("rajmi@gmail.com");

//WebElement retrievePassword = driver.findElement(By.cssSelector())

    }
}