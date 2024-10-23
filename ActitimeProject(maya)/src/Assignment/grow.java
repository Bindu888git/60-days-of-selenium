package Assignment;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class grow {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://groww.in/calculators/emi-calculator");
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Loan tenure')]/../..//div[contains(@role,'slider')]"));
		String dest = ele.getAttribute("aria-valuenow");
		Actions a=new Actions(driver);
		
		for(int i=10;i>0;i++)
		{
			if(dest.equals(10))
			{
		WebElement ele1 = driver.findElement(By.xpath("//div[contains(text(),'Loan tenure')]/../..//div[contains(@class,'cis93SliderTrack-0')]"));
		int xaxis = ele1.getLocation().getX();
		int yaxis = ele1.getLocation().getY();
		
		a.clickAndHold().perform();
		a.moveByOffset(xaxis, yaxis).perform();
			}
	}
	}
}
