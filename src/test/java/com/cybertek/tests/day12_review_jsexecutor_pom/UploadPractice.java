package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {

            @Test
            public void uploading_file_test(){
                Driver.getDriver().get("http://practice.cybertekschool.com/upload");
                Driver.getDriver().manage().window().maximize();

                String path = "C:\\Users\\rajmi\\Desktop\\baba\\6080430_f496.jpg";

                WebElement uploadInput = Driver.getDriver().findElement(By.id("file-upload"));

// send the path of the file to uploadInput Element
                BrowserUtils.wait(3);
                uploadInput.sendKeys(path);

                WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
                BrowserUtils.wait(3);
                uploadButton.click();
            }
        }



