package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {

	public static void main(String[] args) {
		//Create User Scenario
		//LaunchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
		//Initialize.launchBrowser();
		//Initialize.navigate();
		//LoginLogout.login();
		//HomePage.minimizeFlyOutWindow();
		//Users.createUser();
		//Users.deleteUser();
		//LoginLogout.logout();
		//Initialize.closeApplication();
		
		//Create and Modify User Scenario
		//LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
		//Initialize.launchBrowser();
		//Initialize.navigate();
		//LoginLogout.login();
		//HomePage.minimizeFlyOutWindow();
		//Users.createUser();
		//Users.modifyUser();
		//Users.deleteUser();
		//LoginLogout.logout();
		//Initialize.closeApplication();
		
		//create and delete customer scenario
		//LaunchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialize.closeApplication();
		
		//create,delete and modify customer scenario
		//LaunchBrowser-->navigate-->login-->createCustomer-->modifyCustomer-->deleteCustomer-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.modifyCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialize.closeApplication();
		
		//create,delete and modify customer with create and delete project scenario
		//LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->DeleteProject-->deleteCustomer-->logout -->closeApplication
		//Initialize.launchBrowser();
		//Initialize.navigate();
		//LoginLogout.login();
		//HomePage.minimizeFlyOutWindow();
		//Customers.createCustomer();
		//Projects.createProject();
		//Projects.deleteProject();
		//Customers.deleteCustomer();
		//LoginLogout.logout();
		//Initialize.closeApplication();
		
		//create,delete and modify customer with create modify and delete project scenario
		//LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->modifyProject -->DeleteProject-->deleteCustomer-->logout -->closeApplication
		//Initialize.launchBrowser();
		//Initialize.navigate();
		//LoginLogout.login();
		//HomePage.minimizeFlyOutWindow();
		//Customers.createCustomer();
		//Projects.createProject();
		//Projects.modifyProject();
		//Projects.deleteProject();
		//Customers.deleteCustomer();
		//LoginLogout.logout();
		//Initialize.closeApplication();
		
		//create,delete and modify customer with create and delete project and also create and delete the task scenario
		//launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->Create Tasks -->Delete Tasks -->DeleteProject-->deleteCustomer-->logout -->closeApplication
	
		//Initialize.launchBrowser();
		//Initialize.navigate();
		//LoginLogout.login();
	//	HomePage.minimizeFlyOutWindow();
		//Customers.createCustomer();
		//Projects.createProject();
		//Tasks.createTask();
		//Tasks.deleteTask();
		//Projects.modifyProject();
		//Projects.deleteProject();
		//Customers.deleteCustomer();
		//LoginLogout.logout();
		//Initialize.closeApplication();	
	}
}
