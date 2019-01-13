package paypalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUp extends ProjectMethods{
	public SignUp (){
		 PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="radio-personal")
	WebElement radioButton;
	@FindBy(how=How.LINK_TEXT,using="Next")
	WebElement eleClickNext;
	public SignUp clickRadioButton(){
		verifySelected(radioButton);
		return new SignUp();
	}
	public Account clickNext(){
		click(eleClickNext);
		return new Account();
	
	} 
	
	
	
	
}
