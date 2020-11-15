package WarmUpTask.forMySelfPractice;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PrintNamesAndCities {

        WebDriver driver;

        @BeforeMethod
        public void setupMethod() {
            driver = WebDriverFactory.getDriver("Chrome");
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
            SmartBearUtilities.loginToSmartBear(driver);
        }
//This method should simply print all the names in the List of All Orders.
// •Create a new TestNG test to test if the method is working as expected.
        @Test
        public void print_NameAndCities(){
            List<WebElement> names = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[2]"));
            List<WebElement> cities = driver.findElements(By.xpath("//table[@id ='ctl00_MainContent_orderGrid']//td[7]"));

            for(int i =0; i<8; i++){
                System.out.println("Name " + i+": "+names.get(i).getText()+", "+"City"+i+":"+cities.get(i).getText() );
            }

        }
        @AfterClass
    public void close() throws InterruptedException{
            Thread.sleep(1000);
            driver.close();
        }

    }


