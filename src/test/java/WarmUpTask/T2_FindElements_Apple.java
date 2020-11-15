package WarmUpTask;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T2_FindElements_Apple {
    public static void main(String[] args) {


        //C #02: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to iPhone
        WebElement iPhone = driver.findElement(By.xpath("//a[@class ='ac-gn-link ac-gn-link-iphone']"));
iPhone.click();

        // 4.Print out the texts of all links
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithoutText =0;
        int linksWithText =0;

        for(WebElement eachLink: listOfLinks) {
            String textOfEachLink = eachLink.getText();

            System.out.println(textOfEachLink);

            if (textOfEachLink.isEmpty()) {
                linksWithoutText++;
            } else {
                linksWithText++;
            }
        }
        // 5.Print out how many link is missing text
        System.out.println("The number of the list that has not text: "+ linksWithoutText);

        // 6.Print out how many link has text
        System.out.println("The number of the list that has text: "+ linksWithText);

        // 7.Print out how many total links
        System.out.println("The total links: "+ listOfLinks.size());
    }
}
