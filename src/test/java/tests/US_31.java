package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.merchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_31 {

    @Test
    public void TC31_001() {

        // Restaurant yöneticisi browser açar
        // URL'e gider
        merchantPage merchantPage = new merchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Orders" menüsüne tıklar
        merchantPage.ordersMenu.click();

        // "Orders" menüsüne tıkladıktan sonra açılan "All Orders" alt menüsüne tıklar
        merchantPage.allOrdersMenu.click();

        // Açılan sayfada verilen siparişlerde "Order ID", "Customer"(isim bilgileri),
        // "Order Information" (sipariş durumu, ödeme yöntemi, toplam tutar, sipariş
        // tarihi ve sipariş tipi (Pickup, Dine-in vb.) olduğunu kontrol eder

        Assert.assertTrue(merchantPage.orderListHeaderRow.get(0).isDisplayed());
        Assert.assertTrue(merchantPage.orderListHeaderRow.get(1).isDisplayed());
        Assert.assertTrue(merchantPage.orderListHeaderRow.get(2).isDisplayed());
        Assert.assertTrue(merchantPage.orderListHeaderRow.get(3).isDisplayed());
        Assert.assertTrue(merchantPage.orderListHeaderRow.get(4).isDisplayed());

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

        Driver.closeDriver();
    }

    @Test
    public void TC31_002() {
        // Restaurant yöneticisi browser açar
        // URL'e gider
        merchantPage merchantPage = new merchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Orders" menüsüne tıklar
        merchantPage.ordersMenu.click();

        // "Orders" menüsüne tıkladıktan sonra açılan "All Orders" alt menüsüne tıklar
        merchantPage.allOrdersMenu.click();

        // Listedeki siparişin satır sonundaki "Göz" (View) ikonuna tıklar

        merchantPage.viewDetailsButton.get(0).click();

        // Açılan sekmedeki bilgilerin o siparişin detay bilgileri olduğunu kontrol eder

        ReusableMethods.switchToWindow("Order Details");
        Assert.assertTrue(merchantPage.detailedOrderInfoBox.isDisplayed());

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

        Driver.closeDriver();

    }
    @Test
    public void TC31_003() {
        // Restaurant yöneticisi browser açar
        // URL'e gider
        merchantPage merchantPage = new merchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Orders" menüsüne tıklar
        merchantPage.ordersMenu.click();


        // "Orders" menüsüne tıkladıktan sonra açılan "All Orders" alt menüsüne tıklar
        merchantPage.allOrdersMenu.click();

        // Listedeki siparişin satır sonundaki  "İndir" (Download) ikonuna tıklar
        merchantPage.downloadReceiptButton.get(0).click();

        // Sipariş fişinin PDF olarak indirildiğini kontrol eder
        Assert.assertTrue(merchantPage.downloadReceiptButton.get(0).isEnabled());

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

        Driver.closeDriver();
    }

    @Test
    public void TC31_004() {

        // Restaurant yöneticisi browser açar
        // URL'e gider
        merchantPage merchantPage = new merchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Orders" menüsüne tıklar
        merchantPage.ordersMenu.click();


        // "Orders" menüsüne tıkladıktan sonra açılan "All Orders" alt menüsüne tıklar
        merchantPage.allOrdersMenu.click();

        //  Sayfadaki tarih kısmına belirtilen tarih aralığını seçer
        merchantPage.dateFilterTextBox.click();
        merchantPage.dateFilter30Days.click();
        //  Listede o tarihler arasında verilmiş sipariş olduğunu kontrol eder

        Assert.assertFalse(merchantPage.orderIdColoumn.isEmpty());

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

        Driver.closeDriver();
    }

    @Test
    public void TC31_005() {
        // Restaurant yöneticisi browser açar
        // URL'e gider
        merchantPage merchantPage = new merchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));

        //Sisteme giriş yapmak için doğru e-mail ve şifre girip sign in butonuna basar
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();
        ReusableMethods.wait(2);

        // "Dashboard" menüsünün altındaki "Orders" menüsüne tıklar
        merchantPage.ordersMenu.click();


        // "Orders" menüsüne tıkladıktan sonra açılan "All Orders" alt menüsüne tıklar
        merchantPage.allOrdersMenu.click();

        // Sayfanın üst panelinde toplam sipariş sayısı ve toplam kazanç gibi bilgileri olduğunu kontrol eder
        Assert.assertTrue(merchantPage.ordersSummary.isDisplayed());
        Assert.assertTrue(merchantPage.cancelledOrdersSummary.isDisplayed());
        Assert.assertTrue(merchantPage.totalRefundSummary.isDisplayed());
        Assert.assertTrue(merchantPage.totalOrdersSummary.isDisplayed());

        // Sonraki Testin DÜzgün Çalışabilmesi İçin Çıkış Yapılmalı
        merchantPage.profileDropdown.click();
        merchantPage.logOutButton.click();

        Driver.closeDriver();

    }
}
