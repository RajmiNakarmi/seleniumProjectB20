package com.cybertek.pages;

import org.testng.annotations.Test;

public class PageObjectModelPractice {
    @Test
    public void Login_to_smartbear(){
        LoginPage loginPage = new LoginPage();
        //GET URL -- smartbear

        loginPage.usernameInput.sendKeys("anyusername");
    }

}
