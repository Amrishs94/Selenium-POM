package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import paypalpages.Account;
import paypalpages.HomePages;
import paypalpages.SignUp;
import wdMethods.ProjectMethods;

public class PayPalTestCase extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="PayPalTestCase";
		testDescription="PayPalSignup";
		testNodes="Leads";
		category="Smoke";
		authors="Amrish";
		browserName="chrome";
		dataSheetName="PayPal";
	}
	@Test(dataProvider="fetchData")
	public void PayPalTestCase(String country) {
		new HomePages()
		.clickSignup()
		.clickRadioButton()
		.clickNext()
		.selectCountry(country);
		
	}
		



	     
		
	
		
		
	
	

}
