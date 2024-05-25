package tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google extends mainFirebox
{
    @Test
    public void Test1() throws InterruptedException
    {


        FirefoxDriver firefoxDriver = new FirefoxDriver();
        //load url
        firefoxDriver.get("https://www.google.com");
        String url=firefoxDriver.getCurrentUrl();
        //print current url
        System.out.println("The current page url:" +url);
        // wait time
        Thread.sleep(1000);
        //refresh the page
        firefoxDriver.navigate().refresh();

    }
}
