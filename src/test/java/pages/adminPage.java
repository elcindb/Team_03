package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class adminPage {
    public adminPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

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







}
