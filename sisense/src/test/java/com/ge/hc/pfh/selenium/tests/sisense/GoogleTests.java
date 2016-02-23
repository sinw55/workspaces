/*
 * GoogleTests.java
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

import org.junit.Test;

import com.ge.hc.pfh.selenium.tests.sisense.pages.MainPage;
import com.ge.hc.pfh.selenium.tests.sisense.utils.WebUiTest;

/**
 * @author shinwoochung
 *
 */
public class GoogleTests extends WebUiTest {
    
    @Test
    public void doGoogleSearchTest() {
        MainPage page = new MainPage(driver);
        page.typeSearchKeyWords( "shinwoo" );
        page.submitSearch();
    }
}
