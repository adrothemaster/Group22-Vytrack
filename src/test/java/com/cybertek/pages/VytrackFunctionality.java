package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackFunctionality {

    public VytrackFunctionality(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement enterUserName;

    @FindBy(id = "prependedInput2")
    public WebElement enterPassWord;

    @FindBy(id = "_submit")
    public WebElement submitButton;

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement fleetDropdownMenu;

    @FindBy(linkText = "Vehicles")
    public WebElement vehiclesLink;

    @FindBy(xpath = "//a[@title='Reset']/i")
    public WebElement resetButton;

    @FindBy(xpath = "//a[@title='Grid Settings']/i")
    public WebElement gridSettingsButton;

    @FindBy(xpath = "//*[@id='user-menu']/a/i")
    public WebElement rightMostElement;

}
