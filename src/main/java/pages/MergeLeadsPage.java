package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{

	public MergeLeadsPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleClickFromLeadFirstImg;

	public FindLeadNewWindowPage clickFromLeadFirstImg() {
		click(eleClickFromLeadFirstImg);
		switchToWindow(1);
		return new FindLeadNewWindowPage() ;		
	}

	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleClickFromLeadSecondImg;

	public FindLeadNewWindowPage clickFromLeadSecondImg() {
		click(eleClickFromLeadSecondImg);
		switchToWindow(1);
		return new FindLeadNewWindowPage() ;		
	}
	@FindBy(how=How.XPATH,using="//a[@class='buttonDangerous']")
	private WebElement eleClickMergeLeads;
	
	public MyLeadPage clickMergeButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickMergeLeads);
		acceptAlert();
		return new MyLeadPage();		
	}

	
}

