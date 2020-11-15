package WarmUpTask;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC3_FindElements_Apple {

    public static void main(String[] args) throws InterruptedException {
        //#03: FINDELEMENTS_APPLE
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");

        // 3.Click to all of the headers one by one
        // a.Mac, iPad, iPhone, Watch, TV, Music, Support
        WebElement Mac = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']"));
        Mac.click();
Thread.sleep(1000);

        WebElement iPad = driver .findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-ipad']"));
        iPad.click();
        Thread.sleep(1000);

        WebElement iPhone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        iPhone.click();
        Thread.sleep(1000);

        WebElement Watch = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-watch']"));
        Watch.click();
        Thread.sleep(1000);

        WebElement TV = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-tv']"));
        TV.click();
        Thread.sleep(1000);

        WebElement Music = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-music']"));
        Music.click();
        Thread.sleep(1000);

        WebElement Support = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-support']"));
        Support.click();
        Thread.sleep(1000);


        // 4.Printout how many links on each page with the titles of the pages
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        int linkWithoutTitle =0;
        int linkWithTitle = 0;

        // 5.Loop through all

        for(WebElement eachLinks : listOfLinks){
            String titleOfEachLink = eachLinks.getText();

            System.out.println(titleOfEachLink);

            if(titleOfEachLink.isEmpty()){
                linkWithoutTitle++;
            }else{
                linkWithTitle++;
            }
        }

        // 6.Print out how many link is missing textTOTAL
        System.out.println("The total number of missing link: "+ linkWithoutTitle);

        // 7.Print out how many link has textTOTAL
        System.out.println("The total number of link: "+ linkWithTitle);

        // 8.Print out how many total linkTOTA
        System.out.println(" The total Link: "+ listOfLinks.size());

        Thread.sleep(1000);
        driver.close();
    }
}
