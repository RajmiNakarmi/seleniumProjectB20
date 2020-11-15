package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class BritixUtils {

    public static void britixLongin(WebDriver driver){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/stream/");
        WebElement userName = driver.findElement(By.xpath("//input[@class='login-inp']"));
        userName.sendKeys("helpdesk29@cybertekschool.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        WebElement message = driver.findElement(By.xpath("//span[.='Message']/span"));
        message.click();
        BrowserUtils.wait(2);

    }


}
