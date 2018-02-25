package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_LoginAndLogout_NegVal extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_Validate_Login_Error";
		testDescription="Validate the Login Error";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		workBookName="TestData_LeafTaps";
		sheetName="TC_Data002";
	}

	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogInForFailer()
		.verifyLoginErrorMessage(vName);

	}

}
