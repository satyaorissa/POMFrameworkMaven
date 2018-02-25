package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="Merge two Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		workBookName="TestData_LeafTaps";
		sheetName="TC_Data005";
	}

	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd, String fNameFromMerge, String fNameToMerge) throws InterruptedException {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickMergeLeads()
		
		.clickFromLeadFirstImg()
		.enterFirstName(fNameFromMerge)//Enter the first name From merged in the Popoup window
		.clickFindLeadButton()
		.captureFirstLeadId()   //Capture first LeadID
		.clickFirstLeadIdLink()
				
		.clickFromLeadSecondImg()
		.enterFirstName(fNameToMerge) //Enter the first name To merged in the Popoup window
		.clickFindLeadButton()
		.captureSecondLeadId()   //Capture 2nd LeadID
		.clickFirstLeadIdLink()
		.clickMergeButton()
		
		.clickFindLeads()
		.enterSecondLeadId()
		.clickFindLeadButton()
		.verifySearchedLeadId() //It will get the record
		
		.enterFirstLeadId()
		.clickFindLeadButton() //It will not get the record
		 .verifyErrorMsg(); //Record not found error gets displayed
				
		
	}

}
