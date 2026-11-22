package TestFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement closePopup = d.findElement(By.xpath("//span[contains(.,'✕')]"));
		closePopup.click();
		Thread.sleep(2000);
		
		WebElement login = d.findElement(By.xpath("//span[contains(.,'Login')]"));
		login.click();
		Thread.sleep(2000);
		
		WebElement phone = d.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("8895478851");

  }
	
}
