package mytestcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import common.SeleniumCommands;
import java_pages.LogicashPortal;

@Listeners({ATUReportsListener.class,ConfigurationListener.class,MethodListener.class})
public class LoginValidation extends SeleniumCommands 
{
	
	{
		System.setProperty("atu.reporter.config", "./config/atu.properties");
	}
	@BeforeSuite
	public void preConditions() {
		launchChromeDriver();
		launchURL("http://lens.logicash.co.in/ATM/index.php");
	}
	
	@Test
	public void testUserLogin()  {
	LogicashPortal first=new LogicashPortal();
		first.typeUserID("FSS01");
		first.clickSignIn();
		
	
	LogicashPortal second=new LogicashPortal();
		second.typeUserID("FSS01");
		second.typePassword("Fss123");
		second.clickSignIn();
	}
	

}
