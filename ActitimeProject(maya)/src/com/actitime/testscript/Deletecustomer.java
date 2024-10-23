package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.pom.Homepage;
import com.actitime.pom.Taskpage;
import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class Deletecustomer extends BaseClass {
	
@Test
public void deletecustomer() throws InterruptedException, EncryptedDocumentException, IOException
{	String search = f.getExcelData("", 0, 0);
	Homepage h=new Homepage(driver);
	Taskpage t=new Taskpage(driver);
	h.getTaskbtn().click();
	t.getSearchbox().sendKeys("Maya");
	t.getSettingbtn().click();
	Thread.sleep(2000);
	t.getActionsbtn().click();
	t.getDeletebtn().click();
	Thread.sleep(2000);
	t.getPermanentlydeletebtn();
	Thread.sleep(2000);
	String message = t.getDeletesuccesmessage().getText();
	Reporter.log(message,true);
	Assert.assertEquals(message,"Customer '"+search+"' has been deleted");
}
}
