package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_DeleteLead";
		testDescription="Delete Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		workBookName="TestData_LeafTaps";
		sheetName="TC_Data006";
	}

	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd, String fName) throws InterruptedException {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(fName)
		.clickFindLeadButton()
		.CaptureFirstLeadId()
		.clickFirstLeadIdLink()
		.clickDeleteLeadButton()
		.clickFindLeads()
		.enterFirstLeadId()
		.clickFindLeadButton()
		.verifyErrorMsg();
	}

}
