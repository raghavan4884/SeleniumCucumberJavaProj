package com.test.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserImplementation implements BrowserInterface{

	public static WebDriver driver;
	
	@Override
	public WebDriver openBowser(String browser) {
		// TODO Auto-generated method stub
		try
		{
			switch(browser)
			{
			case "Edge":
			{
				System.setProperty("webdriver.edge.driver", "/Dependencies/edgedriver_win64/msedgedriver.exe");
				driver=new EdgeDriver();
				break;
			}
			case "Chrome":
			{
				System.setProperty("webdriver.chrome.driver","/Dependencies/chromedriver_win32/chromedriver.exe");
				driver=new ChromeDriver();
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
		return driver;
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		
		try
		{
			driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void minimizeWindow() {
		// TODO Auto-generated method stub
		
		try
		{
			driver.manage().window().minimize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void openUrl(String url) {
		// TODO Auto-generated method stub
		try
		{
			driver.get(url);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		String title=null;
		try
		{
			title=driver.getTitle();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return title;
	}

	@Override
	public String getPageSourceValue() {
		// TODO Auto-generated method stub
		String pageSource=null;
		try
		{
			pageSource=driver.getPageSource();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getCurrentPageUrl() {
		// TODO Auto-generated method stub
		String currentUrl=null;
		try
		{
			currentUrl=driver.getCurrentUrl();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return currentUrl;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try
		{
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void quitBrowser() {
		// TODO Auto-generated method stub
		
		try
		{
			driver.quit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void navigateUrl(String url) {
		// TODO Auto-generated method stub
		
		try
		{
			driver.navigate().to(url);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void navigateBack() {
		// TODO Auto-generated method stub
		
		try
		{
			driver.navigate().back();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void navigateForward() {
		// TODO Auto-generated method stub
		
		try
		{
			driver.navigate().forward();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void navigateRefresh() {
		// TODO Auto-generated method stub
		
		try
		{
			driver.navigate().refresh();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
