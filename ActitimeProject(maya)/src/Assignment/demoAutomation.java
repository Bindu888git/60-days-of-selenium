package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement trgt = driver.findElement(By.linkText("SwitchTo"));
		Actions a= new Actions(driver);
		a.moveToElement(trgt).perform();
		driver.findElement(By.linkText("Frames")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();Thread.sleep(2000);
		driver.switchTo().frame(1);Thread.sleep(2000);
		//driver.switchTo().frame(1);Thread.sleep(2000);
		driver.switchTo().frame(0);Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello world");
		
	}

}
