package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleUpdateCompanyName;
	
	public EditLeadPage updateCompanyName(String data) {
		type(eleUpdateCompanyName,data);
		return this ;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickUpdateLeadButton;
	
	public ViewLeadsPage clickUpdateLeadButton() {
		click(eleClickUpdateLeadButton);
		return new ViewLeadsPage() ;		
	}
	
	

}
