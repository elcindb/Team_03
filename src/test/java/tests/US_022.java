package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US_022 {

    merchantPage merchantPage = new merchantPage();
    SoftAssert softAssert=new SoftAssert();


    @Test
    public void TC_2201() {

//First Name and Last Name change test,

        // username ve password alanına datalar girilir. Sign in butonuna basılır.

        //Dashboard sayfasında header'ın sağ üst kısımda görüntülenir.

        //Dropdown'a tıklanır.

        //Kullanıcı profile'e tıklanır.

        //First Name/ Last Name değiştirilir,


        //Save tuşuna basılır,


        //header >dropdown > logout tuşuna basılır,

    }

    @Test
    public void TC_2202(){

        //username ve password alanına datalar girilir. Sign in butonuna basılır.

        //Dashboard sayfasında header'ın sağ üst kısımda görüntülenir.

        //Dropdown'a tıklanır.

        //Kullanıcı profile'e tıklanır.
        //Profil görseli değiştirilmek için "Browse" tıklanır,
        //Upload New kısmına tıklanır,
        //Select Files tıklanır
        //Görsel seçilir,
        //"Open" butonuna basılır,
        //Select Files tıklanır
        //Yüklenen fotoğraf seçilir,
        //"Add Files" butonuna basılır,
        //Save tuşuna basılır,
         //header >dropdown > logout tuşuna basılır,



    }

    @Test
    public void TC_2203(){

        // username ve password alanına datalar girilir. Sign in butonuna basılır.

        //Dashboard sayfasında header'ın sağ üst kısımda görüntülenir.

        //Dropdown'a tıklanır.

        //Kullanıcı profile'e tıklanır.
        //Change Password tıklanır,
        //Old Password girilir
        //New Password girilir
        //Confirm New Password girilir,
        //Save tuşuna basılır,
        // header >dropdown > logout tuşuna basılır,


    }




}
