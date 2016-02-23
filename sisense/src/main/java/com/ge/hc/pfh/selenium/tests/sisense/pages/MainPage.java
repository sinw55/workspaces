/*
 * MainPage.java
 * 
 * Copyright (c) 2016 by General Electric Company. All rights reserved.
 * 
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
package com.ge.hc.pfh.selenium.tests.sisense.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ge.hc.pfh.selenium.tests.sisense.utils.SeleniumExtension;

/**
 * @author shinwoochung
 *
 */
public class MainPage extends SeleniumExtension {
    
    By searchBoxLocator = By.id( "lst-ib" );
    
    public MainPage( WebDriver driver ) {
        super( driver );
    }
    
    public MainPage typeSearchKeyWords( String searchKeyWords ) {
        findElementExplicitly( searchBoxLocator ).sendKeys( searchKeyWords );
        return this;
    }
    
    public MainPage submitSearch() {
        findElementExplicitly( searchBoxLocator ).submit();
        return this;
    }
}
