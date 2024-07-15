package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.UserPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class User_01  {

    @Test
    public void TC_01(){
    //Login Sayfasına Erişim ve Kullanıcının Doğru Bilgilerle Login OLabilmesi

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.

        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));        //Kullanıcı anasayfaya gider, sağ üstte "sign in" linkini görür ve üzerine tıklar


        UserPage userPage = new UserPage();
        userPage.UserSignIn.click();


        //Başlığında "Login" yazan kullanıcı giriş sayfası açılır.



        //Login sayfasının altındaki text box içerisine kullanıcı tıklar ve  kayıtlı olduğu email girer.
        userPage.userName.sendKeys(ConfigReader.getProperty("customeruser_semih"));
        //Ardından hemen altındaki "password text box"ına kayıtlı olduğu şifreyi girer
        userPage.UserPassword.sendKeys(ConfigReader.getProperty("customerPassword"));
        //Şifre yıldızlarla görünmez şekildedir. Kullanıcı şifreyi doğru girdiğinden emin olmak için "password text box"ının yanındaki visible fonksiyonuna tıklar.
        //Şifresini doğru girdiğinden emin olan kullanıcı visible fonksiyonuna tekrar tıklar ve şifresi görünmez olur.
        //Tekrar şifresini girmek istemeyen kullanıcı altta Remember me yazısının yanındaki check box u görür ve işaretler
        //Bilgiler girildiikten sonra kullanıcı Sign in butonuna tıklar.
        //Kullanıcı sayfası görülür ve login olunur
    }




    }


