package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	public FindLeadPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;

	public FindLeadPage enterFirstName(String data) {
		type(eleFirstName,data);
		return this ;		
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleClickFindLeadButton;

	public FindLeadPage clickFindLeadButton() throws InterruptedException {
		click(eleClickFindLeadButton);
		Thread.sleep(5000);
		return this ;		
	}
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement eleVerifyError;

	public FindLeadPage verifyErrorMsg() {
		verifyPartialText(eleVerifyError, "No records to display");
		return this ;		
	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1])[1]")
	private WebElement eleClickFirstLeadIdLink;

	public ViewLeadsPage clickFirstLeadIdLink() {
		click(eleClickFirstLeadIdLink);
		return new ViewLeadsPage() ;		
	}

	@FindBy(how=How.XPATH,using="//div[@class='x-form-element']/input[@name='id']")
	public WebElement eleFirstLeadId;

	public FindLeadPage enterFirstLeadId() {
		type(eleFirstLeadId, FirstleadID);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-form-element']/input[@name='id']")
	public WebElement eleSecondLeadId;

	public FindLeadPage enterSecondLeadId() {
		type(eleSecondLeadId, SecondleadID);
		return this;		
	}

	//verifyExactAttribute

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1])[1]")
	private WebElement eleverifySearchedLeadId;

	public FindLeadPage verifySearchedLeadId() {
		verifyExactText(eleverifySearchedLeadId, SecondleadID);
		return this ;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1])[1]")
	public WebElement eleCaptureFirstLeadId;
	
	public FindLeadPage CaptureFirstLeadId() {
		FirstleadID = getText(eleCaptureFirstLeadId);
		System.out.println(FirstleadID);
		return this;		
	}
}
