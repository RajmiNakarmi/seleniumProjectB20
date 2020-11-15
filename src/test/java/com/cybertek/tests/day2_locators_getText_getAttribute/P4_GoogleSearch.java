package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {

//TC#4:	Google	search1
//Open	a	chrome	browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

//Go	to:	https://google.com
        driver.get("https://google.com");

//Write	“apple”	in	search	box
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
//Click	google	search	button

//Verify title:
//Expected:	Title	should	start	with	“apple

        String expectedTitle = "apple - Google Search";
        String actualTile = driver.getTitle();

        if(actualTile.equals(expectedTitle)){
            System.out.println("Search title verification PASSED");
        }else{
            System.out.println("Search title verification FAILED");
        }


    }
}
