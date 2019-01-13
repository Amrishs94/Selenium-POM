package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebTables {

	public static void main(String[] args) {
		 
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//enter username 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//enter password
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByXPath("//a[text()='Accounts']").click();
		WebElement element = driver.findElementByXPath("(//a[contains(text(),'Nikii')]/parent::div/parent::td//preceding-sibling::td)[3");
	    element.click();

	
	}

}
