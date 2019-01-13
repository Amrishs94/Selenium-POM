package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_004_EditLead extends ProjectMethods {
	@BeforeTest 
	public void setData() {
		testCaseName="TC_004_EditLead";
		testDescription="Edit a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Amrish";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void EditLead(String username ,String pwd,String fName, String cName, String companyName) {
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmfsa()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(fName)
		.clickSearch()
		.clickLeadId()
		.clickEditButton()
		.clearOpenTapsCRM(cName)
		.clickUpdate()
		.verifyCompanyName(companyName);

}
}