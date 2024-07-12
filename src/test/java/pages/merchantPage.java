package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class merchantPage {

    public merchantPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



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
    @FindBy(xpath = "//*[@id='AR_merchant_restaurant_name']")
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


    //------------------------------------------------------------------

    /*  *******************
        --- Dashboard ---
        *******************  */
    @FindBy(xpath = "//li[@class='merchant_dashboard active']")
    public WebElement dashboardMenu;


    /*  *******************
        --- Orders Menu ---
        *******************  */
    @FindBy(xpath = "//*[@class='merchant_orders']")
    public WebElement ordersMenu;
    @FindBy(xpath = "//*[@class='position-relative orders_new']")
    public WebElement newOrdersMenu;
    @FindBy(xpath = "//*[@class='position-relative orders_processing']")
    public WebElement ordersProcessingMenu;
    @FindBy(xpath = "//*[@class='position-relative orders_completed']")
    public WebElement ordersCompletedMenu;
    @FindBy(xpath = "//*[@class='position-relative orders_scheduled']")
    public WebElement ordersScheduledMenu;
    @FindBy(xpath = "//*[@class='position-relative orders_history']")
    public WebElement allOrdersMenu;

    /*
        Sol kısımdaki sipariş detaylarının gözüktüğü bölümün locate'i bütün order basamaklarında aynı
        Üst kısımdaki searchBox ve filtreleme türleri olan Order type, Payment Status, Sort bölümün locate'i bütün order basamaklarında aynı
        Sağ kısımdaki Summary bölümün locate'i bütün order basamaklarında aynı
        Assign Driver butonu locate'i bütün order basamaklarında aynı
        Alt kısımdaki Payment History locate'i bütün order basamaklarında aynı
        Ortadaki sipariş detayları bölümünün locate'i bütün order basamaklarında aynı
     */

    /*  ---------Orders-----------
        --- Ortak Kullanımlar ----
        -------------------------- */

    // Sol kısımdaki sipariş detay kutusu
    @FindBy(xpath = "//*[@class='chevron selected']")
    public WebElement newOrderInfoBox;

    // Orta kısımdaki sipariş detay kutusu
    @FindBy(xpath = "//*[@class='col-md-5']")
    public WebElement detailedOrderInfoBox;

    // Order search box
    @FindBy(xpath = "//*[@class='form-control py-2 border-right-0 border']")
    public WebElement orderSearchBox;

    // Order type filter
    @FindBy(xpath = "(//*[@title='Order type'])[1]")
    public WebElement orderTypeDropdown;

    // Payment Status filter
    @FindBy(xpath = "(//*[@title='Order type'])[1]")
    public WebElement paymentStatusDropdown;

    //Sort
    @FindBy(xpath = "(//*[@title='Sort'])[1]")
    public WebElement sortDropdown;

    // Assign Driver
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement assignDriverButton;

    //Summary
    @FindBy(xpath = "//*[@class='card-body pt-3']")
    public WebElement orderSummaryLabel;

    //Payment history
    @FindBy(xpath = "//*[@class='table-responsive-md']")
    public WebElement paymentHistoryTable;

    /*  ------Orders-------
        --- New Orders ----
        -------------------  */

    // Accept Button
    @FindBy(xpath = "//button[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement orderAcceptButton;
    // Order Reject Button
    @FindBy(xpath = "//button[@class='btn-black btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement orderRejectButton;


    /*  ---------Orders-----------
        --- Orders Processing ----
        --------------------------  */

    // Ready for pickup button
    @FindBy(xpath = "//*[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement readyForPickupButton;

    /*  ---------Orders-----------
        --- ---Orders Ready ------
        --------------------------  */

    // Delivery on its way button
    @FindBy(xpath = "//*[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement deliveryOnWayButton;

    // Delivered Button
    @FindBy(xpath = "//*[@class='btn-yellow btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement deliveredButton;

    // Delivery Failed Button
    @FindBy(xpath = "btn-black btn normal mr-2 font13 mb-3 mb-xl-0")
    public WebElement deliveryFailedButton;

    /*  ---------Orders-----------
        ----Orders Completed -----
        --------------------------  */

    // Kullanılan bütün elementler ortak kısımda

     /*  ---------Orders-----------
        ----Orders Scheduled -----
        --------------------------  */

    // Accept Button
    @FindBy(xpath = "//button[@class='btn-green btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement scheduledAcceptButton;

    // Order Reject Button
    @FindBy(xpath = "//button[@class='btn-black btn normal mr-2 font13 mb-3 mb-xl-0']")
    public WebElement scheduledRejectButton;

     /*  ---------Orders-----------
         ------- All Orders -------
         --------------------------  */

    // Order History Top Section Summary (4 Elements)
    @FindBy(xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[1]")
    public WebElement ordersSummary;

    @FindBy(xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[2]")
    public WebElement cancelledOrdersSummary;

    @FindBy(xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[3]")
    public WebElement totalRefundSummary;

    @FindBy(xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[4]")
    public WebElement totalOrdersSummary;

    //Date filter (YYYYMMDD)
    @FindBy(xpath = "//*[@class='form-control py-2 border-right-0 border']")
    public WebElement dateFilterTextBox;

    // Filter By Customer etc.
    @FindBy(xpath = "(//*[text()='Filters'])[1]")
    public WebElement regularFilterButton;

    // Filter Page-shown  by customer etc.
    @FindBy(xpath = "(//*[@class='card-body'])[2]")
    public WebElement filterPanelMenu;

    /// Orders List Table Header Row
    @FindBy(xpath = "//th")
    public List<WebElement> orderListHeaderRow;

    // Customer PP Coloumn
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> cutomerPPColoumn;

    // Order Id Coloumn
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> orderIdColoumn;

    // Customer Name Coloumn
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> customerNameColoumn;

    // Order Information Coloumn
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> orderInfoColoumn;

    // Order view button
    @FindBy(xpath = "//tr//td[5]//a[1]")
    public List<WebElement> viewDetailsButton;

    // Receipt download button
    @FindBy(xpath = "//tr//td[5]//a[2]")
    public List<WebElement> downloadReceiptButton;

    // Next Page Button
    @FindBy(xpath = "//*[@class='paginate_button page-item next']")
    public WebElement nextPageButton;

    // Previous Page Button
    @FindBy(xpath = "//*[@class='paginate_button page-item previous']")
    public WebElement previousPageButton;


    /*  *******************
        ---- Food Menu ----
        *******************  */

    @FindBy(xpath = "//*[@class='food']")
    public WebElement foodMenu;
    @FindBy(xpath = "//*[@class='//*[@class='position-relative food_category']")
    public WebElement categoryMenu;
    @FindBy(xpath = "//*[@class='position-relative food_addoncategory']")
    public WebElement addOnCategoryMenu;
    @FindBy(xpath = "//*[@class='position-relative food_addonitem']")
    public WebElement addOnItemsMenu;
    @FindBy(xpath = "//*[@class='position-relative food_items']")
    public WebElement itemsMenu;

     /*
       Tablo başlık satırı bölümünün locate'i bütün basamaklarında aynı

     */


    /*  ------Food--------
        ---- Category -----
        -------------------  */

    // Category Picture Coloumn
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> categoryPicturedColoumn;

    // Category Name Coloumn
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> categoryNameColoumn;

    // Category Update Button Coloumn
    @FindBy(xpath = "//tr//td[3]//a[1]")
    public List<WebElement> categoryUpdateButtonColoumn;

    // Category Delete Button Coloumn
    @FindBy(xpath = "//tr//td[3]//a[2]")
    public List<WebElement> categoryDeleteButtonColoumn;

    // Add New Category Button
    @FindBy(xpath = "//*[@class='btn btn-black btn-circle']")
    public WebElement addNewCategoryButton;

    // Category name textBox
    @FindBy(xpath = "//*[@id='AR_category_category_name']")
    public WebElement categoryNameTextBox;

    // Category description textBox
    @FindBy(xpath = "//*[@id='AR_category_category_description']")
    public WebElement categoryDescriptionTextBox;

    //Category Featured Image Browse Button
    @FindBy(xpath = "(//button[@class='btn btn-info'])[1])")
    public WebElement featuredImageTextBox;

    //Category Icon Image Browse Button
    @FindBy(xpath = "(//button[@class='btn btn-info'])[2])")
    public WebElement iconImageTextBox;

    // Category Sort
    @FindBy(xpath = "//*[@class='btn btn-primary btn-circle']")
    public WebElement sortCategoryButton;

    /*  ------- Food ------------
        ---- AddOn Category -----
        -------------------------  */

    // AddOnCategory List Table Header Row
    @FindBy(xpath = "//th")
    public List<WebElement> addOnCategoryListHeaderRow;

    // AddOnCategory Picture Coloumn
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> addOnCategoryPicturedColoumn;

    // AddOnCategory Name Coloumn
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> adOnCategoryNameColoumn;

    // AddOnCategory Update Button Coloumn
    @FindBy(xpath = "//tr//td[3]//a[1]")
    public List<WebElement> addOnCategoryUpdateButtonColoumn;

    //Update category name textbox
    @FindBy(xpath = "//*[@id='AR_subcategory_subcategory_name']")
    public WebElement addOnCategoryNameTextBox;

    //Update category description textbox
    @FindBy(xpath = "//*[@id='AR_subcategory_subcategory_description']")
    public WebElement addOnCategoryDescriptionTextBox;


    // AddOnCategory Featured Image Browse Button
    @FindBy(xpath = "//*[@class='btn btn-info']")
    public List<WebElement> addOnCategoryFeaturedImageButton;

    // AddOnCategory Update Save Button
    @FindBy(xpath = "//*[@class='btn btn-green btn-full mt-3']")
    public WebElement updateSaveButton;

    // AddOnCategory Delete Button Coloumn
    @FindBy(xpath = "//tr//td[3]//a[2]")
    public List<WebElement> addOnCategoryDeleteButton;

     /*  ------- Food --------
        ---- AddOn Items -----
        ----------------------  */

    // AddOnItem List Table Header Row
    @FindBy(xpath = "//th")
    public List<WebElement> addOnItemListHeaderRow;

    // AddOnItem Picture Coloumn
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> addOnItemPicturedColoumn;

    // AddOnItem Name Coloumn
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> adOnItemNameColoumn;

    // AddOnItem's Category Name Coloumn
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> adOnItemCategoryColoumn;

    // AddOnItem Price Coloumn
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> adOnItemPriceColoumn;

    // AddOnItem Update Button Coloumn
    @FindBy(xpath = "//tr//td[5]//a[1]")
    public List<WebElement> addOnItemUpdateButtonColoumn;

    //Update addOnItem name textbox
    @FindBy(xpath = "//*[@id='AR_subcategory_item_sub_item_name']")
    public WebElement addOnItemNameTextBox;

    //Update addOnItem description textbox
    @FindBy(xpath = "//*[@id='AR_subcategory_item_sub_item_name']")
    public WebElement addOnItemDescriptionTextBox;

    //Update addOnItem price textbox
    @FindBy(xpath = "//*[@id='AR_subcategory_item_price']")
    public WebElement addOnItemPriceTextBox;

    // Update addOnItem AddOnCategory Menu
    @FindBy(xpath = "//*[@class='select2-selection select2-selection--multiple']")
    public WebElement addOnItemCategoryMenu;

    // AddOnItem Featured Image Browse Button
    @FindBy(xpath = "//*[@class='btn btn-info']")
    public WebElement ImageBrowseButton;

    // AddOnItem Update Save Button
    @FindBy(xpath = "//*[@class='btn btn-green btn-full mt-3']")
    public WebElement AddOnItemUpdateSaveButton;

    // Status dropdown
    @FindBy(xpath = "//*[@class='select2-selection select2-selection--multiple']")
    public WebElement statusDropdown;


    // AddOnItem Delete Button Coloumn
    @FindBy(xpath = "//tr//td[5]//a[2]")
    public List<WebElement> addOnItemDeleteButtonColoumn;

     /*  ------- Food -------
         -----  Items -------
         --------------------  */

    // Items List Table Header Row
    @FindBy(xpath = "//th")
    public List<WebElement> itemsListHeaderRow;

    // Items Picture Coloumn
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> itemsPicturedColoumn;

    // Items Availability Coloumn
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> itemsAvailabilityCheckBoxColoumn;

    // Items Name Coloumn
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> itemsNameColoumn;

    // Items' Category Coloumn
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> itemsCategoryColoumn;

    // Items Price Coloumn
    @FindBy(xpath = "//tr//td[5]")
    public List<WebElement> itemsPriceColoumn;

    // Items Update Coloumn
    @FindBy(xpath = "//tr//td[6]//a[1]")
    public List<WebElement> itemsUpdateColoumn;

    // Items Delete Coloumn
    @FindBy(xpath = "//tr//td[6]//a[2]")
    public List<WebElement> itemsDeleteColoumn;


}


