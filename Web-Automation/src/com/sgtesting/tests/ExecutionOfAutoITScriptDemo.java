package com.sgtesting.tests;

public class ExecutionOfAutoITScriptDemo {

	public static void main(String[] args) {
		ExecuteAutoIT();

	}
	
	private static void ExecuteAutoIT()
	{
		try
		{
			Runtime.getRuntime().exec("D:\\ExampleAutomation\\Autoit\\TestAutoITScript2.exe");
			
		}catch(Exception e)
		{
			
		}
		
	}

}
