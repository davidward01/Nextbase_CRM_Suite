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

    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement incorrectLoginText;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeBtn;

    @FindBy(className = "login-link-forgot-pass")
    public WebElement forgotPWBtn;

    @Override
    public void getTitle() {
        Assert.assertTrue("FAIL: Title is not matching expected.", Driver.getDriver().getTitle().contains("Portal"));
    }

    public void onForgotPWPage(){
        String expectedForgotPWTitle = "Get Password";
        String actualForgotPWTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("FAIL: not on get password page", expectedForgotPWTitle, actualForgotPWTitle);
    }
}
