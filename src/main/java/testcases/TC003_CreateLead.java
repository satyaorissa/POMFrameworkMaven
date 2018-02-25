package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="login to LeafTaps And Create Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		workBookName="TestData_LeafTaps";
		sheetName="TC_Data003";
	}

	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName,String compName, String fName, String lName) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLeads()
		.enterCompanyName(compName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton();
		//.clickLogOut();

	}

}
