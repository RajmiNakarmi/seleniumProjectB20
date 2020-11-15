package WarmUpTask.forMySelfPractice;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CybertekRegistrationFrom {

    WebDriver driver;

    @BeforeMethod
    public void setDriver(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/registration_form");
    }
    @Test
    public void form() throws InterruptedException {
        Faker faker = new Faker();
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(faker.name().username().replace(".",""));
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());
        WebElement phNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phNumber.sendKeys(faker.phoneNumber().phoneNumber().replace(".","-"));

        WebElement genderCheckBox = driver.findElement(By.xpath("//input[@value='male']"));
        genderCheckBox.click();

        WebElement dob = driver.findElement(By.xpath("//input[@name='birthday']"));
        dob.sendKeys("11/14/1979");
Thread.sleep(2000);
        //Select for dropDown
        Select departmentOffice= new Select(driver.findElement(By.xpath("//select[@name ='department']")));
    departmentOffice.selectByValue("DE");
        Thread.sleep(1000);
    Select jobTilte = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
    jobTilte.selectByVisibleText("SDET");
        Thread.sleep(1000);
    WebElement progLanguage = driver.findElement(By.xpath("//input[@id='inlineCheckbox2']"));
    progLanguage.click();
Thread.sleep(1000);
    WebElement signUpBotton = driver.findElement(By.xpath("//button[@id='wooden_spoon']"));
    signUpBotton.click();
        Thread.sleep(2000);

        driver.close();
    }
}
