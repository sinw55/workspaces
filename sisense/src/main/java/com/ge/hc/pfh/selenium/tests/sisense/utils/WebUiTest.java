/*
 * WebUiTest.java
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

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author shinwoochung
 *
 */
public class WebUiTest {
    protected WebDriver driver;
    
    @BeforeClass
    public static void config() {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
    }
    
    // Before each test execution
    @Before
    public void setup() {
        // should be from some profile/setting location
        String url = "http://www.google.com";
        this.driver = new ChromeDriver();
        driver.get( url );
    }
    
    // After each test execution
    @After
    public void teardown() {
        driver.quit();
    }
}
