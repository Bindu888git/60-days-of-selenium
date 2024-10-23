package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.Homepage;
import com.actitime.pom.Homepage;
import com.actitime.pom.Taskpage;
import com.actitime.pom.Taskpage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		String expectedCustName = f.getExcelData("createCustomer", 1, 1);
		String desc = f.getExcelData("createCustomer", 1, 2);
		Thread.sleep(1000);
		w.verifyTitle("Enter Time-Track");
		Homepage h=new Homepage(driver);	Thread.sleep(1000);
		h.getTaskbtn().click();
		w.verifyTitle("Task List");
		Taskpage t=new Taskpage(driver);
		t.getAddbtn().click();	Thread.sleep(1000);
		t.getcreatecustbtn().click();	
		t.getCustNametbx().sendKeys(expectedCustName);
		t.getcusdestbx().sendKeys(desc);	
		t.getcustlistdrpdwn().click();
		t.getcusdrpdwn().click();
		t.getcreatecustbtn().click();
		String actualCustName = t.getDeletesuccesmessage().getText();	Thread.sleep(1000);
		Assert.assertEquals(actualCustName, expectedCustName);
}
}
