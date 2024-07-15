package tests;

import org.testng.annotations.Test;
import pages.adminPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_37 {

    adminPage adminPage=new adminPage();

    @Test
    public void TC_3701(){
        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver getDriver().get(ConfigReader.getProperty("admin_Url"));

        // Merchant dropdown menüsünden List tuşunu görüp tıklanır,

        //search kısmından data aratılır,
        adminPage.merchantSearchBox.sendKeys("SaKa");
        adminPage.merchantSearchButton.click();
        //header >dropdown > logout tuşuna basılır,


    }
    @Test
    public void TC_3702(){
         //username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver getDriver().get(ConfigReader.getProperty("admin_Url"));

         //Merchant dropdown menüsünden List tuşunu görüp tıklanır,

         //Merchant Search edilir,
        adminPage.merchantSearchBox.sendKeys("Team3");
        adminPage.merchantSearchButton.click();
         //Actions kısmından "edit" butonuna basılır,



         //Merchant information sayfasındaki bilgileri incelenir,




        // header >dropdown > logout tuşuna basılır,


    }
    @Test
    public void TC_3703(){

        // username ve password alanına datalar girilir. Sign in butonuna basılır.
        Driver getDriver().get(ConfigReader.getProperty("admin_Url"));

        // Merchant dropdown menüsünden List tuşunu görüp tıklanır,

        // Add new basılır



        //Yeni Merchant bilgileri eklenir,




        //header >dropdown > logout tuşuna basılır,

    }

}
