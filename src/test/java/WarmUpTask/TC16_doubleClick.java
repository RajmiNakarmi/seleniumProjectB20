package WarmUpTask;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
TC	#16:	Double	ClickTest1.Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
2.Switch	to	iframe.
3.Double	click	on	the	text	“Double-click	me	to	change	my	text	color.”
4.Assert:	Text’s	“style”	attribute	value	cont
 */
public class TC16_doubleClick {

    @Test
    public void double_click_test(){
    //Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

      //  2.Switch	to	iframe.
        WebElement nextWindow = Driver.getDriver().findElement(By.id("iframeResult"));
        Driver.getDriver().switchTo().frame(nextWindow);

        //3.Double	click	on	the	text	“Double-click	me	to	change	my	text	color.”
        WebElement doubleClick = Driver.getDriver().findElement(By.id("demo"));

//creating actions instance to be able to use methods that come with it.
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.wait(2);

        //using actions instance, and doubleclick  method to double click.
        actions.moveToElement(doubleClick).doubleClick().perform();

        //.Assert:	Text’s	“style”	attribute	value	cont
        String expected ="red";
        String actualText = doubleClick.getAttribute("style");//color:red;
        Assert.assertTrue(actualText.contains("red"));
        System.out.println("Text changed red on doubleclick");
    }

    /*
    TC	#17:	Context	Click	–HOMEWORK1
    .Go	to	https://the-internet.herokuapp.com/context_menu
    2.Right	click	to	the	box.
    3.Alert	will	open.
    4.Accept	alertNo	assertion	needed	for	this	prac
     */
    @Test
    public void contextClick(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");


       // 2.Right	click	to	the	box.
    WebElement box = Driver.getDriver().findElement(By.id("hot-spot"));

    //Create the instance of actions class, AND pass the driver instance into the constructor
    Actions actions = new Actions(Driver.getDriver());
    BrowserUtils.wait(2);

    //Use the actions object, and call necessary methods.
    actions.contextClick(box).perform();

    BrowserUtils.wait(2);

    //create alert instance and switch to alert
        Alert alert = Driver.getDriver().switchTo().alert();
        // accept alert
        alert.accept();

        BrowserUtils.wait(2);
    }


    /*
  TC	#16:	Hover	Test1.Go	to	https://demos.telerik.com/kendo-ui/dragdrop/index
  2.Drag	and	drop	the	small	circle	to	bigger	circle.
  3.Assert:	-Text	in	big	circle	changedto:	“You	did	grea
     */
    @Test

    public void honver_test(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        BrowserUtils.wait(2);

        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.wait(2);

        actions.dragAndDrop(smallCircle,bigCircle).perform();

        String expectedText = "You did great!";
        String actual = bigCircle.getText();

        Assert.assertTrue(bigCircle.getText().contains(expectedText));


    }
}
