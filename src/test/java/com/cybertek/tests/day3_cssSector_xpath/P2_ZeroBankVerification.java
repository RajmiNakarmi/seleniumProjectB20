package com.cybertek.tests.day3_cssSector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_ZeroBankVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");


        // 3.Verify link text from top left:
        // Expected: “Zero Bank”

        WebElement zeroBankLinkTopLeft = driver.findElement(By.className("brand"));
       String expectedLinkText = "Zero Bank";
       String actualLinkText = zeroBankLinkTopLeft.getText();

       if(actualLinkText.equals(expectedLinkText)){
           System.out.println("Link verification Passed");
       }else{
            System.out.println("Link verification failed");
        }

        // 4.Verify link href attribute value contains:
        // Expected: “index.html”

        String expectedInHref ="index.html";
        String actualInHref = zeroBankLinkTopLeft.getAttribute("href");

       if(actualInHref.contains(expectedInHref)){
           System.out.println("Href verification passed");
       }else{
           System.out.println("Href verification failed");
       }
    }
}
