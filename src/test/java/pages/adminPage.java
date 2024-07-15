package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class adminPage {
    public adminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //ulvi start
    @FindBy(className = "navbar-brand")
    public WebElement allMerchantText;

    @FindBy(className = "btn btn-black btn-circle")
    public WebElement addNewMerchantButton;

    @FindBy(className = "form-control rounded search w-25")
    public WebElement merchantSearchBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement merchantSearchButton;

    @FindBy(xpath = "(//*[@class='dataTables_info']")
    public WebElement merchantTotalEntries;

    @FindBy(xpath = "//*[@id='merchantListActions_previous']")
    public WebElement paginationPreviousButton;

    @FindBy(xpath = "//*[@id='merchantListActions_next']")
    public WebElement paginationNextButton;

    @FindBy(xpath = "(//*[text()='Commission'])[1]")
    public WebElement chargeTypeCommission;

    @FindBy(xpath = "(//*[text()='Membership'])[1]")
    public WebElement chargeTypeMembership;

    @FindBy(xpath = "(//*[@class='badge ml-2 customer pending'])[1]")
    public WebElement PendingForApproval;

    @FindBy(xpath = "(//*[@class='badge ml-2 customer active'])[1]")
    public WebElement customerActive;

    @FindBy(xpath = "(//*[@class='zmdi zmdi-border-color'])[1]")
    public WebElement actionsEditButton;

    //ulvi end


    //xaver start
    //Admin Page-de Orders butonu
    @FindBy (xpath = "//*[text()='Orders'])[1]")
    public WebElement OrderButton;

    //Admin Page-de AllOrders butonu
    @FindBy (xpath = "//*[text()='All order']")
    public WebElement AllorderButton;

    //Orders-ın bölümündeki All Orders-a tıkladıkdan sonra yeni sayfada "AllOrders" başlığı
    @FindBy (xpath = ("(//*[text()='All Orders']) [2]"))
    public WebElement AllOrdersTitle;


    //Toplam sifarişler için Orders yazısı
    @FindBy (xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[1]")
    public WebElement OrdersTextBox;

    //Toplam iptal için Cancel yazısı
    @FindBy (xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[2]")
    public WebElement CancelTextBox;

    //Toplam geri iadeler için Refund yazısı
    @FindBy (xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[3]")
    public WebElement RefundTextBox;

    //Toplam meblağ için Total Orders yazısı
    @FindBy (xpath = "(//*[@class='bg-light p-3 mb-3 rounded'])[4]")
    public WebElement TotalOrdersBox;

    //Tarih seçebilmek için "Start date and End date" yazısı
    @FindBy (xpath = "//*[@class='form-control py-2 border-right-0 border']")
    public WebElement StartandEnddateBox;

    //Tarih belirlemek için Calendar butonu
    @FindBy (xpath = "//*[@class='zmdi zmdi-calendar-alt']")
    public WebElement CalendarIcon;

    //Filtreleme butonu
    @FindBy (xpath = "(//*[@class='d-flex'])[6]")
    public WebElement FiltersButton;

    //Kullanıcı profil resmi
    @FindBy (xpath = "(//*[@class='sorting_disabled'])[1]")
    public WebElement ProfilePicture;

    //Kullanıcı bilgileri
    @FindBy (xpath = "(//*[@class='sorting_disabled'])[2]")
    public WebElement OrderInformationText;

    //Siparişlerin ID numarası
    @FindBy (xpath = "//*[@class='sorting sorting_desc']")
    public  WebElement OrderID;

    //Restoran bilgileri
    @FindBy (xpath = "(//*[@class='sorting_disabled'])[3]")
    public WebElement Merchant;

    //Müsteri bilgileri
    @FindBy (xpath = "(//*[@class='sorting_disabled'])[4]")
    public WebElement Customer;

    //View ve Download ikonlarının bulunduğu bölüm
    @FindBy (xpath = "(//*[@class='sorting_disabled'])[5]")
    public WebElement Actions;

    //Siparişin detay bilgileri
    @FindBy (xpath = "(//*[@class='zmdi zmdi-eye'])[1]")
    public WebElement EyeIcon;

    //Sipariş bilgilerinin PDF formatında indirilmesi
    @FindBy (xpath = "(//*[@class='zmdi zmdi-download'])[1]")
    public WebElement DownloadIcon;

    //Toplam giriş sayısını görmek için
    @FindBy (xpath = "//*[@class='dataTables_info']")
    public WebElement DataTableinfo;

    //Sayfaya geri dönmek için Previous butonu
    @FindBy (xpath = "//*[@class='paginate_button page-item previous disabled']")
    public WebElement PreviousButton;

    //Diğer sayfaya geçmek için Next butonu
    @FindBy (xpath = "(//*[@class='page-link'])[9]")
    public WebElement NextButton;

    //xaver end



<<<<<<< HEAD




=======
>>>>>>> main
}
