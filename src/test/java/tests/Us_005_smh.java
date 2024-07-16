package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Us_005_smh {

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
        userPage.visiblePassword.click();

        //Şifresini doğru girdiğinden emin olan kullanıcı visible fonksiyonuna tekrar tıklar ve şifresi görünmez olur.
        //userPage.visiblePassword.click();

        //Tekrar şifresini girmek istemeyen kullanıcı altta Remember me yazısının yanındaki check box u görür ve işaretler
        userPage.rememberMeCheckbox.click();

        //Bilgiler girildiikten sonra kullanıcı Sign in butonuna tıklar.
        userPage.UserGiris.click();
        //Kullanıcı sayfası görülür ve login olunur
        ReusableMethods.wait(2);

        Assert.assertTrue(userPage.UserIcon.isDisplayed());

        Driver.getDriver().quit();


    }

    @Test
    public void TC02(){
       // Login Sayfasına Erişim ve Yanlış email ile Login olamaması

        //Kullanıcı tarayıcıyı açar.
        //Kullanıcı e-ticaret sitesinin URL'sini adres çubuğuna yazar ve enter tuşuna basar.

        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));        //Kullanıcı anasayfaya gider, sağ üstte "sign in" linkini görür ve üzerine tıklar


        UserPage userPage = new UserPage();
        userPage.UserSignIn.click();


        //Başlığında "Login" yazan kullanıcı giriş sayfası açılır.

        ReusableMethods.wait(2);
        WebElement cookiesaccept = Driver.getDriver().findElement(By.xpath("//*[@class='el-button el-button--primary el-button--default is-round w-100']"));
        cookiesaccept.click();

        ReusableMethods.wait(2);

        //Login sayfasının altındaki text box içerisine kullanıcı tıklar ve  kayıtlı olduğu emaili yanlış girer.        userPage.userName.sendKeys(ConfigReader.getProperty("customeruser_semih"));
        //Ardından hemen altındaki "password text box"ına kayıtlı olduğu şifreyi girer

        Faker faker = new Faker();

        userPage.userName.sendKeys(faker.internet().emailAddress());
        //Şifre yıldızlarla görünmez şekildedir. Kullanıcı şifreyi doğru girdiğinden emin olmak için "password text box"ının yanındaki visible fonksiyonuna tıklar.
        userPage.visiblePassword.click();

        //Şifresini doğru girdiğinden emin olan kullanıcı visible fonksiyonuna tekrar tıklar ve şifresi görünmez olur.
        userPage.visiblePassword.click();

        //Tekrar şifresini girmek istemeyen kullanıcı altta Remember me yazısının yanındaki check box u görür ve işaretler
        userPage.rememberMeCheckbox.click();

        //Bilgiler girildiikten sonra kullanıcı Sign in butonuna tıklar.
        userPage.UserSignIn.click();
        //Kullanıcı sayfası görülür ve login olunur

        Assert.assertTrue(userPage.UserIcon.isDisplayed());








    }




    }


