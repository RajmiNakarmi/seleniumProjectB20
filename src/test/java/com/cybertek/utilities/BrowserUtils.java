package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/*
In this class we will store untility  methods that can be applied  any browser content
Anytime you feel like you have a good logic that you can use in the future,
create a method of it and store it in the code
 */
public class BrowserUtils {

    /**
     * Accepts a list of Web Element
     *
     * @param list
     * @return List<String>
     * Method should be returning a list of Strings
     */
    public static List<String> getElementsText(List<WebElement> list) {

        List<String> webelementsAsString = new ArrayList<>();

        for (WebElement each : list) {
            webelementsAsString.add(each.getText());
        }
        return webelementsAsString;

    }

    public static void wait(int sec) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}