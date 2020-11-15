package com.cybertek.tests.day3_cssSector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_CybertekLinkVertification {
    public static void main(String[] args) {

       // TC #3: PracticeCybertek/ForgotPassword URL verification
     //   1.        Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get(" http://practice.cybertekschool.com/forgot_password");

       // 3.Enter any email into input box
//driver.findElement(By.name("email")).sendKeys("rajminakarmi26@gmail.com");
        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("rajminakarmi26@gmail.com");


        //  4.Click on Retrieve password
//driver.findElement(By.id("form_submit")).click();
WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
retrievePasswordButton.click();


       // 5. Verify URL contains:
        // Expected: “email_sent”
        String expectedUrl = "email_sent";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("verification passed");
        }else{
            System.out.println("verification Failed");
        }


        // 6.Verify textbox displayed the content as expected.
        //  Expected: “Your e-mail’s been sent!”
        //verify the text

        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String actualText = confirmationMessage .getText();
        String expectedText = "Your e-mail's been sent!";

       System.out.println("actualText = " + actualText);
       System.out.println("expectedText = " + expectedText);

        if(actualText.equals(expectedText)){
    System.out.println("header text value verification passed");
}else{
    System.out.println("Header text value Verification Failed");
}


        // verify if the web element is displayed or not

        if(confirmationMessage.isDisplayed()){
            System.out.println("conformation message is displayed ,.passed");
        }else{
            System.out.println("conformation message is displayed ,.failed");
        }
       // Hint: You need to use getText method for this practice.



    }

}
