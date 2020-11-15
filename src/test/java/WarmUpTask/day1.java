package WarmUpTask;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

       String actualTitle = driver.getTitle();
        System.out.println("ACTUAL TITLE: "+ actualTitle);


                       driver.get("https://www.cybertekschool.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        System.out.println("actualTitle = " + actualTitle);


    }

}
