package com.sgtesting.tests;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AdvancedDemo1 {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {

	launchBrowser();
	navigate();
	login();
	minimizeFlyOutWindow();
	createUser1();
	createUser2();
	createUser3();
	loginUser1();
	logout();
	loginUser1();
	logoutUser1();
	loginUser2();
	logoutUser2();
	loginUser3();
	logoutUser3();
	loginasAdmin(); 
	loginUserUpdated1();
	loginUserUpdated2();
	//logoutUser2();
   loginUserUpdated3();
   logoutAd();
	//logoutUpatedUser1();
}

	//deleteUser();
	//logout();
	//closeApplication();
//}

private static void launchBrowser()
{
	try
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
		oBrowser=new ChromeDriver();
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
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void createUser1()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
		oBrowser.findElement(By.name("lastName")).sendKeys("User1");
		oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
		oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void createUser2()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("Ruhi");
		oBrowser.findElement(By.name("lastName")).sendKeys("Naz");
		oBrowser.findElement(By.name("email")).sendKeys("Ruhi@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("ruUser1");
		oBrowser.findElement(By.name("password")).sendKeys("Welfare123");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welfare123");
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void createUser3()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("Sayeeda");
		oBrowser.findElement(By.name("lastName")).sendKeys("Naz");
		oBrowser.findElement(By.name("email")).sendKeys("sayeeda@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("saUser1");
		oBrowser.findElement(By.name("password")).sendKeys("Welfare1234");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welfare1234");
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void logout()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void loginUser1() {
	try {
		oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
		oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		Thread.sleep(4000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

static void logoutUser1() {
	try {
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

private static void loginUser2() {
	try {
		oBrowser.findElement(By.id("username")).sendKeys("ruUser1");
		oBrowser.findElement(By.name("pwd")).sendKeys("Welfare123");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		Thread.sleep(4000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

static void logoutUser2() {
	try {
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

private static void loginUser3() {
	try {
		oBrowser.findElement(By.id("username")).sendKeys("saUser1");
		oBrowser.findElement(By.name("pwd")).sendKeys("Welfare1234");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		Thread.sleep(4000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

static void logoutUser3() {
	try {
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
private static void loginasAdmin()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void loginUserUpdated1() {
	try {
		oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
		oBrowser.findElement(By.name("pwd")).sendKeys("Welcome123");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		Thread.sleep(4000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

private static void loginUserUpdated2() {
	try {
		oBrowser.findElement(By.id("username")).sendKeys("ruUser1");
		oBrowser.findElement(By.name("pwd")).sendKeys("Welfare123");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		Thread.sleep(4000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

private static void loginUserUpdated3() {
	try {
		oBrowser.findElement(By.id("username")).sendKeys("saUser1");
		oBrowser.findElement(By.name("pwd")).sendKeys("Welfare1234");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
		Thread.sleep(4000);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

private static void logoutAd()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}





}