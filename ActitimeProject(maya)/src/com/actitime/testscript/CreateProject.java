package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.Homepage;
import com.actitime.pom.Taskpage;
import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateProject extends BaseClass{

@Test
public void createproject() throws EncryptedDocumentException, IOException
{
	String projectName = f.getExcelData("", 0, 0);
	String descrpition=f.getExcelData("", 0, 0);
	Homepage h= new Homepage(driver);
	Taskpage t= new Taskpage(driver);
	h.getTaskbtn().click();
	t.getAddbtn().click();
	t.getAddprjtbtn().click();
	t.getPrjtnametbx().sendKeys(projectName);
	t.getpjtlistdropdown().click();
	t.getPdropdown().click();
	t.getPjtdescription().sendKeys(descrpition);
	t.getCrtprjtbtn().click();
	String test = t.getSuccesstext().getText();
	Reporter.log(test,true);
	Assert.assertEquals(test,"Project '"+projectName+"' has been creted successfully");
}
}
