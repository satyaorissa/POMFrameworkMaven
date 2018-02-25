package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit the Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		workBookName="TestData_LeafTaps";
		sheetName="TC_Data004";
	}

	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName, String fName, String CompName) throws InterruptedException {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(fName)
		.clickFindLeadButton()
		.clickFirstLeadIdLink()
		.clickEditButton()
		.updateCompanyName(CompName)
		.clickUpdateLeadButton()
		.verifyCompanyName(CompName);
		
	}

}
