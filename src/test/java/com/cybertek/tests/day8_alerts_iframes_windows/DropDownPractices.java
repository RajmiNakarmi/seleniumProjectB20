package com.cybertek.tests.day8_alerts_iframes_windows;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        SmartBearUtilities.loginToSmartBear(driver);
    }
    @Test
    public void p7_month_dropdown_default_value_test(){
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));

        //Expected
        //Used to get dynamically LocatDateTime to get currrent month from localDateTime java class
        String expectedValue = LocalDateTime.now().getMonth().name();
        System.out.println("expectedValue= "+ expectedValue);
        //Actual
        String actualValue = monthDropdown.getFirstSelectedOption().getText();
        System.out.println("actualValue= "+ actualValue);
        //Assert
        //First way of doing this assertion: use.to lowercase()method for both actual ad expected values
        Assert.assertEquals(actualValue.toLowerCase(),expectedValue.toLowerCase());
        //Second way: use equalIgnoreCase
        Assert.assertTrue(actualValue.equalsIgnoreCase(expectedValue));

        //Task8
        //This line gets all of the options from the dropdown and store the value in a list
        List<WebElement> actualMonthOptions = monthDropdown.getOptions();

        //Creating a list of strings to store months
        List<String> expectedMonthOptions = Arrays.asList("January", "February", "March", "April", "May", "June", "July",
                "August","September","October", "November", "December");
        BrowserUtils.wait(5);

        //Create a new list of Strings called: actualMonthsTexts , and store the texts of web elements into this new list
//        List<String> actualMonthsTexts = new ArrayList<>();
//
//        for (WebElement each : actualMonthOptions) {
//
//            actualMonthsTexts.add(each.getText());
//
//        }


        //Passing List into assertions:
        //First it will check the size, then it will check the content
        Assert.assertEquals(BrowserUtils.getElementsText(actualMonthOptions), expectedMonthOptions);

    }

}
