package com.cybertek.tests.day4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_CheckboxPractice {
    public static void main(String[] args) throws InterruptedException {

        //Practice:	Cybertek	Checkboxes
                // 1.Go	to	http://practice.cybertekschool.com/checkboxes
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
             driver.get("http://practice.cybertekschool.com/checkboxes");

             // locating the first checkbox
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id ='checkboxes']/input[1]"));

        // locating the second checkbox
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id ='checkboxes']/input[2]"));


        // 2.Confirm	checkbox	#1	is	NOT	selected	by	default
if(!checkbox1.isSelected()){
    System.out.println("checkBox is not selected. verification passed");
}else{
    System.out.println("checkBox is  selected. verification Failed");
}

        // 3.Confirm	checkbox	#2	is	SELECTED	by	default.
  if(checkbox2.isSelected()){
      System.out.println("checkbox is selected. verification passed");
  }else{
      System.out.println("checkbox is not selected. verification Failed");
  }

        // 4.Click	checkbox	#1	to	select	it.
        Thread.sleep(1000);
        checkbox1.click();

        // 5.Click	checkbox	#2	to	deselect	it.
        Thread.sleep(1000);
        checkbox2.click();

        // 6.Confirm	checkbox	#1	is	SELECTED.
        if(checkbox1.isSelected()){
            System.out.println("checkBox1 is  selected. verification passed");
        }else{
            System.out.println("checkBox1 is  not selected. verification Failed");
        }
        // 7.Confirm	checkbox	#2	is	NOT

        if(!checkbox2.isSelected()){
            System.out.println("checkBox2 is not selected. verification passed");
        }else{
            System.out.println("checkBox2 is  selected. verification Failed");
        }
    }
}
