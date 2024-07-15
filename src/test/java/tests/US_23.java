package tests;


import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_23 {

    merchantPage merchantPage = new merchantPage();

    @Test
    public void TC_2301(){

        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.MerchantLoginName.sendKeys(ConfigReader.getProperty("merchant_username"));
        merchantPage.MerchantLoginPassword.sendKeys(ConfigReader.getProperty("merchant_Password"));
        merchantPage.MerchantSignInButton.click();
        //Total Orders\Total Cancel\Total refund\Total Sales ve değerleri güncel olduğu gözlemlenir,



        //Commission this week\ Commission this month\ Subscriptions this month ve değerleri güncel olduğu gözlemlenir,




        //Order received\Today delivered\Today sales\Today refund ve değerleri güncel olduğu gözlemlenir,




        // header >dropdown > logout tuşuna basılır,



    }

    @Test
    public void TC_2302(){

        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.MerchantLoginName.sendKeys(ConfigReader.getProperty("merchant_username"));
        merchantPage.MerchantLoginPassword.sendKeys(ConfigReader.getProperty("merchant_Password"));
        merchantPage.MerchantSignInButton.click();
       //All Last Orders panelinden view butonuna tıklanır,



        //header >dropdown > logout tuşuna basılır,




    }

    @Test
    public void TC_2303(){

        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver getDriver().get(ConfigReader.getProperty("merchant_Url"));
        // Processing tıklanır,
        // Processing Last Orders panelinden view butonuna tıklanır,



        // Adres incelenir, "Assign Driver" butonuna basılır,




        //header >dropdown > logout tuşuna basılır,

    }

    @Test
    public void TC_2304(){

        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver getDriver().get(ConfigReader.getProperty("merchant_Url"));

        // Ready tıklanır,



        //Ready Last Orders panelinden OrderID tıklanır,



        // "Delivered" butonuna basılır,



        //geri butonuna basılır



        //Ready tıklanır,



        //header >dropdown > logout tuşuna basılır,

    }

    @Test
    public void TC_2305(){
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver getDriver().get(ConfigReader.getProperty("merchant_Url"));

        // Completed tıklanır,



        //Completed Last Orders panelinden OrderID tıklanır,




        // "..." dropdown basılır,



        // "Timeline" tıklanır,



        //header >dropdown > logout tuşuna basılır,


    }


    @Test
    public void TC_2306(){

        // username ve password alanına datalar girilir. Sign in butonuna basılır.

        // Popüler items ürün kaç kere sipariş verilmiş incelenir,



        // header >dropdown > logout tuşuna basılır,

    }

    @Test
    public void TC_2307(){

        // username ve password alanına datalar girilir. Sign in butonuna basılır.

        // Last 30 days sales tıklanır,



        // son 30 gün içinde ürün kaç kere sipariş verilmiş incelenir,




        // header >dropdown > logout tuşuna basılır,

    }

    @Test
    public void TC_2308(){
        // username ve password alanına datalar girilir. Sign in butonuna basılır.

        //Top Customers alanında kullanıcı isme tıklanır,




        //header >dropdown > logout tuşuna basılır,


    }
}
