package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//a[text()='Leads']")
	private WebElement eleClickLeads;
	
	public MyLeadPage clickLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickLeads);
		return new MyLeadPage();		
	}
	
	
	

}
