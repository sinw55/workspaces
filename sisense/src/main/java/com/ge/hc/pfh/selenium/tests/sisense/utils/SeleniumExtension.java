/*
 * SeleniumActionExtension.java
 * 
 * Copyright (c) 2016 by General Electric Company. All rights reserved.
 * 
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.hc.pfh.selenium.tests.sisense.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author shinwoochung
 *
 */
public class SeleniumExtension {
    protected WebDriver driver;
    // set this value from config file, but now just set it for 60 secs
    protected int timeout = 60;
    
    public SeleniumExtension(WebDriver driver) {
        this.driver = driver;
    }
    
    protected WebElement findElementExplicitly(By locator) {
        return (new WebDriverWait(driver, timeout))
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
