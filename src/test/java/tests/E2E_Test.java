package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.adminPage;
import pages.merchantPage;
import pages.userPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class E2E_Test {

    @Test
    public void E2E_test(){

        userPage userPage = new userPage();
        merchantPage merchantPage = new merchantPage();

        //Suite1
        //Loksayon Girerek Restoran görüntüleme
        //Kullanıcı siteye giriş yapar.
        Driver.getDriver().get(ConfigReader.getProperty("customer_Url"));

        //Lokasyon bölümüne California girer.
        //Lokasyona görerestoranlar sayfası görüntülenir.
        userPage.anasayfaLokasyonAramaKutusu.sendKeys("California");
        userPage.ListedDeliveryAdress.click();

        //Suite2 Filtreleme Fonksiyonuyla Restoran Seçimi
        //Filter kısmından "Most Popular" ı seçer.
        //Cuisines bölümünden Fast Food u seçer.
        userPage.MostPopular.click();
        userPage.FasFood.click();
        ReusableMethods.wait(1);
        //Team 03 Restoranı seçer
        userPage.Team3Restaurant.click();

        //US 11 - TC 18
        //Suite3 Seçilen Restorandan Yemek Seçimi ve sepete ekleme
        //Açılan restoran sayfasından Iskender isimli yemeğe gelir, add to cart butonuna tıklar.
        userPage.iskenderAddToCart.click();
        ReusableMethods.wait(1);

        //Açılan ekrandan adet sayısını artırarak 6 yapar.
        for (int i = 1; i < 5; i++) {
            userPage.adetArttir.click();
            ReusableMethods.wait(1);
        }

        //Tekrardan add to cart butonuna tıklar.
        userPage.AddToCardOnOpenedModal.click();
        //Açılan sayfada checkout butonuna tıklar
        userPage.checkoutbutonu.click();
        ReusableMethods.wait(1);

        //
        //Suite4 Login
        //Acilan Login sayfasinda bilgileriyle giris yapar
        userPage.userNameTextBox.sendKeys(ConfigReader.getProperty("customeruser_emrah"));
        userPage.userPasswordTextBox.sendKeys(ConfigReader.getProperty("customerPassword")+ Keys.ENTER);
        ReusableMethods.wait(2);


        //Suite5 Sipariş verme
        //Açılan sayfada kayıtlı olduğu bilgiler görünür.
        Assert.assertEquals(userPage.userPhoneNumber.getText(), ConfigReader.getProperty("userPhoneNumber"));

        //Kayıtlı bilgileriyle sağ kısımda place order butonuna tıklar.
        userPage.placeOrderButton.click();

        //Sipariş durumunu göreceği sayfa görüntülenir
        Assert.assertTrue(userPage.ConfirmyourOrder.isDisplayed());
        String OrderID = userPage.confirmedOrderID.getText();

        //Suite6 Sipariş Kontrolü
        //Kullanıcı sağ üstte profil ismine tıklar.
        userPage.userDropDownMenu.click();

        //Açılan drop-down menüden My Orders bölümüne tıklar.
        userPage.userDropdownMyOrders.click();
        System.out.println(userPage.userOrderID1.getText());
        ReusableMethods.wait(2);

        //Açılan Sayfadaki Siparişler listesinden en son vermiş olduğu en üstteki siparişi gelir.
        Assert.assertTrue(userPage.userOrderID1.getText().contains(OrderID));

        //Detayları kontrol etmek için siparişin en sağında buluna üç noktaya tıklar ve
        //view bölümüne tıklayarak detayları görüntüler.
        userPage.userOrdersUcNokta.click();
        userPage.userOrdersView.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(userPage.viewOrderDetailsOrderID.getText()
                .contains(OrderID));


        //Suite7 Sipariş iptali

        //Kullanici adet arttirmak ister
        //Order details menusunu kapatmak icin kosedeki X isaretine basar.
        userPage.viewOrderDetailsCloseButton.click();

        // sipariş sağındaki üç noktaya tıklayarak açılan menüden cancel order'a tıklar.
        userPage.userOrdersUcNokta.click();
        userPage.userDropdownCancelOrders.click();
        ReusableMethods.wait(1);


        //Açılan "Are you sure?" başlıklı ekranda cansel order butonuna tıklayaraj onay verir.
        userPage.userOrdersCancelButton.click();
        ReusableMethods.wait(2);

        //Suite8 Buy Again
        //Açılan siparişler sayfasında "cancelled" olarak görülen sipariş satırındaki üç noktaya tıklar.
        userPage.userOrdersUcNokta.click();

        //Açılan menüde "Buy again" bölümüne tıklar.
        userPage.userDropdownBuyAgain.click();

        //Açılan yan sepet kısmında 1 adet arttirarak "Go to checkout" butonuna tıklar.
        userPage.adetArttir.click();
        ReusableMethods.wait(3);
        userPage.userGoToCheckout.click();
        ReusableMethods.wait(3);

        //Sağ kısımdaki "Place Order" butonuna tıklar.
        userPage.placeOrderButton.click();
        ReusableMethods.wait(2);

        //Sipariş durumunu göreceği sayfa görüntülenir
        Assert.assertTrue(userPage.ConfirmyourOrder.isDisplayed());

        //Suite9 Merchant Admin girişi
        //Merchant login sayfasında sisteme kayıtlı olan bilgileriyle giris yapar
        Driver.getDriver().get(ConfigReader.getProperty("merchant_Url"));
        merchantPage.merchantLoginUsername.sendKeys(ConfigReader.getProperty("merchantuser_team3"));
        merchantPage.merchantLoginPassword.sendKeys(ConfigReader.getProperty("merchantPassword"));
        merchantPage.merchantLoginButton.click();

        //Açılan dashboard sayfasında bulunan "Last Orders" kısmındaki ilgili siparişin
        //sağ kısmında bulunan göz işaretine tıklayarak sipariş detaylarını görür
        merchantPage.merchantLastOrdersFirstOrderObserve.click();
        ReusableMethods.wait(2);

        //Sipariş durumunu ilerleterek siparişi "Delivered" yapar ve
        //sipariş müşteriye teslim edilmiş olur
        merchantPage.orderAcceptButton.click();
        ReusableMethods.wait(3);
        merchantPage.readyForPickupButton.click();
        ReusableMethods.wait(3);
        merchantPage.deliveryOnWayButton.click();
        ReusableMethods.wait(3);
        merchantPage.deliveredButton.click();


    }
}
