package com.cybertek.Library;


import com.cybertek.tests.day10_testbase_properties.ConfigurationReader;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test_Login_Page {


    @Test (description = "entering valid credential")
    public void login_library(){

       Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.getProperty("library_username");

        loginPage.usernameInput.sendKeys(username);
        BrowserUtils.wait(2);

        String password = ConfigurationReader.getProperty("library_password");
        loginPage.passwordInput.sendKeys(password);
        BrowserUtils.wait(2);

        loginPage.loginButton.click();
        BrowserUtils.wait(2);

        loginPage.BookModule.click();
        BrowserUtils.wait(2);

        loginPage.BookCategories.click();
        BrowserUtils.wait(2);

        Select select = new Select(loginPage.BookCategories);
        BrowserUtils.wait(2);

        loginPage.BookCategories.click();
        BrowserUtils.wait(2);

        select.selectByVisibleText("Fairy Tale");
        loginPage.BookCategories.click();
        BrowserUtils.wait(6);

        Driver.getDriver().close();



    }
}
