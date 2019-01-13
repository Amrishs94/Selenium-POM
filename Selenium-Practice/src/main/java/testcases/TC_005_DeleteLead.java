package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_005_DeleteLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC_005_DeleteLead";
		testDescription="Delete a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Amrish";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void DeleteLead(String username ,String pwd,String pNumber) {
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmfsa()
		.clickLeads()
		.clickFindLeads()
		.clicktab()
	     .enterPhoneNumber(pNumber)
		.clickSearch()
		.clickLeadId()
		.clickDeleteLead();
		

}
}