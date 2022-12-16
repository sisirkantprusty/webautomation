package testcases;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.TC1HomePage;

public class TC_TC1 extends TestBase {
    TC1HomePage tc1HomePage;
    @Test
    public void first_TC1() throws InterruptedException {
        tc1HomePage = new TC1HomePage(dr);
        Thread.sleep(5000);
        tc1HomePage.clickAcceptAll();
        tc1HomePage.clickSignOn();


        Assert.assertTrue(true);
    }
}
