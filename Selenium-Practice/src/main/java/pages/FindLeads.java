package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
public class FindLeads extends ProjectMethods{
	

public FindLeads(){
	 PageFactory.initElements(driver, this);
}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	WebElement eleTypeFirstName;
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	WebElement eleClickSearchFindLeads;
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	WebElement eleClickLeadId;
	public FindLeads enterFirstName(String data) {
		type(eleTypeFirstName,data);
	    return this;
	}
	@FindBy(how=How.ID,using="ext-gen280")
	WebElement eleEnterPhoneNumber;
	public FindLeads enterPhoneNumber(String data ) {
		type(eleEnterPhoneNumber,data);
		return this;
	}
	
    public FindLeads clickSearch() {
	   click(eleClickSearchFindLeads);
	   return this;
   }
    public ViewLead clickLeadId() {
    	click(eleClickLeadId);
    	return new ViewLead();
    }
	
    @FindBy(how=How.CLASS_NAME,using="x-tab-strip-text")
    WebElement eletab;
    public FindLeads clicktab() {
    	selectDropDownUsingIndex(eletab, 1);
		return this;
    } 
    
    
}