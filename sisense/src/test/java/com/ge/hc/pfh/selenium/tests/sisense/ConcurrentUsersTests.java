/*
 * ConcurrentUsersTests.java
 * 
 * Copyright (c) 2016 by General Electric Company. All rights reserved.
 * 
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.hc.pfh.selenium.tests.sisense;

import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ge.hc.pfh.selenium.tests.sisense.pages.GeSecurityPage;

/**
 * @author shinwoochung
 *
 */
public class ConcurrentUsersTests {
    
    // Before each test execution
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
    }
    
    @Test
    public void triggerMultipleUsers() {
        for( int i = 0; i < 2; i++) {
            final UUID uuid = UUID.randomUUID();
            final WebDriver driver = new ChromeDriver();
            try {
                new Thread( new Runnable() {

                    public void run() {
                        // TODO Auto-generated method stub
                        driver.get( "http://www.google.com" );
                        final GeSecurityPage page = new GeSecurityPage( driver );
                        page.doLogin( "username", "password" );
                        System.out.println(uuid);
                    }
                    
                }).start();
            } catch( Exception ex ) {
                
            } finally {
                if( driver != null ) {
                    driver.quit();
                }
            }
        }
    }
}