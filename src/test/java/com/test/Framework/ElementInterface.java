package com.test.Framework;

import org.openqa.selenium.WebElement;

public interface ElementInterface {
	
	public WebElement getWebElement(String fileName,String elementName);	
	public boolean verifyDisplayed(WebElement element);
	public boolean verifyEnabled(WebElement element);
	public boolean verifySelected(WebElement element);
	public String getElementText (WebElement element);
	public String getElementAttribute(WebElement element,String attribute);
	public String getElementProperty(WebElement element,String property);
	

}
