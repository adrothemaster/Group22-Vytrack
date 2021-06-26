package com.cybertek.tests.week5;

import com.cybertek.pages.VytrackFunctionality;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS6 {
    @BeforeTest
    public void setup(){
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        VytrackFunctionality vytrack = new VytrackFunctionality();
        vytrack.enterUserName.sendKeys("user162");
        vytrack.enterPassWord.sendKeys("UserUser123");
        vytrack.submitButton.click();
        vytrack.fleetDropdownMenu.click();
        vytrack.vehiclesLink.click();
    }

    @Test
    public void test_case_6_test(){
        VytrackFunctionality locator = new VytrackFunctionality();

        //get x,y coordinates of grid settings button
        Point gridSettingLocation = locator.gridSettingsButton.getLocation();
        System.out.println("grid settings button location = " + gridSettingLocation);

        //get x,y coordinates of reset button
        Point resetButtonLocation = locator.resetButton.getLocation();
        System.out.println("reset Button Location = " + resetButtonLocation);

        //compare 2 x locations to verify that grid setting button is further
        //right than reset button (larger x value)

        Assert.assertTrue(gridSettingLocation.getX()>resetButtonLocation.getX());


    }

    @AfterTest
    public void tearDown(){
        Driver.getDriver().close();
    }
}
