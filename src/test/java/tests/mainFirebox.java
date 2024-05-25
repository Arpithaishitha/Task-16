package tests;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class mainFirebox {
    FirefoxDriver firefoxDriver;

    @BeforeTest
    public void setup() {
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        // close the firefox
        firefoxDriver.quit();
    }
}
