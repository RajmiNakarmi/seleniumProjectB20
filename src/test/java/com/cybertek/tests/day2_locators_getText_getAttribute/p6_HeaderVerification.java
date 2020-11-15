package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6_HeaderVerification {

    public static void main(String[] args) {
       // TC #6: Zero Bankheader verification

        // 1.Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 2.Go to http://zero.webappsecurity.com/login.html

        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Verify header textExpected: “Log in to ZeroBank”

        //locate the header
        //get the text
      //driver.findElement(By.tagName("h3"));//find element return web element
       String actualText = driver.findElement(By.tagName("h3")).getText();// return string
       String expectedText = "Log in to ZeroBank";

        if(actualText.equals(expectedText)){
            System.out.println("Header verification PASSED!");

        }else{
            System.out.println("Header verification FAILED!!!");
        }


    }
}
