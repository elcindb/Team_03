package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class merchantPage {

    public merchantPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //>>>Sidebar Dashboard Menu
    @FindBy(xpath = "//li[@class='merchant_dashboard active']")
    public WebElement dashboardMenu;

    //>>>Sidebar Merchant Menu
    @FindBy(xpath = "//li[@class='merchant']")
    public WebElement merchantMenu;

    //>>Sidebar Merchant Relative Information Menu
        @FindBy(xpath = "//li[@class='position-relative merchant_edit']")
        public WebElement merchInformationMenu;

            //> Relative Information Merchant Information Menu
            @FindBy(xpath = "(//ul[@class='attributes-menu']//li)[1]")
            public WebElement merchInformationSubMenu;

                // Merchant Information Restaurant Name
                @FindBy(xpath ="//*[@id='AR_merchant_restaurant_name']" )
                public WebElement restaurantNameTextBox;

                // Merchant Information Restaurant Slug
                @FindBy(xpath = "AR_merchant_restaurant_slug")
                public WebElement restaurantSlugTextBox;

                // Merchant Information Contact Name
                @FindBy(xpath = "AR_merchant_contact_name")
                public WebElement contactNameTextBox;

                // Merchant Information Contact Phone
                @FindBy(xpath = "AR_merchant_contact_phone")
                public WebElement contactPhoneTextBox;

                // Merchant Information Contact Email
                @FindBy(xpath = "AR_merchant_contact_email")
                public WebElement contactEmailTextBox;

                // Merchant Information Logo Browse Button
                @FindBy(xpath = "(//button[@class='btn btn-info'])[1]")
                public WebElement logoBrowseButton;

                // Merchant Information Header Browse Button
                @FindBy(xpath = "(//button[@class='btn btn-info'])[2]")
                public WebElement headerBrowseButton;

                //Merchant Information About Text Area
                @FindBy(xpath = "//div[@class='note-editable card-block']")
                public WebElement aboutTextBox;

                // Merchant Information Short About Area
                @FindBy(xpath = "//*[@id='AR_merchant_short_description']")
                public WebElement shortAboutTextBox;

                // Merchant Information Cousine
                @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[1]")
                public WebElement cousineBox;

                // Merchant Information Services
                @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[2]")
                public WebElement servicesBox;

                // Merchant Information Tags
                @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[3]")
                public WebElement tagsBox;

                // Merchant Information Featured
                @FindBy(xpath = "(//*[@class='select2-selection select2-selection--multiple'])[4]")
                public WebElement featuredBox;

                //Merchant Information Delivery Distance TextBox
                @FindBy(xpath = "//*[@id='AR_merchant_delivery_distance_covered']")
                public WebElement deliveryDistanceTextBox;

                // Merchant Information Published Merchant
                @FindBy(xpath = "//*[@id='is_ready']")
                public WebElement isPublishedCheckBox;

                // Merchant Information Save Button
                @FindBy(xpath = "//*[@class='btn btn-green btn-full']")
                public WebElement merchantInformationSaveButton;

            //> Relative Information Login Information Menu
            @FindBy(xpath = "(//ul[@class='attributes-menu']//li)[2]")
            public WebElement loginInformationSubMenu;

            //> Relative Information Adress Menu
            @FindBy(xpath = "(//ul[@class='attributes-menu']//li)[2]")
            public WebElement adressSubMenu;



        //>>Sidebar Merchant Relative Settings Menu
        @FindBy(xpath = "//li[@class='position-relative merchant_settings']")
        public WebElement merchSettingsMenu;


        //>>Sidebar Merchant Relative Order Limit Menu
        @FindBy(xpath = "position-relative merchant_time_management")
        public WebElement merchOrderLimitMenu;

        //>>Sidebar Merchant Relative Banner Menu
        @FindBy(xpath = "//li[@class='position-relative merchant_banner']")
        public WebElement merchBannerMenu;

        //>>Sidebar Merchant Relative Pages Menu
        @FindBy(xpath = "position-relative merchant_pages_list")
        public WebElement merchPagesMenu;

        //>>Sidebar Merchant Relative Menu Menu
        @FindBy(xpath = "//li[@class='position-relative merchant_pages_menu']")
        public WebElement merchMenuMenu;
//> Relative Information Login  Menu

    //Relative Information Login First Name Textbox
    @FindBy(xpath = "//*[@name='AR_merchant_user[first_name]']")
    public WebElement merchantinformationloginfirstname;

    //Relative Information Login First Name Textbox
    @FindBy(xpath = "//*[@name='AR_merchant_user[last_name]']")
    public WebElement merchantinformationloginlastname ;


    //Relative Information Login Last Name Textbox
    @FindBy(xpath = "//*[@name='AR_merchant_user[contact_email]']")
    public WebElement merchantinformationloginemail ;

    //Relative Information Login Telephone Textbox
    @FindBy(xpath = "//*[@name='AR_merchant_user[contact_number]']")
    public WebElement merchantinformationlogintelephone;

    //Relative Information Username Textbox
    @FindBy(xpath = "//*[@for='AR_merchant_user_username']")
    public WebElement merchantinformationloginusername ;

    //Relative Information Login Nre Password Textbox
    @FindBy(xpath = "//*[@for='AR_merchant_user_new_password']")
    public WebElement merchantinformationloginnewpassword;

    //Relative Information Login Confirm Password Textbox
    @FindBy(xpath = "//*[@for='AR_merchant_user_repeat_password']")
    public WebElement merchantinformationloginconfirmpassword;

    // Merchant Information Login Save Button
    @FindBy(xpath = "//*[@class='btn btn-green btn-full']")
    public WebElement merchantInformationLoginSaveButton;

    //> Relative Information Address  Menu

    //Addressmenu address details TextBox
    @FindBy(xpath = "//*[@name='AR_merchant[address]']")
    public WebElement merchantinformationaddressdetails;

    //Addressmenu Latitude TextBox
    @FindBy(xpath = "//*[@name='AR_merchant[latitude]']")
    public WebElement merchantinformationaddressLatitude;

    //Addressmenu Lontitude TextBox
    @FindBy(xpath = "//*[@name='AR_merchant[lontitude]']")
    public WebElement merchantinformationaddressLontitude;

    //Addressmenu Delivery Distance Textbox
    @FindBy(xpath = "//*[@name='AR_merchant[delivery_distance_covered]']")
    public WebElement merchantinformationaddressDeliveryDistance;

    //Addressmenu Miles Checkbox
    @FindBy(xpath = "//*[@name='AR_merchant[distance_unit]']")
    public WebElement merchantinformationaddressMilesCheckbox;

    //Addressmenu Save Butonu
    @FindBy(xpath = "//*[@class='btn btn-green btn-full']")
    public WebElement merchantinformationaddressSaveButon;


    //>>Sidebar Merchant Relative Settings Menu

    //Merchant Settings-Basic Settings Sayfası

    //Merchant Basic Settings Menu Butonu
    @FindBy(xpath = "(//*[@class='zmdi zmdi-settings'])[1]")
    public WebElement merchantsettingsbasicsettingsbuton;

    //Merchant Basic Settings Menu Tax Nummber Textbox
    @FindBy(xpath = "//*[text()='Tax number']")
    public WebElement merchantsettingsbasicsettingsTaxNummberTextbox;

    //Merchant Basic Settings Menu Two Flavor Options-please select kutusu
    @FindBy(xpath = "//*[@id='AR_option_merchant_two_flavor_option']")
    public WebElement merchantsettingsbasicsettingsTwoFlavorOptions;

    //Merchant Basic Settings Menu Two Flavor Options-website adres kutusu
    @FindBy(xpath = "//*[text()='Website address']")
    public WebElement merchantsettingsbasicsettingsTwoFlavorOptionsWebsiteAddress;

    //Merchant Basic Settings Menu close store radio
    @FindBy(xpath = "//*[@for='merchant_close_store']")
    public WebElement merchantsettingsbasicsettingsCloseStoreRadio;

    //Merchant Basic Settings Menu enabled voucher radio
    @FindBy(xpath = "//*[@for='merchant_enabled_voucher']")
    public WebElement merchantsettingsbasicsettingsenabledVoucherRadio;

    //Merchant Basic Settings Menu enabled tips radio
    @FindBy(xpath = "//*[@id='merchant_enabled_tip']")
    public WebElement merchantsettingsbasicsettingsEnabledTipsRadio;

    //Merchant Basic Settings Menu enabled language radio
    @FindBy(xpath = "//*[@for='merchant_enabled_language']")
    public WebElement merchantsettingsbasicsettingsEnabledLanguageRadio;

    //Merchant Basic Settings Menu default tip checkbox
    @FindBy(xpath = "//*[@id='AR_option_merchant_default_tip']")
    public WebElement merchantsettingsbasicsettingsDefaultTipCheckbox;

    //Merchant Basic Settings Menu tip type checkbox
    @FindBy(xpath = "//*[@name='AR_option[merchant_tip_type]']")
    public WebElement merchantsettingsbasicsettingsTipTypeCheckbox;

    //Merchant Basic Settings Menu Enabled Tips on the following transaction kutusu
    @FindBy(xpath = "//*[@class='select2-selection select2-selection--multiple']")
    public WebElement merchantsettingsbasicsettingsEnabledTipsTransactionTextbox;

    //Merchant Basic Settings SaveButonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantsettingsbasicsettingsSaveButonu;


    //Merchant Settings-Store Hours Sayfası

    //Store Hours Sayfası Add New Buton
    @FindBy(xpath = "//*[@class='btn btn-black btn-circle']")
    public WebElement merchantsettingsStoreHoursAddNewButon;

    //Store Hours Sayfası arama kutusu
    @FindBy(xpath = "//*[@class='form-control rounded search w-25']")
    public WebElement merchantsettingsStoreHoursAramakutu;

    //Store Hours Sayfası arama submit(arama kutusuun yanı)
    @FindBy(xpath = "//*[@class='submit input-group-text border-0 ml-2 normal']")
    public WebElement merchantsettingsStoreHoursAramaSubmit;

    //Store Hours Sayfası ilk satır (index değişerek alt satıra inebilir)
    @FindBy(xpath = "(//*[@class='odd'])[1]")
    public WebElement merchantsettingsStoreHoursIlkSatir;

    //Store Hours Sayfası ilk satır düzenleme butonu(index değişerek alt satıra inebilir)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-border-color'])[1]")
    public WebElement merchantsettingsStoreHoursDüzenlemeButonu;

    //Store Hours Sayfası ilk satır silme butonu(index değişerek alt satıra inebilir)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-delete'])[1]")
    public WebElement merchantsettingsStoreHoursSilmeButonu;

    //Store Hours Sayfası
    @FindBy(xpath = "")
    public WebElement merchantsettingsStoreHours;

    //Merchant Settings-Store Hours Sayfası

    //Taxes Sayfası tax enabled radio
    @FindBy(xpath = "//*[@for='tax_enabled']")
    public WebElement merchantsettingsTaxesTaxEnabledRadio ;

    //Taxes Sayfası Tax on service fee radio
    @FindBy(xpath = "//*[@for='tax_service_fee']")
    public WebElement merchantsettingsTaxesTaxOnServiceFeeRadio ;

    //Taxes Sayfası Tax on delivery fee radio
    @FindBy(xpath = "//*[@for='tax_on_delivery_fee']")
    public WebElement merchantsettingsTaxesTaxonDeliveryFeeRadio ;

    //Taxes Sayfası tax_packaging radio
    @FindBy(xpath = "//*[@for='tax_packaging']")
    public WebElement merchantsettingsTaxesTaxPackagingRadio;

    //Taxes Sayfası tax type checkbox
    @FindBy(xpath = "//*[@id='AR_merchant_meta_tax_type']")
    public WebElement merchantsettingsTaxesTaxTypeCheckbox;

    //Taxes Sayfası add nex tax butonu
    @FindBy(xpath = "//*[@class='btn btn-link btn-sm text-green border']")
    public WebElement merchantsettingsTaxesAddNexTaxButonu;

    //Taxes Sayfası No data yazısı
    @FindBy(xpath = "//*[@class='dataTables_empty']")
    public WebElement merchantsettingsTaxesNoDataYazisi;

    //Taxes Sayfası Save Butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantsettingsTaxesSaveButon;



    //Merchant Settings-Notification Settings Sayfası

    //Notification Settings Sayfasi enabled notification radio buton
    @FindBy(xpath = "//*[@for='merchant_enabled_alert']")
    public WebElement merchantsettingsNotificationSettingsEnabledNotificationRadioButon;

    //Notification Settings Sayfasi email address kutusu
    @FindBy(xpath = "//*[@for='AR_option_merchant_email_alert']")
    public WebElement merchantsettingsNotificationSettingsEmailAddressTextBox;

    //Notification Settings Sayfasi mobile number Kutusu
    @FindBy(xpath = "//*[@id='AR_option_merchant_mobile_alert']")
    public WebElement merchantsettingsNotificationSettingsMobileNumberTextBox;

    //Notification Settings Sayfasi save butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantsettingsNotificationSettingsSaveButonu;

    //Merchant Settings-Order Settings Sayfası

    //Order Settings Sayfasi Critical minutes kutusu
    @FindBy(xpath = "//*[@for='AR_option_merchant_order_critical_mins']")
    public WebElement merchantsettingsOrderSettingsCriticalMinutesTextBox;

    //Order Settings Sayfasi Reject order minutes kutusu
    @FindBy(xpath = "//*[@for='AR_option_merchant_order_reject_mins']")
    public WebElement merchantsettingsOrderSettingsRejectOrderMinutesTextBox;

    //Order Settings Sayfasi save butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantsettingsOrderSettingsSaveButon;

    //Merchant Settings-Mnu Options Sayfası

    //Menu Options Sayfasi open in new window radio
    @FindBy(xpath = "//*[@for='AR_option_merchant_menu_type_0']")
    public WebElement merchantsettingsMenuOptionsOpeninNewWindowRadio;

    //Menu Options Sayfasi Open in a pop up radio
    @FindBy(xpath = "//*[@for='AR_option_merchant_menu_type_1']")
    public WebElement merchantsettingsMenuOptionsOpeninaPopupRadio;

    //Menu Options Sayfasi save butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantsettingsMenuOptionsSaveButonu;

    //Merchant Menu-Menu Sayfası

    //Menu Menu Sayfasi creat a new menu linki
    @FindBy(xpath = "//*[@class='text-green']")
    public WebElement merchantMenuSAyfasiCreateaNewMenuLink;

    //Menu Menu Sayfasi Promo menu butonu
    @FindBy(xpath = "//*[@class='m-0 mt-1 text-truncate']")
    public WebElement merchantMenuSAyfasiPromoMenuButonu;

    //Menu Menu Sayfasi Add to menu butonu
    @FindBy(xpath = "(//*[text()='Add to menu'])[1]")
    public WebElement merchantMenuSAyfasiAddtoMenu;

    //Menu Menu Sayfasi Menu name kutusu
    @FindBy(xpath = "")
    public WebElement merchantMenuSAyfasiMenuNameTextbox;

    //Menu Menu Sayfasi Save Manu Butonu
    @FindBy(xpath = "//*[@class='btn btn-green normal rounded-0 mr-2']")
    public WebElement merchantMenuSAyfasiSaveMenuButonu;

    //Menu Menu Sayfasi Delete butonu
    @FindBy(xpath = "//*[@class='btn btn-link normal rounded-0 text-green']")
    public WebElement merchantMenuSAyfasiDeleteButonu;

    //Merchant - Promo

    //Merchant Promo ilk satır
    @FindBy(xpath = "//*[@class='odd']")
    public WebElement merchantPromoFirstLine;

    //Merchant Promo ilk satır açıklama(index kullan 2 den başlıyor)
    @FindBy(xpath = "(//*[h6])[2]")
    public WebElement getMerchantPromoFirstLineDescription;

    //Merchant Promo Düzenleme butonu (2.si i.in index kullan)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-border-color'])[1]")
    public WebElement merchantPromoEditButon;

    //Merchant Promo Silme butonu (2.si i.in index kullan)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-delete'])[1]")
    public WebElement merchantPromoDeleteButon;


    //Merchant - Last orders

    //Merchant Last Orders All butonu
    @FindBy(xpath = "(//*[text()='All'])[1]")
    public WebElement merchantLastOrdersAllButonu;

    //Merchant Last Orders Processing butonu
    @FindBy(xpath = "(//*[text()='Processing'])[1]")
    public WebElement merchantLastOrdersProcessingButonu;

    //Merchant Last Orders Ready butonu
    @FindBy(xpath = "(//*[text()='Ready'])[1]")
    public WebElement merchantLastOrdersReadyButonu;

    //Merchant Last Orders Completed Butonu
    @FindBy(xpath = "(//*[text()='Completed'])[1]")
    public WebElement merchantLastOrdersCompletedButonu;

    //Merchant Last Orders ilk order satırı başlık (order nosu bulunan yer - index kullan)
    @FindBy(xpath = "(//*[@class='font-weight-bold hover-text-primary mb-1'])[1]")
    public WebElement merchantLastOrdersFirstOrderTitle;

    //Merchant Last Orders ilk order satırı fiyat ( - index kullan)
    @FindBy(xpath = "(//*[@class='text-right align-middle'])[1]")
    public WebElement merchantLastOrdersFirstOrderPrice;

    //Merchant Last Orders ilk order satırı ödeme seçeneği( - index kullan)
    @FindBy(xpath = "(//*[@class='text-muted font-weight-500'])[1]")
    public WebElement merchantLastOrdersFirstOrderPaymentOption;

    //Merchant Last Orders ilk order satırı status new-pickup( - index kullan)
    @FindBy(xpath = "(//*[@class='badge order_status new'])[1]")
    public WebElement merchantLastOrdersFirstorderStatus;

    //Merchant Last Orders ilk order satırı inceleme butonu ( - index kullan)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-eye'])[1]")
    public WebElement merchantLastOrdersFirstOrderObserve;

    //Merchant Last Orders ilk order satırı indirme butonu ( - index kullan)
    @FindBy(xpath = "(//*[@class='zmdi zmdi-download'])[1]")
    public WebElement merchantLastOrdersFirstOrderDownloadButon;

    //Merchant - Popular Items

    //Merchant-Popular İtems popular items butonu (yeşil)
    @FindBy(xpath = "(//*[text()='Popular items'])[2]")
    public WebElement merchantPopularItemsButton;

    //Merchant-Popular İtems Last 30 days butonu
    @FindBy(xpath = "(//*[text()='Last 30 days sales'])[2]")
    public WebElement merchantPopularItemsLast30DaysButonu;

    //Merchant-Popular İtems ürün listesi ilk satır resmi ve linki (index kullan)
    @FindBy(xpath = "(//*[@class='img-60 rounded-circle'])[1]")
    public WebElement merchantPopularItemsProductListFirst;

    //Merchant-Popular İtems ürün listesi ilk satır satış adedi (index kullan-4ten başlıyor)
    @FindBy(xpath = "(//*[@class='m-0 text-muted'])[4]")
    public WebElement merchantPopularItemsFirstLinePuchaseQuantity;

    //Merchant-Popular İtems Last 30 days istatistikleri
    @FindBy(xpath = "(//*[@class='highcharts-background'])[1]")
    public WebElement merchantPopularItemsLast30DaysStatics;

    //Merchant - Top Customers

    //Merchant Top Customers İlk müşteri resmi (index kullan)
    @FindBy(xpath = "(//*[@class='img-60 rounded-circle'])[1]")
    public WebElement merchantTopCustomersFirstCustomerImg;

    //Merchant Top Customers İlk müşteri ismi(index kullan)
    @FindBy(xpath = "(//*[@class='img-60 rounded-circle'])[1]")
    public WebElement getMerchantTopCustomersFirstCustomerName;

    //Merchant Top Customers İlk müşteri satış adedi(index kullan - 3 ten başlar)
    @FindBy(xpath = "(//*[@class='m-0 text-muted'])[3]")
    public WebElement getMerchantTopCustomersFirstCustomerPuchaseQuantity;

    //Merchant Top Customers view all customer
    @FindBy(xpath = "(//*[text()='View All Customer'])")
    public WebElement merchantTopCustomersViewAllCustomer;


    //Merchant - Profile Sayfasi

    //Merchant Profile Sayfası Basic Details butonu
    @FindBy(xpath = "//*[@class='zmdi zmdi-account-circle']")
    public WebElement merchantProfilePageBasicDetailsButonu;

    //Merchant Profile Sayfası First name kutusu
    @FindBy(xpath = "//*[@name='AR_merchant_user[first_name]']")
    public WebElement merchantProfilePageFirstNameTextbox;

    //Merchant Profile Sayfası Last name kutusu
    @FindBy(xpath = "//*[@name='AR_merchant_user[last_name]']")
    public WebElement merchantProfilePageLastNameTextbox;

    //Merchant Profile Sayfası Email kutusu
    @FindBy(xpath = "//*[@for='AR_merchant_user_contact_email']")
    public WebElement merchantProfilePageEmailTextBox;

    //Merchant Profile Sayfası Number Kutusu
    @FindBy(xpath = "//*[@name='AR_merchant_user[contact_number]']")
    public WebElement merchantProfilePageNumberTextBox;

    //Merchant Profile Sayfası Username Kutusu
    @FindBy(xpath = "//*[@name='AR_merchant_user[username]']")
    public WebElement merchantProfilePageUsernameTextBox;

    //Merchant Profile Sayfası Browse Butonu
    @FindBy(xpath = "//*[@class='btn btn-info']")
    public WebElement merchantProfilePageBrowseButon;

    //Merchant Profile Sayfası Resmi kapatma simgesi
    @FindBy(xpath = "//*[@class='zmdi zmdi-close']")
    public WebElement merchantProfilePageCloseImg;

    //Merchant Profile Sayfası Save butonu
    @FindBy(xpath = "//*[@value='Save']")
    public WebElement merchantProfilePageSaveButon;

    //Merchant Profile Sayfası Change Password Butonu
    @FindBy(xpath = "//*[@class='zmdi zmdi-lock-outline']")
    public WebElement merchantProfilePageChangePasswordButonu;

    //Merchant Profile Sayfası Old password kutusu
    @FindBy(xpath = "//*[@for='AR_merchant_user_old_password']")
    public WebElement merchantProfilePageOldPasswordTextbox;

    //Merchant Profile Sayfası New Password
    @FindBy(xpath = "")
    public WebElement merchantProfilePageNewPasswordTextBox;

    //Merchant Profile Sayfasi Confirm Password Kutusu
    @FindBy(xpath = "//*[@for='AR_merchant_user_repeat_password']")
    public WebElement merchantProfilePageConfirmPasswordTextbox;

    //Merchant Profile Sayfasi Save
    @FindBy(xpath = "//*[@for='AR_merchant_user_repeat_password']")
    public WebElement merchantProfilePageSaveButonu;
        





}


