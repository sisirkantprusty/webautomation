package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public static WebDriver dr;
    public String browser = "chrome";
    public String url = "https://demo.guru99.com/test/newtours/login.php";

public void setUpChromeBrowser(){
    System.setProperty("webdriver.chrome.driver",
            System.getProperty("user.dir") + "/src/test/resources/chrome_driver/chromedriver");
    dr = new ChromeDriver();
    dr.manage().window().maximize();
    System.out.println("Chrome driver initialized");
}
@BeforeMethod
    public void initializeTest(){
        if (browser.equalsIgnoreCase("chrome")){
            setUpChromeBrowser();
        }

        dr.get(url);
    }

}
