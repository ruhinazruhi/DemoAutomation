package com.sgtesting.pageobjectmodel;
import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNDeleteUserDemo {
	private static WebDriver oBrowser=null;
	private static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplication();

	}

	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser()
	{
		try
		{
			Thread.sleep(1000);
			oPage.getCreateUserButton().click();
			Thread.sleep(2000);
			oPage.getCreateUserAddButton().click();
			Thread.sleep(2000);
			oPage.getAddUserFirstName().sendKeys("Mohammed");
			oPage.getAddUserLastName().sendKeys("Sulaiman");
			oPage.getAddUserEmail().sendKeys("mdsulaiman@gmail.com");
			oPage.getUserName().sendKeys("Mohammedsulaiman");
			oPage.getAddUserPassword().sendKeys("Sulaiman123");
			oPage.getAddUserRetypePassword().sendKeys("Sulaiman123");
			Thread.sleep(2000);
			oPage.getCreateUserCreateButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteUser() {
		try {
			Thread.sleep(5000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getDeleteUserDeleteButton().click();
			Alert oa = oBrowser.switchTo().alert();
			Thread.sleep(2000);
			oa.accept();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
