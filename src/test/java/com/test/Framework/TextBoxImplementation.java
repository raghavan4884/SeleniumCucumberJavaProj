package com.test.Framework;

import org.openqa.selenium.WebElement;

public class TextBoxImplementation extends ElementImplementation implements TextBoxInterface {
	@Override
	public void clickElement(WebElement element) {
		
		// TODO Auto-generated method stub
		
		try
		{
			boolean displayed=verifyDisplayed(element);
			boolean enabled=verifyEnabled(element);
			if((displayed=true)&&(enabled=true))
			{
			element.click();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void clearElement(WebElement element) {
		// TODO Auto-generated method stub
		try
		{
			boolean displayed=verifyDisplayed(element);
			boolean enabled=verifyEnabled(element);
			if((displayed=true)&&(enabled=true))
			{
			element.clear();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void sendValueToElement(WebElement element,String value) {
		// TODO Auto-generated method stub
		try
		{
			boolean displayed=verifyDisplayed(element);
			boolean enabled=verifyEnabled(element);
			if((displayed=true)&&(enabled=true))
			{
			element.sendKeys(value);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	
	

}
