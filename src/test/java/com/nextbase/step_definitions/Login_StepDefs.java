package com.nextbase.step_definitions;

import com.nextbase.pages.LoginPage;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login.url"));
    }

    @When("I enter valid username {string} and password {string}")
    public void i_enter_valid_username_and_password(String str1, String str2) {
        loginPage.login(str1, str2);
    }

    @Then("I should be on the Activity Stream page")
    public void i_should_be_on_the_homepage() {
        loginPage.getTitle();
    }

    @When("I enter invalid username {string} and password {string}")
    public void i_enter_invalid_username_and_password(String str1, String str2) {
        loginPage.login(str1, str2);
    }

    @Then("I should me shown invalid login or password message")
    public void i_should_me_shown_invalid_login_or_password_message() {
        loginPage.incorrectLoginText.isDisplayed();
    }

    @When("I check remember me button")
    public void i_check_remember_me_button() {
        loginPage.rememberMeBtn.click();
    }

    @Then("I should see the button is checked")
    public void i_should_see_the_button_is_checked() {
        loginPage.rememberMeBtn.isSelected();
    }

    @When("I click Forgot My password")
    public void i_click_forgot_my_password() {
        loginPage.forgotPWBtn.click();
    }

    @Then("I should be brought to Forgot My Password page")
    public void i_should_be_brought_to_forgot_my_password_page() {
        loginPage.onForgotPWPage();
    }
}
