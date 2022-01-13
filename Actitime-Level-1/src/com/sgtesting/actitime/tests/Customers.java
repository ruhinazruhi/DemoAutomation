package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;

public class Customers extends Initialize{

	/**
	 * Created By:Ruhinaz
	 * Created Date:13-01-2022
	 * Test case ID:03
	 * Reviewed By:Prabhakar Sir
	 * Reviewed Date:14-01-2022
	 * Parameters:
	 * Return Value:
	 * Purpose:Create,Delete and Modify Customer
	 * Description: This creates the customer ,Deletes the Customer and Modify the Customer programmatically
	 */
	public static void createCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("Customer");
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_descriptionField\"]")).sendKeys("New Customer Domain");
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_titlePlaceholder']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Test case ID:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void modifyCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.className("task_list with-navigation navBottomSpaceHidden  ext-chrome"));
			Thread.sleep(2000);
			oBrowser.findElement(By.className("task_list with-navigation navBottomSpaceHidden  ext-chrome"));
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Test case ID:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Value:
	 * Purpose:
	 * Description:
	 */
	public static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}


