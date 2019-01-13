package paypalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePages extends ProjectMethods{
	public HomePages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="signup-button")
	WebElement eleSignup;
	public SignUp clickSignup()
	{
		click(eleSignup);
		return new SignUp();
	
	}

}
