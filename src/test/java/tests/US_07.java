package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class US_07 {
    pages.userPage userPage = new userPage();

    @Test
    public void yetkililereUlasabilmeTesti(){

        //Kullanıcı anasayfaya gider sayfanın en atında yer alan Contact Us linkine tıklar
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));
        Actions actions=new Actions(Driver.getDriver());
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN)
                .perform();
        ReusableMethods.wait(2);
        userPage.contactUsButton.click();

        Faker faker=new Faker();

        //Açılan sayfada isim soy isim ve mail bilgilerini girer.
        userPage.fullNameTextBox.click();
        actions.sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("customeruser_mahmut"))
                .sendKeys(Keys.TAB).
                sendKeys("restoranlar çok kötü yemekler çok kötü")
                        .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
        //Kendine ait bilgileri doğru bir şekilde girdikten sonra Submit tuşuna tıklar
                .sendKeys(Keys.ENTER).perform();
        //"Mesajı başarılı bir şeklide iletilen kullanıcını Your request has been sent. Uyarısını alır

        Assert.assertTrue(userPage.RequestHasBeenSentAlert.isDisplayed());


        Driver.getDriver().quit();


    }


}
