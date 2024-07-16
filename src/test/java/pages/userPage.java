package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class userPage {

    public userPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    // user sayfasındakı flavor fetch logosunun xpath
    @FindBy(xpath = "//*[@class='top-logo']")
    public WebElement userlogo;

    // user sayfasındakı Sign in butonunun xpath
    @FindBy(xpath = "//*[@class='d-none d-lg-inline line-left']")
    public WebElement userSignInBotten;

    // User sayfasındaki Mobile number or email
    @FindBy(xpath = "(//*[@class='required'])[1]")
    public WebElement userNameTextBox;

    // User sayfasındaki Password
    @FindBy(xpath = "(//*[@class='required'])[2]")
    public WebElement userPasswordTextBox;

    // user sayfasında login olmak için Sign in butonu
    @FindBy(xpath = "//*[@class='btn btn-green w-100']")
    public WebElement userGirisBotten;

    // User sayfasında login olunduktan sonra Icon xpath
    @FindBy(xpath = "//*[@class='badge rounded-circle badge-danger count']")
    public WebElement userIcon;

    // header kısmında dropdown menüsü
    @FindBy(xpath = "//*[@id='dropdownMenuLink']")
    public WebElement userDropDownMenu;

    // dropdown Manage my account
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-account']")
    public WebElement userDropdownManageMyAccount;

    // dropdown My Orders
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-orders']")
    public WebElement userDropdownMyOrders;

    // dropdown Addresses
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-addresses']")
    public WebElement userDropdownAddresses;

    // dropdown Payments Options
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-payments']")
    public WebElement userPaymentsOptions;

    // dropdown Saved Stores
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-savedstore']")
    public WebElement userSavedStore;

    //dropdown kısmından Logout
    @FindBy(xpath = "dropdown-item with-icon-logout")
    public WebElement userLogout;

    // header bölümündeki sepet ve sepette kaç adet sipariş olduğunu gösteren sayı ıconu
    @FindBy(xpath = "//*[@class='d-inline mr-3 mr-lg-0']")
    public WebElement userSepet;
    @FindBy(xpath = "//*[@class='badge small badge-dark rounded-pill']")
    public WebElement userSıparısAdetı;

    // user header kısmında Cart
    @FindBy(xpath = "//*[@class='d-none d-lg-inline line-left']")
    public WebElement userCart;



    @FindBy(xpath = "//*[@class='btn-white-parent non-trasparent']")
    public WebElement joinUsButton;

    // User sayfasında konum search yerı Enter delivery address
    @FindBy(xpath = "//div[@id='vue-home-search']//input[@placeholder='Enter delivery address']")
    public WebElement userSearchAddress;


    // User Join olma butonu
    @FindBy(xpath = "//*[@class='btn btn-link w25']")
    public WebElement userJoin;

    // Manage my account kısmına tıkladıktan sonra Basic Details kısmında fotoğraf xpath
    @FindBy(xpath = "//*[@class='handle w-100 text-center bold']")
    public WebElement userProfilePhoto;

    // Manage my account kısmına tıkladıktan sonra Basic Details xpath
    @FindBy(xpath = "(//*[@class='active'])[2]")
    public WebElement userBasicDetails;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement userFirstName;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement userLastName;
    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement userEmail;
    @FindBy(xpath = "//button[@class='dropdown-toggle']")
    public WebElement userNumberButton;
    @FindBy(xpath = "//*[@class='mr-0 ml-1'])")
    public WebElement userNumberCenter;
    @FindBy(xpath = "//input[@data-mask='###################']")
    public WebElement userNumber;
    @FindBy(xpath = "//button[@class='mt-3 btn btn-green w-100']")
    public WebElement userSubmit;

    //Change Password kısmının xpath
    // Submit butonu Basic Details xpath ile aynı oyüzden iki tane locate eklenmemiştir
    @FindBy(xpath = "//*[@class='user-change-password']")
    public WebElement userChangePassword;
    @FindBy(xpath = "//label[@for='old_password']")
    public WebElement userOldPassword;
    @FindBy(xpath = "//label[@for='new_password']")
    public WebElement userNewPassword;
    @FindBy(xpath = "//label[@for='confirm_password']")
    public WebElement userConfirmPassword;

    // Manage Account kısmının xpath
    @FindBy(xpath = "//*[@href='/account/manage_account']")
    public WebElement userManageAccount;
    @FindBy(xpath = "//h6[normalize-space()='Account Data']")
    public WebElement userAccountData;
    @FindBy(xpath = "//h6[normalize-space()='Delete Account']")
    public WebElement userDeleteAccount;

    // menu kısmından Orders kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='orders active']")
    public WebElement userMenuOrders;

    // menu kısmından Addresses kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='addresses']")
    public WebElement userMenuAddress;

    // menu kısmından Payments kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='payments']")
    public WebElement userMenuPayments;

    // menu kısmından Saved stores kısmına geçmek için xpath
    @FindBy(xpath = "//*[@class='favourites']")
    public WebElement userMenuSavedStores;

    // orders penceresindeki xpath

    @FindBy(xpath = "//*[@class=\"col-lg-3 d-none d-lg-block\"]")
    public WebElement userOrdersQty;

    @FindBy(xpath = "(//*[@class=\"col-lg-2 d-none d-lg-block\"])[2]")
    public WebElement userTotalAmount;

    @FindBy(xpath = "(//*[@class='pr-2'])[1]")
    public WebElement userMerchantIcon;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[1]")
    public WebElement userMerchantName1;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[2]")
    public WebElement userMerchantName2;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[3]")
    public WebElement userMerchantName3;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[4]")
    public WebElement userMerchantName4;
    @FindBy(xpath = "(//*[@class='align-self-center mr-2'])[5]")
    public WebElement userMerchantName5;
    @FindBy(xpath = "(//*[@class='font13'])[1]")
    public WebElement userOrderID1;
    @FindBy(xpath = "(//*[@class='font13'])[2]")
    public WebElement userOrderID2;
    @FindBy(xpath = "(//*[@class='font13'])[3]")
    public WebElement userOrderID3;
    @FindBy(xpath = "(//*[@class='font13'])[4]")
    public WebElement userOrderID4;

    @FindBy(xpath = "(//*[@class='font13'])[5]")
    public WebElement userOrderID5;

    // orders kısmında siparişlerimin durumunu incelemek için kullanılan üç nokta buttonu
    @FindBy(xpath = "((//*[@class='zmdi zmdi-more'])[1]")
    public WebElement userOrdersUcNokta;
    @FindBy(xpath = "(//*[@class='dropdown-item ssm-toggle-nav'])[1]")
    public WebElement userOrdersView;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement userDropdownBuyAgain;
    @FindBy(xpath = "//*[@class='btn btn-green w-100 small']")
    public WebElement userBuyAgainButton;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement UserDropdownTrack;
    @FindBy(xpath = "(//*[@class='dropdown-item'])[5]")
    public WebElement userDropdownCancelOrders;
    @FindBy(xpath = "(//*[@class='label'])[1]")
    public WebElement userOrdersCancelButton;
    @FindBy(xpath = "(//*[@class='btn btn-black w-100'])[1]")
    public WebElement userOrdersDontCancel;
    @FindBy(xpath = " (//*[@class='d-flex justify-content-between'])[2]")
    public WebElement userGoToCheckout;
    @FindBy(xpath = "(//*[@class='d-block chevron-section promo-section d-flex align-items-center rounded mb-2'])[1]")
    public WebElement userPhoneNumber;
    @FindBy(xpath = "(//*[@class='d-block chevron-section promo-section d-flex align-items-center rounded mb-2'])[2]")
    public WebElement userAddPromoCode;
    @FindBy(xpath = "//*[@class='custom-control-label']")
    public WebElement userCondimentsButton;
    @FindBy(xpath = "//*[@class='badge btn-black rounded-pill ml-1 font20']")
    public WebElement userAddNewAddress;
    @FindBy(xpath = "(//*[@class='d-block chevron-section promo-section d-flex align-items-center rounded mb-2'])[3]")
    public WebElement userChooseDeliveryAddress;
    @FindBy(xpath = "//*[@class='top-logo']")
    public WebElement headerLogo;

    @FindBy(xpath = "(//a[@class='facebook'])[1]")
    public WebElement facebookButton;

    @FindBy(xpath = "(//a[@class='instagram'])[1]")
    public WebElement instagramButton;

    @FindBy(xpath = "(//a[@class='linkedin'])[1]")
    public WebElement linkedinButton;

    @FindBy(xpath = "(//a[@class='twitter'])[1]")
    public WebElement twitterButton;

    @FindBy(xpath = "(//a[@class='youtube'])[1]")
    public WebElement youtubeButton;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][1]")
    public WebElement fastfoodBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][2]")
    public WebElement pizzaBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][3]")
    public WebElement sandwichesAndWrapsBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][4]")
    public WebElement italianBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][5]")
    public WebElement soupsAndStewsBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][6]")
    public WebElement japaneseBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][7]")
    public WebElement dessertAndSnacksBox;

    @FindBy(xpath = "//div[@class='col cuisineMainPage'][8]")
    public WebElement chineseButton;

    @FindBy( xpath= "(//*[@class=\"owl-carousel-nav prev mr-4\"])[1]")
    public WebElement oncekiButton;

    @FindBy (xpath = "(//*[@class=\"owl-carousel-nav next\"])[1]")
    public WebElement sonrakiButton;

    @FindBy (xpath = "(//*[@href=\"https://qa.flavorfetch.com/team-3\"])[3]")
    public WebElement team3Box;

    @FindBy (xpath = "(//a[@class='btn btn-grey xget-item-details'])[1]")
    public WebElement iskenderAddCart;

    @FindBy (xpath = "(//a[@class='btn btn-grey xget-item-details'])[2]")
    public WebElement pizzaAddCart;

    @FindBy (xpath = "(//div[@class='position-relative quantity-wrapper'])[2]")
    public WebElement hamburgerAddCart;

    @FindBy (xpath = "(//a[@class='btn btn-grey xget-item-details'])[3]")
    public WebElement mozarellaSticksAddCart;

    @FindBy (xpath = "(//a[@class='rounded-pill qty-btn'])[3]")
    public WebElement eksiButton;

    @FindBy (xpath = "(//a[@class='rounded-pill qty-btn'])[4]")
    public WebElement artiButton;

    @FindBy (xpath = "(//a[@class='btn btn-grey xget-item-details'])[1]")
    public WebElement addToCartIskenderButton;

    @FindBy (xpath = "//*div[@class = 'btn btn-green w-100 pointer d-flex justify-content-between']")
    public WebElement checkOutButton;

    @FindBy (xpath = "//*div[@class = 'mr-1']")
    public WebElement cashpaymentButton;

    @FindBy (xpath = "//*div[@class = 'btn btn-green w-100']" )
    public WebElement addCashButton;

    @FindBy (xpath = "(//li[@class='position-relative'])[1]")
    public WebElement contactUsButton;

    @FindBy (xpath = "//*[@href="https://qa.flavorfetch.com/terms-and-conditions"]")
    public WebElement termsAndConditionsButton;

    @FindBy (xpath = "(//li[@class='position-relative '])[3]")
    public WebElement privacyPolicyButton;

    @FindBy (xpath = "(//a[@class='btn btn-grey xget-item-details'])[2]")
    public WebElement addToCartoMozarellaButton;

    @FindBy(xpath = "//*[@href=\"https://qa.flavorfetch.com/merchant/signup\"]")
    public WebElement becomeAPartnerButton;

    //Food Lists..
    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[1]")
    public WebElement havanaSandwichPage;

    @FindBy (xpath = "(//div[@class='position-relative']/a[1])[2]")
    public WebElement dolanUyghurPage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[3]")
    public WebElement krispyKremePage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[4]")
    public WebElement redrosePage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[5]")
    public WebElement foodyPizzaPage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[6]")
    public WebElement sushiNationPage;

    @FindBy(xpath = ("(//div[@class='position-relative']/a[1])[7]"))
    public WebElement team3Page;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[8]")
    public WebElement burgerVillagePage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[9]")
    public WebElement oceanaireSeafoodPage;

    @FindBy(xpath = "(//div[@class='position-relative']/a[1])[10]")
    public WebElement team1Page;

    @FindBy(xpath = "(//a[@class='rounded-pill qty-btn'])[2]")
    public WebElement cartSummaryPlusButton;

    @FindBy(xpath = "(//a[@class='rounded-pill qty-btn'])[3]")
    public WebElement cartSummaryMinusButton;

    @FindBy(xpath = "/a[@class='rounded-pill item-remove ml-auto mb-1']")
    public WebElement removeCartButton;

    @FindBy(xpath = "//button[@class='btn btn-green w-100 pointer']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//textarea[@class='form-control form-control-text font13']")
    public WebElement noteTextBox;

    @FindBy(xpath = "//div[@class='flex-fill pl-2']")
    public WebElement confirmingOrderRestoranPage;

    @FindBy(xpath = "//div[@class='mt-2']/a[@class='btn btn-circle btn-white border mr-2']")
    public WebElement callButton;

    @FindBy(xpath = "//div[@class='mt-2']/a[@class='btn btn-circle btn-white border']")
    public WebElement navigateButton;







}
