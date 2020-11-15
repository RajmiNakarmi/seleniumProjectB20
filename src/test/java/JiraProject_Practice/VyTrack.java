package JiraProject_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrack {

WebDriver driver;
    @BeforeMethod
    public void getMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");

        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user179");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-uppercase btn-primary pull-right']"));
        loginButton.click();

//open fleet module
        WebElement hoverOverFleet = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        hoverOverFleet.click();
        WebElement VehicleOdometerLink = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]/a/span"));
        VehicleOdometerLink.click();
    }

        @Test
        public void testVehicle_Odometers() throws InterruptedException {
            WebElement VehicleOdometer = driver.findElement(By.cssSelector("#container > div.container-fluid.page-title > div > div > div.pull-right.title-buttons-container > a"));
            VehicleOdometer.click();



/*
        WebElement odometerValue =driver.findElement(By.id("custom_entity_type_OdometerValue-uid-5f6901b644142"));
        odometerValue.sendKeys("34235");
        WebElement date = driver.findElement(By.id("date_selector_custom_entity_type_Date-uid-5f6903416d253"));
        date.sendKeys("sep20, 2020");
        WebElement Diver = driver.findElement(By.id("custom_entity_type_Driver-uid-5f6903416d35c"));
        WebElement unit = driver.findElement(By.id("select2-drop-mask"));
        unit.sendKeys();

        Thread.sleep(2000);

            Faker faker = new Faker();
            Diver.sendKeys(faker.name().fullName());




WebElement saveCloseButton = driver.findElement(By.xpath("//button[@class='select2-drop-mask']"));
saveCloseButton.click();

*/

        }
    }

