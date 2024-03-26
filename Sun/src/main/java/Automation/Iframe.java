package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Iframe {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get( " https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.findElement(By.id("s")).sendKeys("Webdriver");
		
		//driver.findElement(By.xpath("//iframe[@id=\"google_esf\"]"));
		driver.findElement(By.xpath("//img[@width=\"460\" and @height=\"290\" and @src=\"https://i2.wp.com/www.globalsqa.com/wp-content/uploads/2016/02/SAPHybris.png?resize=460%2C290&ssl=1\"]")).click();
	}
	}