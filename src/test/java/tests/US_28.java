package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.merchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_28 {
    @Test
    public void TC_2801(){
        merchantPage merchantPage = new merchantPage();
    // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //Sol menüden Orders > Orders Ready butonuna tıklanır.
        merchantPage.ordersMenu.click();

        merchantPage.ordersReadySideBarMenu.click();

        //search kısmından arama yapılır
        merchantPage.orderSearchBox.sendKeys("gozde gokdeniz");
        ReusableMethods.wait(2);
        //Order Ready Listesinden çıkan sonuça tıklanır,
        Assert.assertTrue(merchantPage.newOrderInfoBox.isDisplayed());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();
    }

    @Test
    public void TC_2802(){
        merchantPage merchantPage = new merchantPage();

        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //Sol menüden Orders > Orders Ready butonuna tıklanır.
        merchantPage.ordersMenu.click();
        merchantPage.ordersReadySideBarMenu.click();
        ReusableMethods.wait(2);
        //"Assign Driver" tuşuna basılır,
        Assert.assertTrue(merchantPage.assignDriverButton.isEnabled());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();
    }

    @Test
    public void TC_2803(){
        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //Sol menüden Orders > Orders Ready butonuna tıklanır.
        merchantPage.ordersMenu.click();
        merchantPage.ordersReadySideBarMenu.click();
        ReusableMethods.wait(2);
        //DELİVERY FAİLED tıklanır,
        Assert.assertTrue(merchantPage.deliveryFailedButton.isEnabled());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();


    }
    @Test
    public void TC_2804(){
        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //Sol menüden Orders > Orders Ready butonuna tıklanır.
        merchantPage.ordersMenu.click();
        merchantPage.ordersReadySideBarMenu.click();
        ReusableMethods.wait(2);
        // "Delivered" tuşuna basılır,
        merchantPage.deliveredButton.click();
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

    }
}
