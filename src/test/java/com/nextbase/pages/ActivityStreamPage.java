package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage{

@FindBy(xpath = "//span[.='Send message …']")
public WebElement messageField;

@FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
public WebElement iFrameMessageField;

@FindBy(id = "blog-submit-button-save")
public WebElement sendBtn;

@FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement iFrameMessageInput;

@FindBy(xpath = "(//div[@id='feed-loader-container']//following-sibling::div//div)[1]")
    public WebElement firstMessageOnThePage;

}
