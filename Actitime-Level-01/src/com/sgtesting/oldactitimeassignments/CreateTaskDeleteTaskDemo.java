package com.sgtesting.oldactitimeassignments;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CreateTaskDeleteTaskDemo {

		private static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			createCustomer();
			createProject();
			createTask();
			deleteTask();
			deleteProject();
			deleteCustomer();
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

		private static void createCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("Customer2");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_descriptionField\"]")).sendKeys("New Customer Domain");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='customerLightBox_titlePlaceholder']")).click();
				Thread.sleep(2000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void createProject()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Projectnew");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("projectDescriptionField")).sendKeys("Welcome to new project");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}		
		private static void createTask()
		{
			try
			{
				
						Thread.sleep(1000);
						oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
						Thread.sleep(3000);
						oBrowser.findElement(By.xpath("//div[text()='Create new tasks']")).click();
						Thread.sleep(1000);
						oBrowser.findElement(
								By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input"))
						.sendKeys("Test Script1");
						oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_commitBtn']/div/span")).click();
						Thread.sleep(3000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
		private static void deleteTask()
		{
			try
			{
				oBrowser.findElement(By.xpath("//span[text()='Task']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.className("title ellipsis")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Delete permanently']")).click();
				Thread.sleep(2000);		
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
			private static void deleteProject()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")).click();
				Thread.sleep(2000);		
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		private static void deleteCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
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
				oBrowser.findElement(By.linkText("Logout")).click();
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
	}
