package com.cybertek.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelfPractice {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://qa2.vytrack.com/user/login");
        Actions action = new Actions(driver);



String actualTitle = driver.getTitle();
String expectedTitle = "Dashboard";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verified passed");
        }else{
            System.out.println("Verified failed");
        }
Thread.sleep(1000);
   WebElement FleetClick =  driver.findElement(By.cssSelector( "//span[@class='title title-level-1']"));
       FleetClick.click();
        WebElement VehicleOdometerLink =driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]/a/span"));
           VehicleOdometerLink.click();
       try {
            Thread.sleep(1000); //wait 1 second
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       WebElement VehicleOdometer = driver.findElement(By.cssSelector("#container > div.container-fluid.page-title > div > div > div.pull-right.title-buttons-container > a"));
       VehicleOdometer.click();

        WebElement CreateVehicaleOdomter = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[2]/a"));
        CreateVehicaleOdomter.click();

        Thread.sleep(3000);

    }
}
