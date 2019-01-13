package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
 public CreateLead(){
	 PageFactory.initElements(driver, this);
 } 
	@FindBy(how=How.ID, using="createLeadForm_companyName")
	WebElement eleTypeCompanyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	WebElement eleTypeFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	WebElement eleTypeLastName;
	@FindBy(how=How.NAME, using="submitButton")
	WebElement eleClickSubmitButton;
	
	public CreateLead enterCompanyName(String data) {
		type(eleTypeCompanyName, data);
		return this;
	}
    public CreateLead enterFirstName(String data) {
			type(eleTypeFirstName, data);
			return this;
    }
	 public CreateLead enterLastName(String data) {
				type(eleTypeLastName, data);
				return this;
	 }
	 public ViewLead clickSubmitButton() {
		 click(eleClickSubmitButton);
		 return new ViewLead();
	 }
	
	
	
}
