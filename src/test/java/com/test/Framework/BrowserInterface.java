package com.test.Framework;

import org.openqa.selenium.WebDriver;

public interface BrowserInterface {
	
	public WebDriver openBowser(String browser);
	public void maximizeWindow();
	public void minimizeWindow();
	public void openUrl(String url);
	public String getPageTitle();
	public String getPageSourceValue();
	public String getCurrentPageUrl();
	public void closeBrowser(); //close the current opened page
	public void quitBrowser(); // close all the pages controlled by the drver
	
	public void navigateUrl(String url);
	public void navigateBack();
	public void navigateForward();
	public void navigateRefresh();
	
	

}
