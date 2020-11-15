package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {
    public static void main(String[] args) {
        /*
        1. Ope
        n Chrome browser
        2. Go to https://www.google.com
        3. Verify title:
            Expected: Google
         */

        WebDriverManager.chromedriver().setup();
        // if you are using browser drivers locally, you need to use System.setProperty everytime
        // we use WebDriverManager


        // open a chrome browser
        // we create the instance of the ChromeDriver, which also opens an empty browser for us
        WebDriver driver = new ChromeDriver();


       // 2. Go to https://www.google.com
        driver.get("https://www.google.com");

        //3. Verify title:
        //            Expected: Google
        // this step is very important for the testers to verify expected result vs actual result.

        String expectedTitle ="Google";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");

        }else{
            System.out.println("Title verification FAILED");
        }


    }
}
