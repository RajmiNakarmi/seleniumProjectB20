package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_BackAndForth {
    /*
    TC #3: Back and forth navigation1-Open a chrome browser2-
    Go to: https://google.com3-Click to Gmail from top right.
    4-Verify title contains:Expected: Gmail
    5-Go back to Google by using the .back();
    6-Verify title equals:Expected: Google
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        //3- Click to Gmail from top right.
        // we are locating the "Gmail" link web element using findElement method AND linkText LOCATOR.

        driver.findElement(By.linkText("Gmail")).click();


        //4- Verify title contains:
        //Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();
        driver.navigate().back();

        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Gmail title verification PASSED!");
        }else{
            System.out.println("Gmail title verification FAILED!!!");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6 -verify title equals:
        //Expected: Google

        String expectedGoogleTitle ="Google";
        String actualGoogleTitle = driver.getTitle();

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title verification PASSED!");
        }else{
            System.out.println("Google title verification FAILED!!!");
        }



    }
}
