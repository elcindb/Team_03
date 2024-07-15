package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class userPage {
    public userPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // user sayfasındakı flavor fetch logosunun xpath
    @FindBy(xpath = "//*[@class='top-logo']")
    public WebElement Userlogo;

    // user sayfasındakı Sign in butonunun xpath
    @FindBy(xpath = "//*[@class='d-none d-lg-inline line-left']")
    public WebElement UserSignIn;

    // User sayfasındaki Mobile number or email
    @FindBy(xpath = "(//*[@class='required'])[1]")
    public WebElement UserName;

    // User sayfasındaki Password
    @FindBy(xpath = "(//*[@class='required'])[2]")
    public WebElement UserPassword;

    // user sayfasında login olmak için Sign in butonu
    @FindBy(xpath = "//*[@class='btn btn-green w-100']")
    public WebElement UserGiris;

    // User sayfasında login olunduktan sonra Icon xpath
    @FindBy(xpath = "//*[@class='badge rounded-circle badge-danger count']")
    public WebElement UserIcon;

    // header kısmında dropdown menüsü
    @FindBy(xpath = "//*[@id='dropdownMenuLink']")
    public WebElement UserDropDownMenu;

    // dropdown Manage my account
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-account']")
    public WebElement UserDropdownManageMyAccount;

    // dropdown My Orders
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-orders']")
    public WebElement UserDropdownMyOrders;

    // dropdown Addresses
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-addresses']")
    public WebElement UserDropdownAddresses;

    // dropdown Payments Options
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-payments']")
    public WebElement UserPaymentsOptions;

    // dropdown Saved Stores
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-savedstore']")
    public WebElement UserSavedStore;

    //dropdown kısmından Logout
    @FindBy(xpath = "dropdown-item with-icon-logout")
    public WebElement UserLogout;

    // header bölümündeki sepet ve sepette kaç adet sipariş olduğunu gösteren sayı ıconu
    @FindBy(xpath = "//*[@class='d-inline mr-3 mr-lg-0']")
    public WebElement UserSepet;
    @FindBy(xpath = "//*[@class='badge small badge-dark rounded-pill']")
    public WebElement UserSıparısAdetı;

    // user header kısmında Cart
    @FindBy(xpath = "//*[@class='d-none d-lg-inline line-left']")
    public WebElement UserCart;



    @FindBy(xpath = "//*[@class='btn-white-parent non-trasparent']")
    public WebElement joinUsButton;

    // User sayfasında konum search yerı Enter delivery address
    @FindBy(xpath = "//div[@id='vue-home-search']//input[@placeholder='Enter delivery address']")
    public WebElement UserSearchAddress;


    // User Join olma butonu
    @FindBy(xpath = "//*[@class='btn btn-link w25']")
    public WebElement UserJoin;

    // Manage my account kısmına tıkladıktan sonra Basic Details kısmında fotoğraf xpath
    @FindBy(xpath = "//*[@class='handle w-100 text-center bold']")
    public WebElement UserProfilePhoto;

    // Manage my account kısmına tıkladıktan sonra Basic Details xpath
    @FindBy(xpath = "(//*[@class='active'])[2]")
    public WebElement UserBasicDetails;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement UserFirstName;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement UserLastName;
    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement UserEmail;
    @FindBy(xpath = "//button[@class='dropdown-toggle']")
    public WebElement UserNumberButton;
    @FindBy(xpath = "//*[@class='mr-0 ml-1'])")
    public WebElement UserNumberCenter;
    @FindBy(xpath = "//input[@data-mask='###################']")
    public WebElement UserNumber;
    @FindBy(xpath = "//button[@class='mt-3 btn btn-green w-100']")
    public WebElement UserSubmit;

    //Change Password kısmının xpath
    // Submit butonu Basic Details xpath ile aynı oyüzden iki tane locate eklenmemiştir
    @FindBy(xpath = "//*[@class='user-change-password']")
    public WebElement UserChangePassword;
    @FindBy(xpath = "//label[@for='old_password']")
    public WebElement UserOldPassword;
    @FindBy(xpath = "//label[@for='new_password']")
    public WebElement UserNewPassword;
    @FindBy(xpath = "//label[@for='confirm_password']")
    public WebElement UserConfirmPassword;

    // Manage Account kısmının xpath
    @FindBy(xpath = "//*[@href='/account/manage_account']")
    public WebElement UserManageAccount;
    @FindBy(xpath = "//h6[normalize-space()='Account Data']")
    public WebElement UserAccountData;
    @FindBy(xpath = "//h6[normalize-space()='Delete Account']")
    public WebElement UserDeleteAccount;

    // menu kısmından Orders kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='orders active']")
    public WebElement UserMenuOrders;

    // menu kısmından Addresses kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='addresses']")
    public WebElement UserMenuAddress;

    // menu kısmından Payments kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='payments']")
    public WebElement UserMenuPayments;

    // menu kısmından Saved stores kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='favourites']")
    public WebElement UserMenuSavedStores;

    // orders penceresindeki xpath

    @FindBy(xpath = "//*[@class=\"col-lg-3 d-none d-lg-block\"]")
    public WebElement UserOrdersQty;

    @FindBy(xpath = "(//*[@class=\"col-lg-2 d-none d-lg-block\"])[2]")
    public WebElement UserTotalAmount;

    @FindBy(xpath = "(//*[@class='pr-2'])[1]")
    public WebElement UserMerchantIcon;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[1]")
    public WebElement UserMerchantName1;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[2]")
    public WebElement UserMerchantName2;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[3]")
    public WebElement UserMerchantName3;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[4]")
    public WebElement UserMerchantName4;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[5]")
    public WebElement UserMerchantName5;
    @FindBy(xpath = "(//*[@class='font13'])[1]")
    public WebElement UserOrderID1;
    @FindBy(xpath = "(//*[@class='font13'])[2]")
    public WebElement UserOrderID2;
    @FindBy(xpath = "(//*[@class='font13'])[3]")
    public WebElement UserOrderID3;
    @FindBy(xpath = "(//*[@class='font13'])[4]")
    public WebElement UserOrderID4;

    @FindBy(xpath = "(//*[@class='font13'])[5]")
    public WebElement UserOrderID5;

    // orders kısmında siparişlerimin durumunu incelemek için kullanılan üç nokta buttonu
    @FindBy(xpath = "((//*[@class='zmdi zmdi-more'])[1]")
    public WebElement UserOrdersUcNokta;
    @FindBy(xpath = "(//*[@class='dropdown-item ssm-toggle-nav'])[1]")
    public WebElement UserOrdersView;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement UserDropdownBuyAgain;
    @FindBy(xpath = "//*[@class='btn btn-green w-100 small']")
    public WebElement UserBuyAgainButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement UserDropdownTrack;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[5]")
    public WebElement UserDropdownCancelOrders;
    @FindBy(xpath = "(//*[@class='label'])[1]")
    public WebElement UUserOrdersCancelButton;
    @FindBy(xpath = "(//*[@class='btn btn-black w-100'])[1]")
    public WebElement UUserOrdersDontCancel;
    @FindBy(xpath = " (//*[@class='d-flex justify-content-between'])[2]")
    public WebElement UserGoToCheckout;
    @FindBy(xpath = "(//*[@class='d-block chevron-section promo-section d-flex align-items-center rounded mb-2'])[1]")
    public WebElement UserPhoneNumber;
    @FindBy(xpath = "(//*[@class='d-block chevron-section promo-section d-flex align-items-center rounded mb-2'])[2]")
    public WebElement UserAddPromoCode;
    @FindBy(xpath = "//*[@class='custom-control-label']")
    public WebElement UserCondimentsButton;
    @FindBy(xpath = "//*[@class='badge btn-black rounded-pill ml-1 font20']")
    public WebElement UserAddNewAddress;
    @FindBy(xpath = "(//*[@class='d-block chevron-section promo-section d-flex align-items-center rounded mb-2'])[3]")
    public WebElement UserChooseDeliveryAddress;
    @FindBy(xpath = "//*[@class='top-logo']")
    public WebElement headerLogo;

}
