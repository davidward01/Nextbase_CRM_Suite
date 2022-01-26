package com.nextbase.step_definitions;

import com.nextbase.pages.ActivityStreamPage;
import com.nextbase.pages.LoginPage;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;

public class MessageFunctionality_StepDefs {
LoginPage login = new LoginPage();
ActivityStreamPage activityStreamPage = new ActivityStreamPage();

String myMessage ="";
    @Given("User is on Activity Stream Page")
    public void userIsOnActivityStreamPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login.url"));
        login.login("helpdesk26@cybertekschool.com","UserUser");
        login.getTitle();
    }
    @When("User types {string} by clicking Message tab")
    public void userTypesByClickingMessageTab(String message){
        activityStreamPage.messageField.click();
    Driver.getDriver().switchTo().frame(activityStreamPage.iFrameMessageField);
    activityStreamPage.iFrameMessageInput.sendKeys(message);
    Driver.getDriver().switchTo().defaultContent();
    myMessage=message;
    }

    @When("User clicks on send button")
    public void user_clicks_on_send_button() {
    activityStreamPage.sendBtn.click();
    }

    @Then("User should be able to see the message on Activity Stream page")
    public void user_should_be_able_to_see_the_message_on_activity_stream_page() {
        Assert.assertTrue(activityStreamPage.firstMessageOnThePage.getText().contains(myMessage));

    }



}
