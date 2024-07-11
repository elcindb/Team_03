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



}


