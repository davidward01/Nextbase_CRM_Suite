package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public void login(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameField;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordField;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;


    @Override
    public void getTitle() {
        Assert.assertTrue("FAIL: Title is not matching expected.", Driver.getDriver().getTitle().contains("Portal"));
    }
}
