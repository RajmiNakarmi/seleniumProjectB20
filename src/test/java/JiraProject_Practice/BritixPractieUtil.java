package JiraProject_Practice;

import com.cybertek.utilities.BritixUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BritixPractieUtil {
WebDriver driver;
   @Test
    public void setUpMethod(){
       BritixUtils.britixLongin(driver);

   }
}
