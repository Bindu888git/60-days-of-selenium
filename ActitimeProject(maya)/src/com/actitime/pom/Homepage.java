package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClass;

public class Homepage extends BaseClass {
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskbtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskbtn() {
		return taskbtn;
	}


	
}
