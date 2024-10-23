package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragNDdrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Actions a= new Actions(driver);
	for(int i=1;i<=7;i++)
	{
	WebElement src = driver.findElement(By.id("box"+i+""));
	for(int j=1;j<=7;j++)
	{
	WebElement dest = driver.findElement(By.xpath("(//div[@class='dragableBoxRight'])["+j+"]"));
	a.dragAndDrop(src,dest).perform();
	WebElement src1 = driver.findElement(By.id("box"+i+""));
	String colour = src1.getCssValue("background-color");
	
	if(colour.equals("rgb(0, 255, 0)"))
	{
		break;
	}
	}
	}
	
	//String colour = driver.findElement(By.id("box4")).getCssValue("background-color");
	//System.out.println(colour);

	//if(colour.contains("rgba"))
	//{
	//	break;
	//}
	
}

}
