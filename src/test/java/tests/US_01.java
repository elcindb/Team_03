package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;



public class US_01 {
    @Test
    public void TC_0101() {

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        UserPage userPage = new UserPage();
        Assert.assertTrue(userPage.headerLogo.isDisplayed());
        ReusableMethods.wait(3);
        Driver.closeDriver();
    }
}