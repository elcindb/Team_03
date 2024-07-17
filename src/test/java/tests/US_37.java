package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.adminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_37 {


    @Test
    public void TC_3701(){

        adminPage adminPage =new adminPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("admin_Url"));
        adminPage.UserNameTextBox.sendKeys(ConfigReader.getProperty("adminuser_gozde"));
        adminPage.PasswordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.SignInButton.click();

        // Merchant dropdown menüsünden List tuşunu görüp tıklanır,
        adminPage.merchantMenu.click();
        adminPage.merchantListMenu.click();

        ReusableMethods.wait(2);
        //search kısmından data aratılır,
        adminPage.merchantSearchBox.sendKeys("SaKa");
        adminPage.merchantSearchButton.click();
        ReusableMethods.wait(5);
        //header >dropdown > logout tuşuna basılır,
        Driver.closeDriver();


    }
    @Test
    public void TC_3702(){
        adminPage adminPage =new adminPage();
        //username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("admin_Url"));
        adminPage.UserNameTextBox.sendKeys(ConfigReader.getProperty("adminuser_gozde"));
        adminPage.PasswordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.SignInButton.click();

        //Merchant dropdown menüsünden List tuşunu görüp tıklanır,
        adminPage.merchantMenu.click();
        adminPage.merchantListMenu.click();

        ReusableMethods.wait(2);
        //Merchant Search edilir,
        adminPage.merchantSearchBox.sendKeys("Team3");
        adminPage.merchantSearchButton.click();
        ReusableMethods.wait(5);
        // header >dropdown > logout tuşuna basılır,
        Driver.closeDriver();

    }
    @Test
    public void TC_3703(){
        adminPage adminPage =new adminPage();

        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("admin_Url"));
        adminPage.UserNameTextBox.sendKeys(ConfigReader.getProperty("adminuser_gozde"));
        adminPage.PasswordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminPage.SignInButton.click();
        // Merchant dropdown menüsünden List tuşunu görüp tıklanır,

        adminPage.merchantMenu.click();
        adminPage.merchantListMenu.click();
        ReusableMethods.wait(2);

        // Add new basılır
        Assert.assertTrue(adminPage.addNewMerchantButton.isEnabled());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        Driver.closeDriver();
    }

}
