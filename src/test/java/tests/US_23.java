package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.merchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_23 {
    merchantPage merchantPage = new merchantPage();

    @Test
    public void TC_2301(){

        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //Total Orders\Total Cancel\Total refund\Total Sales ve değerleri güncel olduğu gözlemlenir,
        Assert.assertTrue(merchantPage.merchantSummaryOneDataList.get(0).isDisplayed());
        Assert.assertTrue(merchantPage.merchantSummaryOneDataList.get(1).isDisplayed());
        Assert.assertTrue(merchantPage.merchantSummaryOneDataList.get(2).isDisplayed());
        Assert.assertTrue(merchantPage.merchantSummaryOneDataList.get(3).isDisplayed());
        ReusableMethods.wait(2);
        //Commission this week\ Commission this month\ Subscriptions this month ve değerleri güncel olduğu gözlemlenir,
        Assert.assertTrue(merchantPage.merchantSummaryTwo.isDisplayed());
        ReusableMethods.wait(2);
        //Order received\Today delivered\Today sales\Today refund ve değerleri güncel olduğu gözlemlenir,
        Assert.assertTrue(merchantPage.merchantSummaryThree.isDisplayed());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

    }

    @Test
    public void TC_2302(){
        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //All Last Orders panelinden view butonuna tıklanır,
        Assert.assertTrue(merchantPage.viewDetailsButton.get(0).isEnabled());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

    }

    @Test
    public void TC_2303(){
        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        // Processing tıklanır,
        merchantPage.merchantLastOrdersProcessingButonu.click();
        ReusableMethods.wait(2);
        // Processing Last Orders panelinden view butonuna tıklanır,
        merchantPage.viewDetailsButton.get(0).click();
        Assert.assertTrue(merchantPage.assignDriverButton.isEnabled());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();
    }

    @Test
    public void TC_2304(){
        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        // Ready tıklanır,
        merchantPage.merchantLastOrdersReadyButonu.click();
        ReusableMethods.wait(2);
        //Ready Last Orders panelinden OrderID tıklanır,
        Assert.assertTrue(merchantPage.cutomerPPColoumn.get(0).isEnabled());

        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();
    }




    @Test
    public void TC_2305(){
        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        // Popüler items ürün kaç kere sipariş verilmiş incelenir,
        Assert.assertTrue(merchantPage.merchantPopularItemsFirstLinePuchaseQuantity.isEnabled());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

    }

    @Test
    public void TC_2306(){
        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        // Last 30 days sales tıklanır,
        merchantPage.merchantPopularItemsLast30DaysButonu.click();
        ReusableMethods.wait(2);
        //istatistikler görünmeli,
        Assert.assertTrue(merchantPage.merchantPopularItemsLast30DaysStatics.isEnabled());
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();
    }

    @Test
    public void TC_2307(){
        merchantPage merchantPage = new merchantPage();
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        //Top Customers alanında kullanıcı isme tıklanır,
        Assert.assertTrue(merchantPage.getMerchantTopCustomersFirstCustomerName.isEnabled());
        ReusableMethods.wait(2);
        //header >dropdown > logout tuşuna basılır,
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

    }


}
