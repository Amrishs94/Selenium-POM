package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OpenTapsCRM extends ProjectMethods {

	public OpenTapsCRM()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
    WebElement eleClearTypedata;
    public OpenTapsCRM clearOpenTapsCRM(String data) {
    	clear(eleClearTypedata);
    	type(eleClearTypedata,data);
    	return this;
       }
  
	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
    WebElement eleSubmit;
    public ViewLead clickUpdate() {
    	click(eleSubmit);
		return new ViewLead();
    }	
 }
