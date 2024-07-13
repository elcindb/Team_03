package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;



public class US_01 {
    @Test
    public void TC_0101() {

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        userPage userPage = new userPage();
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
}