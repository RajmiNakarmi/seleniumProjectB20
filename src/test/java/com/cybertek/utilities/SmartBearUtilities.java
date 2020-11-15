package com.cybertek.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtilities {

    //Mini-Task:
    //#1- Create a new class called : SmartBearUtilities
    //#2- Create a static method called loginToSmartBear
    //#3- This method simply logs in to SmartBear when you call it.
    //#4- Accepts WebDriver type as parameter
    public static void loginToSmartBear(WebDriver driver) {
        //3. Enter username: “Tester”

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordInput.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }

/*
Create a method named verifyOrderin SmartBearUtils class.
•Methodt akes WebDriver object and String(name).
•Method should verify if given name exists in orders.
•This method should simply accepts a name(String), and assert whether given name is in the list or not.
•Create a new TestNG test to test if the method is working as expected
 */


        public static void verifyOrder(WebDriver driver, String name) {
            driver = WebDriverFactory.getDriver("Chrome");
            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
            SmartBearUtilities.loginToSmartBear(driver);
            List<WebElement>nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

            //If there is only ine table on the page,you dont hv to locate the table..//tr/td[2]
      //List<WebElement>nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

            for (WebElement each : nameList) {

                if(each.getText().equals(name)){
                    Assert.assertTrue(true);
                    return;
            }

        }
Assert.fail("Name: "+name+" doesnt exist in the list. Verification Failed!!");

    }

/*
Practice #5: Method: printNamesAndCities
•Create a method named printNamesAndCitiesin SmartBearUtils class.
•Method takes WebDriver object.
•This method should simply print all the names in the List of All Orders.
•Create a new TestNG test to test if the method is working as expected.
•Output should be like:•Name1: name ,
City1: city•Name2: name , City2: city
 */


    public static void printNamesAndCities(WebDriver driver){

        //locating all the names from all the rows and storing in a list of web element
        List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

        //we need to locate all the cities from all the rows
        List<WebElement> citiesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[7]"));

        for (int i = 0; i < namesList.size() ; i++) {

            System.out.println("Name"+ (i+1) +": " + namesList.get(i).getText() + ", City"+ (i+1) +": " + citiesList.get(i).getText());

        }

    }

}