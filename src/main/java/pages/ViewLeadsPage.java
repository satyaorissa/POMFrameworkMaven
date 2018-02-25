package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods{

	public ViewLeadsPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;

	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}

	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Selenium Automation Engineer')]]")
	private WebElement eleLoggedName;

	public ViewLeadsPage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;		
	}

	@FindBy(how=How.LINK_TEXT, using="CRM/SFA")
	private WebElement eleClickCrmSFA;

	public MyHomePage clickCrmsfa() {
		click(eleClickCrmSFA);	
		return new MyHomePage();		
	}

	@FindBy(how=How.XPATH, using="//a[@class='subMenuButton'][3]")
	private WebElement eleClickEdit;

	public EditLeadPage clickEditButton() {
		click(eleClickEdit);	
		return new EditLeadPage();		
	}

	/*	@FindBy(how=How.XPATH,using="//span[text()[contains(.,'SatyComp')]]")
	//span[text()[contains(.,'"+ur parameter arg+"')]])
	private WebElement eleCompanyName;

	public ViewLeadsPage verifyCompanyName(String data) {
		verifyPartialText(eleCompanyName, data);
		return this;		
	}*/

	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyName;

	public ViewLeadsPage verifyCompanyName(String data) {
		verifyPartialText(eleCompanyName, data);
		return this;	
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='subMenuButtonDangerous']")
	private WebElement eleClickDeleteLeadButton;

	public MyLeadPage clickDeleteLeadButton() {
		click(eleClickDeleteLeadButton);
		return new MyLeadPage() ;		
	}

}
