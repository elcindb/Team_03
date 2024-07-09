package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class userPage {

    public userPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
