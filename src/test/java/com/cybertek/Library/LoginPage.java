package com.cybertek.Library;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage (){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id ="inputEmail")
    public WebElement usernameInput;

    @FindBy(id ="inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath ="//button[.='Sign in']")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/header/nav/div/ul[1]/li[3]/a")
    public WebElement BookModule;

    @FindBy(id = "book_categories")
    public WebElement BookCategories;



    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}
