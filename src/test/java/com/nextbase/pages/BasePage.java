package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * parent class for concrete Page object classes
 * provides constructor with initElements method for re-usability
 * abstract - to prevent instantiation.
 */
public  class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
