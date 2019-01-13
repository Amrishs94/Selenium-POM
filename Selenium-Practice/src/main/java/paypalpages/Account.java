package paypalpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Account extends ProjectMethods{
	public Account(){
		 PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="country")
	WebElement eleSelectCountry;
	public Account selectCountry(String data) {
		selectDropDownUsingText(eleSelectCountry, data);
		return this;
	}
	
	
}
