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

    @Then("I should be on the homepage")
    public void i_should_be_on_the_homepage() {
        loginPage.getTitle();
    }
}
