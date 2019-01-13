package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	public ViewLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	WebElement eleTypeFirstName;
	public void verifyFirstName(String data) {
		verifyExactText(eleTypeFirstName, data);
	}
	
	@FindBy(how=How.XPATH,using="(//a[@class='subMenuButton'])[3]")
	WebElement eleClickEditButton;
	public OpenTapsCRM clickEditButton()
	{
		click(eleClickEditButton);
		return new OpenTapsCRM();
	}
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	WebElement eleCName;
	public void verifyCompanyName(String data) {
		verifyExactText(eleCName, data);
	}
	@FindBy(how=How.CLASS_NAME, using="subMenuButtonDangerous")
	WebElement eleClickDeleteLead;
	public OpenTapsCRM clickDeleteLead() {
		click(eleClickDeleteLead);
		return  new OpenTapsCRM();
	}
	
	
        
		
	

}
