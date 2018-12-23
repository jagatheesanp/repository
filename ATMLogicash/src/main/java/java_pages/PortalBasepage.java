package java_pages;
import org.openqa.selenium.support.PageFactory;

import common.SeleniumCommands;

public class PortalBasepage extends SeleniumCommands{
	public PortalBasepage() {		
		SeleniumCommands.driver=driver;
		PageFactory.initElements(driver, this);
		}
}
