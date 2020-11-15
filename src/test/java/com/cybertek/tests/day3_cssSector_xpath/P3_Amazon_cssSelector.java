package com.cybertek.tests.day3_cssSector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_cssSelector {
    public static void main(String[] args) {


        //  CSSPracticeDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.TC
        //   #3: Amazon link number verification
        //  1. Open Chrome browser
        //   2. Go to https://www.amazon.com
        WebDriver driver = WebDriverFactory.getDriver("chrome");
driver.get("https://www.amazon.com");

        //   3. Enter search term (use cssSelectorto locate search box)
        //WebElement
     //   WebElement searchBox = driver.findElement(By.cssSelector("input[id= 'twotabsearchtextbox']"));
        WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);


//    4. Verify title contains search term
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon.com : wooden spoon";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title contain, verified passed!");
        }else{
            System.out.println("Title contain, verified failed!");

        }


    }
}