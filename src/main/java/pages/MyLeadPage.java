package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{
	
	public MyLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//a[text()='Create Lead']")
	private WebElement eleClickCreateLeads;
	
	public CreateLeadPage clickCreateLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickCreateLeads);
		return new CreateLeadPage() ;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleClickMergeLeads;
	
	public MergeLeadsPage clickMergeLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickMergeLeads);
		return new MergeLeadsPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleClickfindLeads;
	
	public FindLeadPage clickFindLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickfindLeads);
		return new FindLeadPage() ;		
	}
	
	
	

}
