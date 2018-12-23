package java_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogicashPortal extends PortalBasepage{

		
		@FindBy(name="Username")
		WebElement userid;
		
		@FindBy(name="Password")
		WebElement pwd;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement signin;
		
		public LogicashPortal typeUserID(String uid) {
			type(userid, uid);
			return this;
		}
		
		public LogicashPortal typePassword(String pswd) {
			type(pwd, pswd);
			return this;
		}

		public Dashboard clickSignIn() {
			click(signin);
		return new Dashboard();
	}
	

}
