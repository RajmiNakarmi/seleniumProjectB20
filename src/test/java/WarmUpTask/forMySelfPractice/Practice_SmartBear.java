package WarmUpTask.forMySelfPractice;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice_SmartBear {

    //1: Smartbear software link verification
    // 1.Open browser

    WebDriver driver;

    @BeforeMethod
    public void getMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);


        //2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


// 3.Enter username: “Tester”

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        // 4.Enter password: “test”
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");
        // 5.Click to Login button6.Print out count of all the links on landing page
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }



        // 6.Print out count of all the links on landing page

    @Test
    public void countLink() {
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("Count of the links: " + allLinks.size());

        // 7.Print out each link text on this page}
        for (WebElement eachLink : allLinks) {
            System.out.println("eachLink= "+ eachLink.getText());

        }

    }
    //task 2
    //6. Click on Order
    @Test
    public void clickOrder_javafaker() throws InterruptedException{

        WebElement orderLink = driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();

        //7. Select familyAlbum from product, set quantity to 2
        Select productDropdown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        productDropdown.selectByVisibleText("FamilyAlbum");

        Thread.sleep(2000);

        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.clear();

        quantity.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);
        quantity.sendKeys("2");

        //8. Click to “Calculate” button

        WebElement calculateButton = driver.findElement(By.className("btn_dark"));
        calculateButton.click();
        Thread.sleep(1000);

        //locating all of the web elements using id
        WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement street = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        //9. Fill address Info with JavaFaker
        Faker faker = new Faker();

        //• Generate: name, street, city, state, zip code
        customerName.sendKeys(faker.name().firstName());
        street.sendKeys(faker.address().streetAddress());
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        zip.sendKeys(faker.address().zipCode());

        Thread.sleep(2000);

        //10. Click on “visa” radio button
        WebElement clickVisa = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        clickVisa.click();

        //11. Generate card number using JavaFaker
        WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        Thread.sleep(2000);

        //Enter expiration date
        WebElement expirationDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expirationDate.sendKeys("12/25");

        //12. Click on “Process”
        WebElement clickProcess = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        clickProcess.click();

        //13.Verify success message “New order has been successfully added.” is displayed.
        WebElement successMessage = driver.findElement(By.xpath("//strong"));
        Assert.assertTrue(successMessage.isDisplayed(),"message is not displayed");
// driver.close();
    }

    }
