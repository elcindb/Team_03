package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class merchantPage {

    public merchantPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

}
