package WarmUpTask.forMySelfPractice;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P4VerifyOrder {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);
    }

    @Test
    public void verification_Order() {
        WebElement name = driver.findElement(By.xpath("//td[.='Paul Brown']"));

        String actualName = name.getText();
        String expectedName = "Paul Brown";
        Assert.assertEquals(actualName, expectedName, "Result does not match");
    }

}






