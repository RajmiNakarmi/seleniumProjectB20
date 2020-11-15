package WarmUpTask;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_FindElement {
    public static void main(String[] args) {

//TC #3: PracticeCybertek.com_AddRemoveElements WebElement verification
// 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

// 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get(" http://practice.cybertekschool.com/add_remove_elements/");

// 3. Click to “Add Element” button 50 times

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick ='addElement()']"));
        // addElement.click();
        for (int click = 0; click <= 50; click++) {
            addElement.click();
            System.out.println("Click on add button" + click);
        }

// . Verify 50 “Delete” button is displayed after clicking.

        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        deleteButton.click();
        for (int delete = 0; delete <= 50; delete++) {

            System.out.println("Delete: " + delete);
        }


// 5. Click to ALL “Delete” buttons to delete them.
int deleteButtons =0;
        List<WebElement> listOfDelete = driver.findElements(By.xpath("//button[@id='elements']/button"));
for(WebElement eachButton: listOfDelete){
    String deleteAllButton = eachButton.getText();

    System.out.println(deleteAllButton);

    if(deleteAllButton.equals("Delete")){
        deleteButtons++;
    }
}
}



// 6. Verify “Delete” button is NOT displayed after clicking.


    }
