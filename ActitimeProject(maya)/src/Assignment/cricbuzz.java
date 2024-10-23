package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricbuzz {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/100265/ind-vs-nz-1st-test-new-zealand-tour-of-india-2024");
		for(int i=3;i<14;i++)
		{
			
			WebElement text = driver.findElement(By.xpath("(//div[text()='Batter'])[1]/../../div["+i+"]/div[1]/a[contains(@title,'View profile of')]"));
			WebElement run = driver.findElement(By.xpath("//a[contains(@title,'View profile')]/../../div["+i+"]"));
			String player = text.getText();
			String runs = run.getText();
			System.out.println(player+"====>"+runs);
		
		}
	}

}
