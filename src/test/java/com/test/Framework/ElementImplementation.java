package com.test.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.test.Utilitites.*;
public class ElementImplementation  extends BrowserImplementation implements ElementInterface {

	
	@Override
	public WebElement getWebElement(String fileName,String elementName) {
		// TODO Auto-generated method stub
		
		WebElement element=null;
		try
		{
		String value=null;
		XMLUtils xu=new XMLUtils();
		value=xu.readXML(fileName, elementName);
		String valueArray[]=value.split("~");
		String locatorType=valueArray[0];
		String locatorValue=valueArray[1];
		switch(locatorType)
		{
		case "id":
		{
			driver.findElement(By.id(locatorValue));
			break;
		}
		case "name":
		{
			driver.findElement(By.name(locatorValue));
			break;
		}
		case "className":
		{
			driver.findElement(By.className(locatorValue));
			break;
		}
		case "tagName":
		{
			driver.findElement(By.tagName(locatorValue));
			break;
		}
		
		case "linkText":
		{
			driver.findElement(By.linkText(locatorValue));
			break;
		}
		case "partialLinkText":
		{
			driver.findElement(By.partialLinkText(locatorValue));
			break;
			
		}
		case "xpath":
		{
			driver.findElement(By.xpath(locatorValue));
			break;
			
		}
		case "cssSelector":
		{
			driver.findElement(By.cssSelector(locatorValue));
			break;
		}
		default:
		{
			System.out.println("Please enter correct value");
			break;
		}
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public boolean verifyDisplayed(WebElement element) {
		// TODO Auto-generated method stub
		
		boolean b=false;
		try
		{
			b=element.isDisplayed();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean verifyEnabled(WebElement element) {
		// TODO Auto-generated method stub
		boolean b=false;
		try
		{
			b=element.isEnabled();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean verifySelected(WebElement element) {
		// TODO Auto-generated method stub
		boolean b=false;
		try
		{
			b=element.isSelected();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String getElementText(WebElement element) {
		// TODO Auto-generated method stub
		String value=null;
		try
		{
			value=element.getText();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return value;
	}

	@Override
	public String getElementAttribute(WebElement element, String attribute) {
		// TODO Auto-generated method stub
		String value=null;
		try
		{
			value=element.getAttribute(attribute);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}

	@Override
	public String getElementProperty(WebElement element, String property) {
		// TODO Auto-generated method stub
		String value=null;
		try
		{
			value=element.getCssValue(property);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	} 

	
}
