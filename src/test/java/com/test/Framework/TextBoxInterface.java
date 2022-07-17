package com.test.Framework;

import org.openqa.selenium.WebElement;

public interface TextBoxInterface {
	
	public void clickElement(WebElement element);
	public void clearElement(WebElement element);
	public void sendValueToElement(WebElement element,String value);


}
