package com.cybertek.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
        //1- set up the web driver
        WebDriverManager.chromedriver().setup();

        //2 - create the instance of the driver
        WebDriver driver = new ChromeDriver();

        //3 -- test if driver is working
        driver.get("https://www.google.com");

        System.out.println("The title of the page is: "+driver.getTitle());

        String actualTile =  driver.getTitle();
        System.out.println("ACTUAL TITLE STRING: "+ actualTile);

        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        //System.out.println("actualUrl: "+ actualTile);

      Thread.sleep(2000);


       driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().refresh();

        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");


       // String pageSource = driver.getPageSource();
      // System.out.println("pageSource: "+ pageSource);
        driver.getPageSource();

       driver.manage().window().maximize();
       driver.manage().window().fullscreen();

       //driver.close();
    }
}
