package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadNewWindowPage extends ProjectMethods{
	
	public FindLeadNewWindowPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.NAME,using="firstName")
	private WebElement eleFirstName;
	
	public FindLeadNewWindowPage enterFirstName(String data) {
		type(eleFirstName,data);
		return this ;		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleClickFindLeadButton;
	
	public FindLeadNewWindowPage clickFindLeadButton() throws InterruptedException {
		click(eleClickFindLeadButton);
		Thread.sleep(3000);
		return this ;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1])[1]")
	public WebElement eleCaptureFirstLeadId;
	
	public FindLeadNewWindowPage captureFirstLeadId() {
		FirstleadID = getText(eleCaptureFirstLeadId);
		System.out.println(FirstleadID);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1])[1]")
	public WebElement eleCaptureSecondLeadId;
	
	public FindLeadNewWindowPage captureSecondLeadId() {
		SecondleadID = getText(eleCaptureSecondLeadId);
		System.out.println(SecondleadID);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")
			//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1])[1]")
	private WebElement eleClickFirstLeadIdLink;
	
	public MergeLeadsPage clickFirstLeadIdLink() throws InterruptedException {
		click(eleClickFirstLeadIdLink);
		switchToWindow(0);
		return new MergeLeadsPage() ;		
	}
	
	
	

}
