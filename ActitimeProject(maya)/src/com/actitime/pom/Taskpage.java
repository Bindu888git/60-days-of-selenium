package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClass;

public class Taskpage extends BaseClass {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement addcustbtn;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement custNametbx;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement cusdestbx;
	
	@FindBy(xpath="//button[contains(text(),'Select an active customer')]")
	private WebElement custlistdrpdwn;
	
	@FindBy(linkText="Media Agency")
	private WebElement cusdrpdwn;
	
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement createcustbtn;
	/////////////////////////////////////////////////
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement addprjtbtn;
	
	@FindBy(id="projectPopup_projectNameField")
	private WebElement prjtnametbx;
	
	@FindBy(xpath="//button[contains(text(),'Select Customer to Add Project for')]")
	private WebElement pjtlistdropdown;
	
	@FindBy(linkText="Boston Chocolate")
	private WebElement pdropdown;
	
	@FindBy(name="projectDescriptionField")
	private WebElement pjtdescription;
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement crtprjtbtn;
	///////////////////////////////////////////////////////////////////////////
	@FindBy(xpath="//input[contains(@placeholder,'Start typing name')]")
	private WebElement searchbox;
	
	@FindBy(xpath="//span[@class='highlightToken']/../../div[@class='editButton available']")
	private WebElement settingbtn;
	
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement actionsbtn;
	
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement deletebtn;
	
	@FindBy(id="customerPanel_deleteConfirm_submitBtn")
	private WebElement permanentlydeletebtn;
	
	@FindBy(xpath="//div[@class=innerHtml]")
	private WebElement deletesuccesmessage;
	////////////////////////////////////////////////////
	@FindBy(id="logoutLink")
	private WebElement Logout;
	
	
	//String message = driver.findElement(By.xpath("//div[@class=\"toast\"]")).getText();
	
	

	public WebElement getLogout() {
		return Logout;
	}

	@FindBy(xpath="//span[@class=\\\"innerHtml\\\"]")
	private WebElement successtext;
	
	public Taskpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSuccesstext() {
		return successtext;
	}

	public void setSuccesstext(WebElement successtext) {
		this.successtext = successtext;
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getAddcustbtn() {
		return addcustbtn;
	}

	public WebElement getCustNametbx() {
		return custNametbx;
	}

	public WebElement getcusdestbx() {
		return cusdestbx;
	}

	public WebElement getcustlistdrpdwn() {
		return custlistdrpdwn;
	}

	public WebElement getcusdrpdwn() {
		return cusdrpdwn;
	}

	public WebElement getcreatecustbtn() {
		return createcustbtn;
	}

	public WebElement getAddprjtbtn() {
		return addprjtbtn;
	}

	public WebElement getPrjtnametbx() {
		return prjtnametbx;
	}

	public WebElement getpjtlistdropdown() {
		return pjtlistdropdown;
	}

	public WebElement getPdropdown() {
		return pdropdown;
	}

	public WebElement getPjtdescription() {
		return pjtdescription;
	}

	public WebElement getCrtprjtbtn() {
		return crtprjtbtn;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSettingbtn() {
		return settingbtn;
	}

	public WebElement getActionsbtn() {
		return actionsbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getPermanentlydeletebtn() {
		return permanentlydeletebtn;
	}

	public WebElement getDeletesuccesmessage() {
		return deletesuccesmessage;
	}
	
}
