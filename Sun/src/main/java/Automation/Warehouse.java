package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Warehouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/Admin/Order/List");
		//driver.findElement(By.xpath("//input[@class=\\\"email valid\\\"]")).sendKeys("admin@yourstore.com");
		//driver.findElement(By.xpath("//input[@class='password valid']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//select[@id='WarehouseId']"));
	
		Select drpdwn = new Select(driver.findElement(By.xpath("//select[@id='WarehouseId']")));
		drpdwn.selectByValue("2");
		
	}

}
