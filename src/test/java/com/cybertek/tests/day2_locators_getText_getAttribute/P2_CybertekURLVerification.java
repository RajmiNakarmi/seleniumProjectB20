package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
/*
TC #2: Cybertek verifications
1. Open Chrome browser
2. Go to https://practice.cybertekschool.com
3. Verify URL contains
Expected: cybertekschool
4. Verify title:
Expected: Practice
 */
    public static void main(String[] args) {
        //TC #2: Cybertek verifications

        WebDriverManager.chromedriver().setup();

//1. To create instance of chrome browers from WebDriver
        WebDriver driver = new ChromeDriver();

        // this line will maximize the newly open browser page
        driver.manage().window().maximize();

        //Go to https://practice.cybertekschool.com
        driver.get("http://practice.Cybertekschool.com");

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        //Verify URL contains
        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL Verification PASSED");
        }else {






        System.out.println("URL Verification FAILED");
        }
            //Verify title:
            //Expected: Practice
        if(driver.getTitle().equals("Practice")){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED!!!");
        }


    }
}
