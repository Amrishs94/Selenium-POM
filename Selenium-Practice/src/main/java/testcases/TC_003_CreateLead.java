package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_003_CreateLead extends ProjectMethods{
	@BeforeTest
		public void setData() {
			testCaseName="TC_003_CreateLead";
			testDescription="Create a Lead";
			testNodes="Leads";
			category="Smoke";
			authors="Amrish";
			browserName="chrome";
			dataSheetName="TC003";
		}
		@Test(dataProvider="fetchData")
		public void CreateLead(String username ,String pwd,String cname, String fName, String lName) {
			
			new LoginPage()
			.enterUserName(username)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCrmfsa()
			.clickLeads()
			.clickCreateLead()
			.enterCompanyName(cname)
			.enterFirstName(fName)
			.enterLastName(lName)
			.clickSubmitButton()
			.verifyFirstName(fName);
		}


}
